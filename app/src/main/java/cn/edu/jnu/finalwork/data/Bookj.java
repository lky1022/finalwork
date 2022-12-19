package cn.edu.jnu.finalwork.data;

import java.util.List;

public class Bookj {


    private String resultcode;
    private String reason;
    private ResultBean result;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {

        private String totalNum;
        private int pn;
        private String rn;
        private List<DataBean> data;

        public String getTotalNum() {
            return totalNum;
        }

        public void setTotalNum(String totalNum) {
            this.totalNum = totalNum;
        }

        public int getPn() {
            return pn;
        }

        public void setPn(int pn) {
            this.pn = pn;
        }

        public String getRn() {
            return rn;
        }

        public void setRn(String rn) {
            this.rn = rn;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            private String title;
            private String catalog;
            private String tags;
            private String sub1;
            private String sub2;
            private String img;
            private String reading;
            private String online;
            private String bytime;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getCatalog() {
                return catalog;
            }

            public void setCatalog(String catalog) {
                this.catalog = catalog;
            }

            public String getTags() {
                return tags;
            }

            public void setTags(String tags) {
                this.tags = tags;
            }

            public String getSub1() {
                return sub1;
            }

            public void setSub1(String sub1) {
                this.sub1 = sub1;
            }

            public String getSub2() {
                return sub2;
            }

            public void setSub2(String sub2) {
                this.sub2 = sub2;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getReading() {
                return reading;
            }

            public void setReading(String reading) {
                this.reading = reading;
            }

            public String getOnline() {
                return online;
            }

            public void setOnline(String online) {
                this.online = online;
            }

            public String getBytime() {
                return bytime;
            }

            public void setBytime(String bytime) {
                this.bytime = bytime;
            }
        }
    }
}
