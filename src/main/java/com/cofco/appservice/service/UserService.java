package com.cofco.appservice.service;

import com.cofco.appservice.bean.RestFulBean;
import com.cofco.appservice.bean.UserBean;
import com.cofco.appservice.util.RestFulUtil;
import com.cofco.appservice.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ywl5320 on 2017/10/12.
 */
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    /*public RestFulBean<UserBean> registorServer(UserBean userBean)
    {
        UserBean user = userDao.getUser(userBean.getPhone());
        if(user != null)
        {
            return RestFulUtil.getInstance().getResuFulBean(null, 1, "已经注册过了");
        }
        else
        {

            user = userDao.registor(userBean);
            if(user != null)
            {
                return RestFulUtil.getInstance().getResuFulBean(user, 0, "注册成功");
            }
            else{
                return RestFulUtil.getInstance().getResuFulBean(null, 1, "注册失败");
            }
        }

    }*/

    public RestFulBean<UserBean> login(String username, String usercode)
    {
        UserBean user = userDao.login(username, usercode);
        if(user != null)
        {
            return RestFulUtil.getInstance().getResuFulBean(user, 200, "登录成功");
        }
        else
        {
            return RestFulUtil.getInstance().getResuFulBean(null, 201, "用户不存在");
        }
    }

}
