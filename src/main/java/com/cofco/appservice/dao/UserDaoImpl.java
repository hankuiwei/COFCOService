package com.cofco.appservice.dao;

import com.cofco.appservice.bean.UserBean;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by ywl5320 on 2017/10/12.
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    public UserBean login(String username, String usercode) {
        List<UserBean> users = (List<UserBean>) this.getHibernateTemplate().find("from UserBean where username=? and user_code=?", username, usercode);
        if(users != null && users.size() > 0)
        {
            return users.get(0);
        }
        return null;
    }

    /*public UserBean registor(UserBean userBean) {
        this.getHibernateTemplate().save(userBean);
        return getUser(userBean.getPhone());
    }*/

    public UserBean getUser(String uid) {
        List<UserBean> users = (List<UserBean>) this.getHibernateTemplate().find("from UserBean where uid=?", uid);
        if(users != null && users.size() > 0)
        {
            return users.get(0);
        }
        return null;
    }
}
