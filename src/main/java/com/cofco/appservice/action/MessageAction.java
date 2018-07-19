package com.cofco.appservice.action;

import com.cofco.appservice.bean.MessageBean;
import com.cofco.appservice.bean.RestFulBean;
import com.cofco.appservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
*@Author: Great Han
*@Description:
*@Date: 11:43 2018/7/16
*@email:315807323@qq.com
*/
@Controller
@RequestMapping("/mess")
public class MessageAction {

    @Autowired
    private MessageService messageService;

    /**
    *@api {post} /mess/getMessageByuid 获取消息信息
    *@apiVersion 0.1.0
    *@apiName getMessageByuid
    *@apiGroup  Main
    *@apiDescription
    *@apiExample
    *@apiParam {String} uid 用户ID（必填）
    *@apiSuccess {String} status=200
     * @apiSuccessExample
     * {
     *     "status": 200,
     *     "data": {
     *         "messageBeans": [
     *             {
     *                 "id": 1,
     *                 "to_uid": "001",
     *                 "title": "哈哈",
     *                 "content": "哈哈哈哈",
     *                 "mktime": "",
     *                 "status_type": "1"
     *             }
     *         ]
     *     },
     *     "msg": "获取消息成功！"
     * }
    */
    //*@apiSampleRequest http://localhost:5000/users/:user_id
    @ResponseBody
    @RequestMapping(value = "/getMessageByuid" , method =RequestMethod.POST)
    public RestFulBean<MessageBean> getMessageByuid(String uid){
        System.out.println("uid:"+uid);
        return messageService.getMessage(uid);
    }
}
