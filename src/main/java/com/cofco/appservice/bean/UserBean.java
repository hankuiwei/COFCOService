package com.cofco.appservice.bean;


/**
 * Created by ywl5320 on 2017/10/12.
 */
public class UserBean extends BaseBean{

    private String username;
    private String uid;
    private String user_code;
    private String photo;
    private String creative_num;
    private String credit_num;
    private String token;

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getCreative_num() {
        return creative_num;
    }

    public void setCreative_num(String creative_num) {
        this.creative_num = creative_num;
    }

    public String getCredit_num() {
        return credit_num;
    }

    public void setCredit_num(String credit_num) {
        this.credit_num = credit_num;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }




    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }



    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
