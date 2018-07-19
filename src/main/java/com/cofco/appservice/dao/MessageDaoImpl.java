package com.cofco.appservice.dao;

import com.cofco.appservice.bean.MessageBean;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
*@Author: Great Han
*@Description: 处理消息接口
*@Date: 14:44 2018/7/16
*@email:315807323@qq.com
*/
public class MessageDaoImpl extends HibernateDaoSupport implements MessageDao {

    /**
     * 获取消息
     * @param uid
     * @return
     */
    public List<MessageBean> getMessage(String uid) {
        List<MessageBean> messages = (List<MessageBean>) this.getHibernateTemplate().find("from MessageBean where uid=?",uid);

        return messages;
    }
}
