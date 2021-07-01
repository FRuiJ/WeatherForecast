package com.example.weatherforecastone.Bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherBean {

    /**
     * reason : 查询成功!
     * result : {"city":"九江","realtime":{
     * "temperature":"25",
     * "humidity":"99",
     * "info":"小雨",
     * "wid":"07",
     * "direct":"东南风",
     * "power":"1级",
     * "aqi":"13"},
     * "future":[{"date":"2021-07-01",
     * "temperature":"23/27℃",
     * "weather":"暴雨转中雨",
     * "wid":{"day":"10","night":"08"},
     * "direct":"南风"},
     * {"date":"2021-07-02","temperature":"24/28℃","weather":"大雨","wid":{"day":"09","night":"09"},"direct":"南风"},{"date":"2021-07-03","temperature":"25/29℃","weather":"小雨","wid":{"day":"07","night":"07"},"direct":"南风"},{"date":"2021-07-04","temperature":"26/33℃","weather":"小雨","wid":{"day":"07","night":"07"},"direct":"东风转东南风"},{"date":"2021-07-05","temperature":"27/33℃","weather":"多云","wid":{"day":"01","night":"01"},"direct":"南风"}]}
     * error_code : 0
     */

    @SerializedName("reason")
    private String reason;
    @SerializedName("result")
    private ResultDTO result;
    @SerializedName("error_code")
    private Integer errorCode;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultDTO getResult() {
        return result;
    }

    public void setResult(ResultDTO result) {
        this.result = result;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public static class ResultDTO {
        /**
         * city : 九江
         * realtime : {"temperature":"25","humidity":"99","info":"小雨","wid":"07","direct":"东南风","power":"1级","aqi":"13"}
         * future : [{"date":"2021-07-01","temperature":"23/27℃","weather":"暴雨转中雨","wid":{"day":"10","night":"08"},"direct":"南风"},{"date":"2021-07-02","temperature":"24/28℃","weather":"大雨","wid":{"day":"09","night":"09"},"direct":"南风"},{"date":"2021-07-03","temperature":"25/29℃","weather":"小雨","wid":{"day":"07","night":"07"},"direct":"南风"},{"date":"2021-07-04","temperature":"26/33℃","weather":"小雨","wid":{"day":"07","night":"07"},"direct":"东风转东南风"},{"date":"2021-07-05","temperature":"27/33℃","weather":"多云","wid":{"day":"01","night":"01"},"direct":"南风"}]
         */

        @SerializedName("city")
        private String city;
        @SerializedName("realtime")
        private RealtimeDTO realtime;
        @SerializedName("future")
        private List<FutureDTO> future;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public RealtimeDTO getRealtime() {
            return realtime;
        }

        public void setRealtime(RealtimeDTO realtime) {
            this.realtime = realtime;
        }

        public List<FutureDTO> getFuture() {
            return future;
        }

        public void setFuture(List<FutureDTO> future) {
            this.future = future;
        }

        public static class RealtimeDTO {
            /**
             * temperature : 25
             * humidity : 99
             * info : 小雨
             * wid : 07
             * direct : 东南风
             * power : 1级
             * aqi : 13
             */

            @SerializedName("temperature")
            private String temperature;
            @SerializedName("humidity")
            private String humidity;
            @SerializedName("info")
            private String info;
            @SerializedName("wid")
            private String wid;
            @SerializedName("direct")
            private String direct;
            @SerializedName("power")
            private String power;
            @SerializedName("aqi")
            private String aqi;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getWid() {
                return wid;
            }

            public void setWid(String wid) {
                this.wid = wid;
            }

            public String getDirect() {
                return direct;
            }

            public void setDirect(String direct) {
                this.direct = direct;
            }

            public String getPower() {
                return power;
            }

            public void setPower(String power) {
                this.power = power;
            }

            public String getAqi() {
                return aqi;
            }

            public void setAqi(String aqi) {
                this.aqi = aqi;
            }
        }

        public static class FutureDTO {
            /**
             * date : 2021-07-01
             * temperature : 23/27℃
             * weather : 暴雨转中雨
             * wid : {"day":"10","night":"08"}
             * direct : 南风
             */

            @SerializedName("date")
            private String date;
            @SerializedName("temperature")
            private String temperature;
            @SerializedName("weather")
            private String weather;
            @SerializedName("wid")
            private WidDTO wid;
            @SerializedName("direct")
            private String direct;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WidDTO getWid() {
                return wid;
            }

            public void setWid(WidDTO wid) {
                this.wid = wid;
            }

            public String getDirect() {
                return direct;
            }

            public void setDirect(String direct) {
                this.direct = direct;
            }

            public static class WidDTO {
                /**
                 * day : 10
                 * night : 08
                 */

                @SerializedName("day")
                private String day;
                @SerializedName("night")
                private String night;

                public String getDay() {
                    return day;
                }

                public void setDay(String day) {
                    this.day = day;
                }

                public String getNight() {
                    return night;
                }

                public void setNight(String night) {
                    this.night = night;
                }
            }
        }
    }
}
