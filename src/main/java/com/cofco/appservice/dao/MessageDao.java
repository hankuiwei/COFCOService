package com.cofco.appservice.dao;

import com.cofco.appservice.bean.MessageBean;
import java.util.List;

/**
*@Author: Great Han
*@Description:
*@Date: 14:44 2018/7/16
*@email:315807323@qq.com
*/
public interface MessageDao {
    /**
     * 根据uid查询消息
     * @param uid
     * @return
     */
    List<MessageBean> getMessage(String uid);
}
