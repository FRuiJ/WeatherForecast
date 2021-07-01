package com.example.weatherforecastone.Bean;

import com.google.gson.annotations.SerializedName;

public class IndexBean {

    /**
     * reason : 查询成功
     * result : {"city":"九江","life":{"kongtiao":{"v":"较少开启",
     * "des":"您将感到很舒适，一般不需要开启空调。"},
     * "guomin":{"v":"极不易发","des":"天气条件极不易诱发过敏，有较强降水，空气湿润，出行注意携带雨具。"},
     * "shushidu":{"v":"较不舒适","des":"白天虽然有雨，但仍无法削弱较高气温带来的暑意，同时降雨造成湿度加大会您感到有些闷热，不很舒适。"},
     * "chuanyi":{"v":"舒适","des":"建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。"},
     * "diaoyu":{"v":"不宜","des":"天气不好，不适合垂钓。"},
     * "ganmao":{"v":"易发","des":"相对于今天将会出现大幅度降温，空气湿度较大，易发生感冒，请注意适当增加衣服。"},
     * "ziwaixian":{"v":"最弱","des":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"},
     * "xiche":{"v":"不宜","des":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},
     * "yundong":{"v":"较不宜","des":"有较强降水，建议您选择在室内进行健身休闲运动。"},
     * "daisan":{"v":"带伞","des":"有较强降水，您在外出的时候一定要带雨伞，以免被雨水淋湿。"}}}
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
         * life : {"kongtiao":{"v":"较少开启","des":"您将感到很舒适，一般不需要开启空调。"},"guomin":{"v":"极不易发","des":"天气条件极不易诱发过敏，有较强降水，空气湿润，出行注意携带雨具。"},"shushidu":{"v":"较不舒适","des":"白天虽然有雨，但仍无法削弱较高气温带来的暑意，同时降雨造成湿度加大会您感到有些闷热，不很舒适。"},"chuanyi":{"v":"舒适","des":"建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。"},"diaoyu":{"v":"不宜","des":"天气不好，不适合垂钓。"},"ganmao":{"v":"易发","des":"相对于今天将会出现大幅度降温，空气湿度较大，易发生感冒，请注意适当增加衣服。"},"ziwaixian":{"v":"最弱","des":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"},"xiche":{"v":"不宜","des":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},"yundong":{"v":"较不宜","des":"有较强降水，建议您选择在室内进行健身休闲运动。"},"daisan":{"v":"带伞","des":"有较强降水，您在外出的时候一定要带雨伞，以免被雨水淋湿。"}}
         */

        @SerializedName("city")
        private String city;
        @SerializedName("life")
        private LifeDTO life;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public LifeDTO getLife() {
            return life;
        }

        public void setLife(LifeDTO life) {
            this.life = life;
        }

        public static class LifeDTO {
            /**
             * kongtiao : {"v":"较少开启","des":"您将感到很舒适，一般不需要开启空调。"}
             * guomin : {"v":"极不易发","des":"天气条件极不易诱发过敏，有较强降水，空气湿润，出行注意携带雨具。"}
             * shushidu : {"v":"较不舒适","des":"白天虽然有雨，但仍无法削弱较高气温带来的暑意，同时降雨造成湿度加大会您感到有些闷热，不很舒适。"}
             * chuanyi : {"v":"舒适","des":"建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。"}
             * diaoyu : {"v":"不宜","des":"天气不好，不适合垂钓。"}
             * ganmao : {"v":"易发","des":"相对于今天将会出现大幅度降温，空气湿度较大，易发生感冒，请注意适当增加衣服。"}
             * ziwaixian : {"v":"最弱","des":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"}
             * xiche : {"v":"不宜","des":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"}
             * yundong : {"v":"较不宜","des":"有较强降水，建议您选择在室内进行健身休闲运动。"}
             * daisan : {"v":"带伞","des":"有较强降水，您在外出的时候一定要带雨伞，以免被雨水淋湿。"}
             */

            @SerializedName("kongtiao")
            private KongtiaoDTO kongtiao;
            @SerializedName("guomin")
            private GuominDTO guomin;
            @SerializedName("shushidu")
            private ShushiduDTO shushidu;
            @SerializedName("chuanyi")
            private ChuanyiDTO chuanyi;
            @SerializedName("diaoyu")
            private DiaoyuDTO diaoyu;
            @SerializedName("ganmao")
            private GanmaoDTO ganmao;
            @SerializedName("ziwaixian")
            private ZiwaixianDTO ziwaixian;
            @SerializedName("xiche")
            private XicheDTO xiche;
            @SerializedName("yundong")
            private YundongDTO yundong;
            @SerializedName("daisan")
            private DaisanDTO daisan;

            public KongtiaoDTO getKongtiao() {
                return kongtiao;
            }

            public void setKongtiao(KongtiaoDTO kongtiao) {
                this.kongtiao = kongtiao;
            }

            public GuominDTO getGuomin() {
                return guomin;
            }

            public void setGuomin(GuominDTO guomin) {
                this.guomin = guomin;
            }

            public ShushiduDTO getShushidu() {
                return shushidu;
            }

            public void setShushidu(ShushiduDTO shushidu) {
                this.shushidu = shushidu;
            }

            public ChuanyiDTO getChuanyi() {
                return chuanyi;
            }

            public void setChuanyi(ChuanyiDTO chuanyi) {
                this.chuanyi = chuanyi;
            }

            public DiaoyuDTO getDiaoyu() {
                return diaoyu;
            }

            public void setDiaoyu(DiaoyuDTO diaoyu) {
                this.diaoyu = diaoyu;
            }

            public GanmaoDTO getGanmao() {
                return ganmao;
            }

            public void setGanmao(GanmaoDTO ganmao) {
                this.ganmao = ganmao;
            }

            public ZiwaixianDTO getZiwaixian() {
                return ziwaixian;
            }

            public void setZiwaixian(ZiwaixianDTO ziwaixian) {
                this.ziwaixian = ziwaixian;
            }

            public XicheDTO getXiche() {
                return xiche;
            }

            public void setXiche(XicheDTO xiche) {
                this.xiche = xiche;
            }

            public YundongDTO getYundong() {
                return yundong;
            }

            public void setYundong(YundongDTO yundong) {
                this.yundong = yundong;
            }

            public DaisanDTO getDaisan() {
                return daisan;
            }

            public void setDaisan(DaisanDTO daisan) {
                this.daisan = daisan;
            }

            public static class KongtiaoDTO {
                /**
                 * v : 较少开启
                 * des : 您将感到很舒适，一般不需要开启空调。
                 */

                @SerializedName("v")
                private String v;
                @SerializedName("des")
                private String des;

                public String getV() {
                    return v;
                }

                public void setV(String v) {
                    this.v = v;
                }

                public String getDes() {
                    return des;
                }

                public void setDes(String des) {
                    this.des = des;
                }
            }

            public static class GuominDTO {
                /**
                 * v : 极不易发
                 * des : 天气条件极不易诱发过敏，有较强降水，空气湿润，出行注意携带雨具。
                 */

                @SerializedName("v")
                private String v;
                @SerializedName("des")
                private String des;

                public String getV() {
                    return v;
                }

                public void setV(String v) {
                    this.v = v;
                }

                public String getDes() {
                    return des;
                }

                public void setDes(String des) {
                    this.des = des;
                }
            }

            public static class ShushiduDTO {
                /**
                 * v : 较不舒适
                 * des : 白天虽然有雨，但仍无法削弱较高气温带来的暑意，同时降雨造成湿度加大会您感到有些闷热，不很舒适。
                 */

                @SerializedName("v")
                private String v;
                @SerializedName("des")
                private String des;

                public String getV() {
                    return v;
                }

                public void setV(String v) {
                    this.v = v;
                }

                public String getDes() {
                    return des;
                }

                public void setDes(String des) {
                    this.des = des;
                }
            }

            public static class ChuanyiDTO {
                /**
                 * v : 舒适
                 * des : 建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。
                 */

                @SerializedName("v")
                private String v;
                @SerializedName("des")
                private String des;

                public String getV() {
                    return v;
                }

                public void setV(String v) {
                    this.v = v;
                }

                public String getDes() {
                    return des;
                }

                public void setDes(String des) {
                    this.des = des;
                }
            }

            public static class DiaoyuDTO {
                /**
                 * v : 不宜
                 * des : 天气不好，不适合垂钓。
                 */

                @SerializedName("v")
                private String v;
                @SerializedName("des")
                private String des;

                public String getV() {
                    return v;
                }

                public void setV(String v) {
                    this.v = v;
                }

                public String getDes() {
                    return des;
                }

                public void setDes(String des) {
                    this.des = des;
                }
            }

            public static class GanmaoDTO {
                /**
                 * v : 易发
                 * des : 相对于今天将会出现大幅度降温，空气湿度较大，易发生感冒，请注意适当增加衣服。
                 */

                @SerializedName("v")
                private String v;
                @SerializedName("des")
                private String des;

                public String getV() {
                    return v;
                }

                public void setV(String v) {
                    this.v = v;
                }

                public String getDes() {
                    return des;
                }

                public void setDes(String des) {
                    this.des = des;
                }
            }

            public static class ZiwaixianDTO {
                /**
                 * v : 最弱
                 * des : 属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。
                 */

                @SerializedName("v")
                private String v;
                @SerializedName("des")
                private String des;

                public String getV() {
                    return v;
                }

                public void setV(String v) {
                    this.v = v;
                }

                public String getDes() {
                    return des;
                }

                public void setDes(String des) {
                    this.des = des;
                }
            }

            public static class XicheDTO {
                /**
                 * v : 不宜
                 * des : 不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。
                 */

                @SerializedName("v")
                private String v;
                @SerializedName("des")
                private String des;

                public String getV() {
                    return v;
                }

                public void setV(String v) {
                    this.v = v;
                }

                public String getDes() {
                    return des;
                }

                public void setDes(String des) {
                    this.des = des;
                }
            }

            public static class YundongDTO {
                /**
                 * v : 较不宜
                 * des : 有较强降水，建议您选择在室内进行健身休闲运动。
                 */

                @SerializedName("v")
                private String v;
                @SerializedName("des")
                private String des;

                public String getV() {
                    return v;
                }

                public void setV(String v) {
                    this.v = v;
                }

                public String getDes() {
                    return des;
                }

                public void setDes(String des) {
                    this.des = des;
                }
            }

            public static class DaisanDTO {
                /**
                 * v : 带伞
                 * des : 有较强降水，您在外出的时候一定要带雨伞，以免被雨水淋湿。
                 */

                @SerializedName("v")
                private String v;
                @SerializedName("des")
                private String des;

                public String getV() {
                    return v;
                }

                public void setV(String v) {
                    this.v = v;
                }

                public String getDes() {
                    return des;
                }

                public void setDes(String des) {
                    this.des = des;
                }
            }
        }
    }
}
