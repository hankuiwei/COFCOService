package com.cofco.appservice.action;

import com.cofco.appservice.bean.RestFulBean;
import com.cofco.appservice.bean.UserBean;
import com.cofco.appservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ywl on 2017-10-2.
 */
@Controller
@RequestMapping("/user")
public class UserAction {

    @Autowired
    private UserService userService;



    /*@ResponseBody
    @RequestMapping(value="/register.do", method= RequestMethod.PUT)
    public RestFulBean<UserBean> register(@RequestBody UserBean userBean)
    {
        //System.out.println("phone:" + userBean.getPhone());
        return userService.registorServer(userBean);
    }*/

    /**
     * @api {post} /user/loginbypwd.do  用户登陆
     * @apiParam {String} username 用户名（必填）
     * @apiParam {String} usercode 用户密码（必填）
     * @apiGroup User
     * @apiSuccessExample
     * {
     *     "status": 200,
     *     "data": {
     *         "username": "admin",
     *         "uid": "1",
     *         "user_code": "123456",
     *         "photo": null,
     *         "creative_num": null,
     *         "credit_num": null,
     *         "token": null
     *     },
     *     "msg": "登录成功"
     * }
     */
    @ResponseBody
    @RequestMapping(value="/loginbypwd.do", method= RequestMethod.POST)
    public RestFulBean<UserBean> loginByPwd(String username, String usercode)
    {
        System.out.println("username:" + username);
        return userService.login(username, usercode);
    }

}
