package com.lenovo.smarttraffic.bean;

import java.util.List;

public class Line {
    /**
     * ERRMSG : 成功
     * ROWS_DETAIL : [{"id":1,"name":"地铁1号线","map":"/images/metro/metro_001.png","sites":["迈皋桥","红山动物园","南京站","新模范马路","玄武门","鼓楼","珠江路","新街口","张府园","三山街","中华门","安德门","天隆寺","软件大道","花神庙","南京南站","双龙大道","河定桥","胜太路","百家湖","小龙湾","竹山路","天印大道","龙眠大道","南医大江苏经贸学院站","南京交院","中国药科大学"],"time":[{"site":"迈皋桥","starttime":"05:42:00","endtime":"23:19:00"},{"site":"中国药科大学","starttime":"05:47:00","endtime":"23:27:00"}],"transfersites":["新街口","鼓楼","南京站","南京南站","安德门"]},{"id":2,"name":"地铁2号线","map":"/images/metro/metro_002.png","sites":["油坊桥","雨润大街","元通","奥体东","兴隆大街","集庆门大街","云锦路","莫愁湖","汉中门","上海路","新街口","大行宫","西安门","明故宫","苜蓿园","下马坊","孝陵卫","钟灵街","马群","金马路","仙鹤门","学则路","仙林中心","羊山公园","南大仙林校区","经天路"],"time":[{"site":"油坊桥","starttime":"05:47:00","endtime":"23:27:00"},{"site":"经天路","starttime":"05:42:00","endtime":"23:19:00"}],"transfersites":["新街口","油坊桥","元通"]},{"id":3,"name":"地铁3号线","map":"/images/metro/metro_003.png","sites":["林场","星火路","东大成贤学院","泰冯路","天润城","柳州东路","上元门","五塘广场","小市","南京站","南京林业大学·新庄","鸡鸣寺","浮桥","大行宫","常府街","夫子庙","武定门","雨花门","卡子门","大明路","明发广场","南京南站","宏运大道","胜太西路","天元西路","九龙湖","诚信大道","东大九龙湖校区","秣周东路"],"time":[{"site":"林场","starttime":"05:47:00","endtime":"23:27:00"},{"site":"秣周东路","starttime":"05:42:00","endtime":"23:19:00"}],"transfersites":["南京南站","鸡鸣寺","泰冯路","南京站","大行宫\r\n"]},{"id":4,"name":"地铁S1号线(机场线)","map":"/images/metro/metro_004.png","sites":["南京南站","翠屏山","佛城西路","吉印大道","正方中路","翔宇路北","翔宇路南","禄口机场"],"time":[{"site":"南京南站","starttime":"05:47:00","endtime":"23:27:00"},{"site":"禄口机场","starttime":"05:42:00","endtime":"23:19:00"}],"transfersites":["南京南站"]},{"id":5,"name":"地铁4号线","map":"/images/metro/metro_005.png","sites":["龙江","南艺·二师·草场","云南路","鼓楼","鸡鸣寺","九华山","岗子村","蒋王庙","王家湾","聚宝山","苏宁总部·徐庄","金马路","汇通路","灵山","东流","孟北","西岗桦墅","仙林湖"],"time":[{"site":"龙江","starttime":"05:47:00","endtime":"23:27:00"},{"site":"仙林湖","starttime":"05:42:00","endtime":"23:19:00"}],"transfersites":["鼓楼","鸡鸣寺","金马路"]},{"id":6,"name":"地铁10号线","map":"/images/metro/metro_006.png","sites":["安德门","小行","中胜","元通","奥体中心","梦都大街","绿博园","江心洲","临江路","浦口万汇城","南京工业大学","龙华路","文德路","雨山路"],"time":[{"site":"安德门","starttime":"05:47:00","endtime":"23:27:00"},{"site":"雨山路","starttime":"05:42:00","endtime":"23:19:00"}],"transfersites":["安德门","元通"]},{"id":7,"name":"地铁S8号线(宁天城际)","map":"/images/metro/metro_007.png","sites":["泰山新村","泰冯路","高新开发区","信息工程大学","卸甲甸","大厂","葛塘","长芦","化工园","六合开发区","龙池","雄州","凤凰山公园","方州广场","沈桥","八百桥","金牛湖"],"time":[{"site":"金牛湖","starttime":"05:47:00","endtime":"23:27:00"},{"site":"泰山新村","starttime":"05:42:00","endtime":"23:19:00"}],"transfersites":["泰冯路"]},{"id":8,"name":"地铁S3号线(宁和城际)","map":"/images/metro/metro_008.png","sites":["高家冲","林山","桥林新城","石碛河","双垅","兰花塘","马骡圩","刘村","天保","高庙路","吴候街","平良大街","永初路","油坊桥","贾西","春江路","铁心桥","景明佳园","南京南站"],"time":[{"site":"南京南站","starttime":"05:47:00","endtime":"23:27:00"},{"site":"高家冲","starttime":"05:42:00","endtime":"23:19:00"}],"transfersites":["南京南站","油坊桥"]}]
     * RESULT : S
     */

    private String ERRMSG;
    private String RESULT;
    private List<ROWSDETAILBean> ROWS_DETAIL;

    public String getERRMSG() {
        return ERRMSG;
    }

    public void setERRMSG(String ERRMSG) {
        this.ERRMSG = ERRMSG;
    }

    public String getRESULT() {
        return RESULT;
    }

    public void setRESULT(String RESULT) {
        this.RESULT = RESULT;
    }

    public List<ROWSDETAILBean> getROWS_DETAIL() {
        return ROWS_DETAIL;
    }

    public void setROWS_DETAIL(List<ROWSDETAILBean> ROWS_DETAIL) {
        this.ROWS_DETAIL = ROWS_DETAIL;
    }

    public static class ROWSDETAILBean {
        /**
         * id : 1
         * name : 地铁1号线
         * map : /images/metro/metro_001.png
         * sites : ["迈皋桥","红山动物园","南京站","新模范马路","玄武门","鼓楼","珠江路","新街口","张府园","三山街","中华门","安德门","天隆寺","软件大道","花神庙","南京南站","双龙大道","河定桥","胜太路","百家湖","小龙湾","竹山路","天印大道","龙眠大道","南医大江苏经贸学院站","南京交院","中国药科大学"]
         * time : [{"site":"迈皋桥","starttime":"05:42:00","endtime":"23:19:00"},{"site":"中国药科大学","starttime":"05:47:00","endtime":"23:27:00"}]
         * transfersites : ["新街口","鼓楼","南京站","南京南站","安德门"]
         */

        private int id;
        private String name;
        private String map;
        private List<String> sites;
        private List<TimeBean> time;
        private List<String> transfersites;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMap() {
            return map;
        }

        public void setMap(String map) {
            this.map = map;
        }

        public List<String> getSites() {
            return sites;
        }

        public void setSites(List<String> sites) {
            this.sites = sites;
        }

        public List<TimeBean> getTime() {
            return time;
        }

        public void setTime(List<TimeBean> time) {
            this.time = time;
        }

        public List<String> getTransfersites() {
            return transfersites;
        }

        public void setTransfersites(List<String> transfersites) {
            this.transfersites = transfersites;
        }

        public static class TimeBean {
            /**
             * site : 迈皋桥
             * starttime : 05:42:00
             * endtime : 23:19:00
             */

            private String site;
            private String starttime;
            private String endtime;

            public String getSite() {
                return site;
            }

            public void setSite(String site) {
                this.site = site;
            }

            public String getStarttime() {
                return starttime;
            }

            public void setStarttime(String starttime) {
                this.starttime = starttime;
            }

            public String getEndtime() {
                return endtime;
            }

            public void setEndtime(String endtime) {
                this.endtime = endtime;
            }
        }
    }
}
