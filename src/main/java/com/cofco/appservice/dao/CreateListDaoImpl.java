package com.cofco.appservice.dao;

import com.cofco.appservice.bean.CreateLBean;
import com.cofco.appservice.bean.UserBean;
import com.cofco.appservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.applet.AudioClip;
import java.util.List;
/**
*@Author: Great Han
*@Description: 实现创意列表业务数据
*@Date: 13:53 2018/7/18
*@email:315807323@qq.com
*/
public class CreateListDaoImpl extends HibernateDaoSupport implements CreateListDao {

    @Autowired
    private UserDao userDao;

    /**
     * 获取创意详情
     * @param uid 用户Id
     * @param createId  创意Id
     * @return  详情信息
     */
    public CreateLBean getCreateInfo(String uid, int createId) {
        UserBean userBean = userDao.getUser(uid);
        if (userBean != null){
            List<CreateLBean> createLBeans = (List<CreateLBean>) this.getHibernateTemplate().find("from CreateLBean where creative_id = ?",createId);
            if (createLBeans != null && createLBeans.size() > 0){
                return createLBeans.get(0);
            } else {
                return null;
            }
        }
            return null;
    }

    /**
     * 查询创意列表数据
     * @return
     */
    public List<CreateLBean> getCreateList() {
        List<CreateLBean> createLBeans = (List<CreateLBean>) this.getHibernateTemplate().find("from CreateLBean ");
        return createLBeans;
    }
}
