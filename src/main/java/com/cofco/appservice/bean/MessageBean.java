package com.cofco.appservice.bean;

import java.util.List;



public class MessageBean extends BaseBean {


    //private List<>

    private int id;
    private String to_uid;
    /*private String description;
    private String published;*/
    private String title;
    private String content;
    private String mktime;
    private String status_type;
    //private List<MessageBean> messageBeans;

  /*  public List<MessageBean> getMessageBeans() {
        return messageBeans;
    }

    public void setMessageBeans(List<MessageBean> messageBeans) {
        this.messageBeans = messageBeans;
    }
*/


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTo_uid() {
        return to_uid;
    }

    public void setTo_uid(String to_uid) {
        this.to_uid = to_uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMktime() {
        return mktime;
    }

    public void setMktime(String mktime) {
        this.mktime = mktime;
    }

    public String getStatus_type() {
        return status_type;
    }

    public void setStatus_type(String status_type) {
        this.status_type = status_type;
    }
}
