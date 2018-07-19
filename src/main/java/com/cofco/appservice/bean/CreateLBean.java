package com.cofco.appservice.bean;
/**
*@Author: Great Han
*@Description: 创意列表
*@Date: 13:47 2018/7/18
*@email:315807323@qq.com
*/
public class CreateLBean extends BaseBean {


    private int id;

    private int creative_id;

    private String creative_name;

    private String creative_description;

    private int sort_id;

    private String creative_type;

    private String collect_num;

    private String praise_num;

    private int collect_id;

    private String comment_num;

    private String create_time;

    private String[] photo;

    private int vote_status;

    private boolean collect_status;

    private boolean praise_status;

    private boolean comment_status;

    private int vote_num;

    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreative_id() {
        return creative_id;
    }

    public void setCreative_id(int creative_id) {
        this.creative_id = creative_id;
    }

    public String getCreative_name() {
        return creative_name;
    }

    public void setCreative_name(String creative_name) {
        this.creative_name = creative_name;
    }

    public String getCreative_description() {
        return creative_description;
    }

    public void setCreative_description(String creative_description) {
        this.creative_description = creative_description;
    }

    public int getSort_id() {
        return sort_id;
    }

    public void setSort_id(int sort_id) {
        this.sort_id = sort_id;
    }

    public String getCreative_type() {
        return creative_type;
    }

    public void setCreative_type(String creative_type) {
        this.creative_type = creative_type;
    }

    public String getCollect_num() {
        return collect_num;
    }

    public void setCollect_num(String collect_num) {
        this.collect_num = collect_num;
    }

    public String getPraise_num() {
        return praise_num;
    }

    public void setPraise_num(String praise_num) {
        this.praise_num = praise_num;
    }

    public int getCollect_id() {
        return collect_id;
    }

    public void setCollect_id(int collect_id) {
        this.collect_id = collect_id;
    }

    public String getComment_num() {
        return comment_num;
    }

    public void setComment_num(String comment_num) {
        this.comment_num = comment_num;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String[] getPhoto() {
        return photo;
    }

    public void setPhoto(String[] photo) {
        this.photo = photo;
    }

    public int getVote_status() {
        return vote_status;
    }

    public void setVote_status(int vote_status) {
        this.vote_status = vote_status;
    }

    public boolean isCollect_status() {
        return collect_status;
    }

    public void setCollect_status(boolean collect_status) {
        this.collect_status = collect_status;
    }

    public boolean isPraise_status() {
        return praise_status;
    }

    public void setPraise_status(boolean praise_status) {
        this.praise_status = praise_status;
    }

    public boolean isComment_status() {
        return comment_status;
    }

    public void setComment_status(boolean comment_status) {
        this.comment_status = comment_status;
    }

    public int getVote_num() {
        return vote_num;
    }

    public void setVote_num(int vote_num) {
        this.vote_num = vote_num;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


}
