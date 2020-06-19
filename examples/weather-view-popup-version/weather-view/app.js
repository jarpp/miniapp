import { UI } from "@hyext/hy-ui";
import React, { Component } from "react";
import "./app.hycss";
import IMG_CONFIG from '../assets/index.js';

import genLayoutSizeParam from './genLayoutSizeParam'

let WEATHER_IMG = IMG_CONFIG.WEATHER_IMG;

const { View, Text, Image, ScrollView } = UI;

// 星期选项
let NUMBER_TRANSLATION = ["日", "一", "二", "三", "四", "五", "六"];

// 天气接口相关 config
let weatherUrl = "https://free-api.heweather.net/s6/weather";
let weatherType = "now";
let city = "guangzhou";
let Key = encodeURI("f816455070734768b757247924a44eef");

const CONTIANER_WIDTH = 400; // 小程序容器宽度，即设计稿上小程序的宽度,单位为px
const CONTAINER_HEIGHT = 600;// 小程序容器宽度，即设计稿上小程序的宽度,单位为px
const TOP = 100;  // 小程序距离播放器左上角的纵向距离，单位为px
const LEFT = 100; // 小程序距离播放器左上角的横向距离，单位为px
const APP_DESIGN_WIDTH = 750; //app端设计稿

const hyExt = global.hyExt;

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      weatherInfo: {},
      now: new Date(),
    };
  }

  componentDidMount() {
    this.getWeatherInfo();

    this.setLayout();
  }

  setLayout() {
    hyExt.context.onLayoutChange(({screenWidth, screenHeight}) => {

      let { x, y, width, height } = genLayoutSizeParam({
        containerWidth: CONTIANER_WIDTH,
        containerHeight: CONTAINER_HEIGHT,
        screenWidth,
        screenHeight,
        top: TOP,
        left: LEFT,
        designWidth: APP_DESIGN_WIDTH
      })

      let param = {
        visible: true,
        x,
        y,
        width,
        height,
        animate: true,
        alpha: 1
      }

      hyExt.panel.setLayout(param).then(() => {
        hyExt.logger.info('设置小程序布局成功')    
      }).catch(err => {
        hyExt.logger.info('设置小程序布局失败，错误信息：' + err.message)
      })
    })
  }

  // 获取天气 和风
  getWeatherInfo() {
    let args = [];
    args[0] = {};
    args[0].header = { "x-header": "foo" };
    args[0].url = `${weatherUrl}/${weatherType}?location=${city}&key=${Key}`;
    args[0].method = "GET";
    args[0].data = { foo: "bar" };
    args[0].dataType = "json";

    hyExt.logger.info("发送HTTP请求：" + JSON.stringify(args));

    hyExt
      .request(args[0])
      .then((resp) => {
        let weatherData = resp.data.HeWeather6 && resp.data.HeWeather6[0];
        this.setState({
          weatherInfo: Object.assign({}, weatherData.now),
        });
      })
      .catch((err) => {
        hyExt.logger.info("发送HTTP请求失败，错误信息：" + err.message);
      });
  }

  getTimeState = () => {
    // 获取当前时间
    let timeNow = new Date(); // 获取当前小时
    let hours = timeNow.getHours(); // 设置默认文字
    let text = ``; // 判断当前时间段
    if (hours >= 0 && hours <= 10) {
      text = `早上好`;
    } else if (hours > 10 && hours <= 14) {
      text = `中午好`;
    } else if (hours > 14 && hours <= 18) {
      text = `下午好`;
    } else if (hours > 18 && hours <= 24) {
      text = `晚上好`;
    }
    return text;
  };

  render() {
    const { weatherInfo, now } = this.state;
    return (
      <ScrollView className="app">
        <StreamerInfo />

        <View className="weather-contain">
          <View className="contain-left">
            <Image
              className="weather-img"
              mode="cover"
              src={WEATHER_IMG[`ICON_${weatherInfo["cond_code"] || 100}`]}
            ></Image>

            <Clock />

            <Text className="date">{`星期${
              NUMBER_TRANSLATION[now.getDay()]
            }, ${now.getFullYear()}年${now.getMonth()}月${now.getDate()}日`}</Text>
          </View>


          <View className="contain-right">
            <Text className="daily-time">{`${this.getTimeState()}`}</Text>

            <Text className="temperature">{`${weatherInfo.fl || "--"}度`}</Text>

            <Text className="weather">
              {`${weatherInfo["cond_txt"] || "--"}`} ,{" "}
              {`${weatherInfo["wind_dir"] || "--"}`}
            </Text>

          </View>
        </View>
      </ScrollView>
    );
  }
}

// 主播信息模块
class StreamerInfo extends Component {
  constructor(props) {
    super(props);
    this.state = {
      streamerInfo: {},
    };
  }

  componentDidMount() {
    this.getStreamerInfo();
  }

  // 获取主播信息
  getStreamerInfo() {
    hyExt.logger.info("获取当前直播间主播信息");
    hyExt.context
      .getStreamerInfo()
      .then((resp) => {
        this.setState({
          streamerInfo: Object.assign({}, resp),
        });
        hyExt.logger.info(
          "获取当前直播间主播信息成功，返回：" + JSON.stringify(resp)
        );
      })
      .catch((err) => {
        hyExt.logger.info(
          "获取当前直播间主播信息失败，错误信息：" + err.message
        );
      });
  }

  render() {
    const { streamerInfo } = this.state;

    return (
      <View className="header">
        <Image
          className="anchor-avatar"
          mode="cover"
          src={streamerInfo.streamerAvatarUrl}
        ></Image>
        <View className="anchor-info">
          <Text className="anchor-name">{streamerInfo.streamerNick}</Text>
          <Text className="anchor-id">Id: {streamerInfo.streamerRoomId}</Text>
        </View>
      </View>
    );
  }
}

// 时钟模块
class Clock extends Component {
  constructor(props) {
    super(props);
    this.state = {
      now: new Date(),
    };
  }
  componentDidMount() {
    this.timer = setInterval(() => {
      this.setState({
        now: new Date(),
      });
    }, 100);
  }

  componentWillUnmount() {
    this.timer && clearTimeout(this.timer);
  }

  leadingZero(number) {
    return number < 10 ? "0" + number : number;
  }

  render() {
    const { now } = this.state;
    return (
      <Text className="clock">{`${this.leadingZero(
        now.getHours()
      )} : ${this.leadingZero(now.getMinutes())} : ${this.leadingZero(
        now.getSeconds()
      )}`}</Text>
    );
  }
}

export default App;