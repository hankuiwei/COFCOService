package com.cofco.appservice.dao;

import com.cofco.appservice.bean.UserBean;

/**
 * Created by ywl5320 on 2017/10/12.
 */
public interface UserDao {

    /**
     * 注册
     * @param userBean
     */
    //UserBean registor(UserBean userBean);

    /**
     * 登陆
     * @return
     */
    UserBean login(String username, String usercode);

    /**
     * 根据id获取用户信息
     * @param uid
     * @return
     */
    UserBean getUser(String uid);

}
