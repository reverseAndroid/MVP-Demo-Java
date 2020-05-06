package com.xjx.mvp.bean.response;

public class UserResponse {

    /**
     * code : 200
     * msg : The request is successful
     * data : {"user":{"id":296,"username":"qweqwe","password":null,"firstname":null,"lastname":null,"mobile":null,"email":null,"address":null,"portrait":null,"idcard":null,"version":null,"state":null,"preferrednotification":null,"preferreddashboardwidget":null,"language":null,"createtime":null,"lastupdatetime":null,"regionids":null,"roleid":0,"rolename":null,"regionname":null,"portraitfilename":null,"createby":null},"token":"DA7D72599719FE5BE18D62BB4137CEA00DA65AACB2738DB5A2A010A8BEEAF62EA065DAC2F95F0701116384CA6EF31F12B2248B27D9102A3F2CB3501FBE8D168EF3F61DE871A87F125FABE1155CA90FF8C48542A57B357F1E089A9B60F6FCE55F83B75DF9B90321C9466314FF4DFBAB5368546F8A1DFCE3D8"}
     */

    private String code;
    private String msg;
    private DataBean data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * user : {"id":296,"username":"qweqwe","password":null,"firstname":null,"lastname":null,"mobile":null,"email":null,"address":null,"portrait":null,"idcard":null,"version":null,"state":null,"preferrednotification":null,"preferreddashboardwidget":null,"language":null,"createtime":null,"lastupdatetime":null,"regionids":null,"roleid":0,"rolename":null,"regionname":null,"portraitfilename":null,"createby":null}
         * token : DA7D72599719FE5BE18D62BB4137CEA00DA65AACB2738DB5A2A010A8BEEAF62EA065DAC2F95F0701116384CA6EF31F12B2248B27D9102A3F2CB3501FBE8D168EF3F61DE871A87F125FABE1155CA90FF8C48542A57B357F1E089A9B60F6FCE55F83B75DF9B90321C9466314FF4DFBAB5368546F8A1DFCE3D8
         */

        private UserBean user;
        private String token;

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public static class UserBean {
            /**
             * id : 296
             * username : qweqwe
             * password : null
             * firstname : null
             * lastname : null
             * mobile : null
             * email : null
             * address : null
             * portrait : null
             * idcard : null
             * version : null
             * state : null
             * preferrednotification : null
             * preferreddashboardwidget : null
             * language : null
             * createtime : null
             * lastupdatetime : null
             * regionids : null
             * roleid : 0
             * rolename : null
             * regionname : null
             * portraitfilename : null
             * createby : null
             */

            private int id;
            private String username;
            private Object password;
            private Object firstname;
            private Object lastname;
            private Object mobile;
            private Object email;
            private Object address;
            private Object portrait;
            private Object idcard;
            private Object version;
            private Object state;
            private Object preferrednotification;
            private Object preferreddashboardwidget;
            private Object language;
            private Object createtime;
            private Object lastupdatetime;
            private Object regionids;
            private int roleid;
            private Object rolename;
            private Object regionname;
            private Object portraitfilename;
            private Object createby;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public Object getPassword() {
                return password;
            }

            public void setPassword(Object password) {
                this.password = password;
            }

            public Object getFirstname() {
                return firstname;
            }

            public void setFirstname(Object firstname) {
                this.firstname = firstname;
            }

            public Object getLastname() {
                return lastname;
            }

            public void setLastname(Object lastname) {
                this.lastname = lastname;
            }

            public Object getMobile() {
                return mobile;
            }

            public void setMobile(Object mobile) {
                this.mobile = mobile;
            }

            public Object getEmail() {
                return email;
            }

            public void setEmail(Object email) {
                this.email = email;
            }

            public Object getAddress() {
                return address;
            }

            public void setAddress(Object address) {
                this.address = address;
            }

            public Object getPortrait() {
                return portrait;
            }

            public void setPortrait(Object portrait) {
                this.portrait = portrait;
            }

            public Object getIdcard() {
                return idcard;
            }

            public void setIdcard(Object idcard) {
                this.idcard = idcard;
            }

            public Object getVersion() {
                return version;
            }

            public void setVersion(Object version) {
                this.version = version;
            }

            public Object getState() {
                return state;
            }

            public void setState(Object state) {
                this.state = state;
            }

            public Object getPreferrednotification() {
                return preferrednotification;
            }

            public void setPreferrednotification(Object preferrednotification) {
                this.preferrednotification = preferrednotification;
            }

            public Object getPreferreddashboardwidget() {
                return preferreddashboardwidget;
            }

            public void setPreferreddashboardwidget(Object preferreddashboardwidget) {
                this.preferreddashboardwidget = preferreddashboardwidget;
            }

            public Object getLanguage() {
                return language;
            }

            public void setLanguage(Object language) {
                this.language = language;
            }

            public Object getCreatetime() {
                return createtime;
            }

            public void setCreatetime(Object createtime) {
                this.createtime = createtime;
            }

            public Object getLastupdatetime() {
                return lastupdatetime;
            }

            public void setLastupdatetime(Object lastupdatetime) {
                this.lastupdatetime = lastupdatetime;
            }

            public Object getRegionids() {
                return regionids;
            }

            public void setRegionids(Object regionids) {
                this.regionids = regionids;
            }

            public int getRoleid() {
                return roleid;
            }

            public void setRoleid(int roleid) {
                this.roleid = roleid;
            }

            public Object getRolename() {
                return rolename;
            }

            public void setRolename(Object rolename) {
                this.rolename = rolename;
            }

            public Object getRegionname() {
                return regionname;
            }

            public void setRegionname(Object regionname) {
                this.regionname = regionname;
            }

            public Object getPortraitfilename() {
                return portraitfilename;
            }

            public void setPortraitfilename(Object portraitfilename) {
                this.portraitfilename = portraitfilename;
            }

            public Object getCreateby() {
                return createby;
            }

            public void setCreateby(Object createby) {
                this.createby = createby;
            }
        }
    }
}
