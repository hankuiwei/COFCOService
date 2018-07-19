package com.cofco.appservice.service;

import com.cofco.appservice.bean.MessageBean;
import com.cofco.appservice.bean.RestFulBean;
import com.cofco.appservice.dao.MessageDao;
import com.cofco.appservice.util.RestFulUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class MessageService {

    @Autowired
    private MessageDao messageDao;

    /**
     * 获取消息
     * @param uid  用户ID
     * @return 消息列
     */
    public RestFulBean<MessageBean> getMessage(String uid){

        List<MessageBean> messageBeans = messageDao.getMessage(uid);
        if (messageBeans != null && messageBeans.size() > 0 ){
            /*MessageBean bean = new MessageBean();
            bean.setMessageBeans(messageBeans);*/
            MessageData messageData = new MessageData();
            messageData.messageBeans = messageBeans;
            return RestFulUtil.getInstance().getResuFulBean(messageData ,200,"获取消息成功！");
        }else {
            return RestFulUtil.getInstance().getResuFulBean(null,201,"获取消息数据失败！");
        }

}
}

class MessageData {
    public List<MessageBean> messageBeans;
}
