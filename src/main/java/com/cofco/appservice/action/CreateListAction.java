package com.cofco.appservice.action;

import com.cofco.appservice.bean.CreateLBean;
import com.cofco.appservice.bean.RestFulBean;
import com.cofco.appservice.service.CreateListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
*@Author: Great Han
*@Description: 创意列表数据
*@Date: 14:17 2018/7/18
*@email:315807323@qq.com
*/
@Controller
@RequestMapping("/main")
public class CreateListAction {
    @Autowired
    private CreateListService createListService;

    /**
    *@api {get} /main/getCreateList 获取创意列表
    *@apiVersion 0.1.0
    *@apiName getCreateList
    *@apiGroup Main
     *@apiDescription 获取创意列表
     * *@apiSuccess {String} status=200
    *@apiSuccessExample
     * {
     *     "status": 200,
     *     "data": {
     *         "createLBeans": [
     *             {
     *                 "id": 1,
     *                 "creative_id": 1,
     *                 "creative_name": "创意测试",
     *                 "creative_description": "测试测试",
     *                 "sort_id": 1,
     *                 "creative_type": "1",
     *                 "collect_num": "1",
     *                 "praise_num": "1",
     *                 "collect_id": 1,
     *                 "comment_num": "1",
     *                 "create_time": "20180718",
     *                 "photo": [
     *                     "/image/1.jpg",
     *                     "/image/2.jpg",
     *                     "/image/3.jpeg"
     *                 ],
     *                 "vote_status": 1,
     *                 "collect_status": true,
     *                 "praise_status": true,
     *                 "comment_status": true,
     *                 "vote_num": 1,
     *                 "status": 1
     *             }
     *         ]
     *     },
     *     "msg": "获取创意列表数据成功！"
     * }
    */

    @ResponseBody
    @RequestMapping(value = "/getCreateList" , method = RequestMethod.GET)
    public RestFulBean<CreateLBean> getCreateList(){
        System.out.println("获取创意列表");
        return createListService.getCreateList();
    }

    /**
    *@api {post} /main/getCreateInfo 获取创意信息详情
    *@apiVersion 0.1.0
    *@apiName getCreateInfo
    *@apiGroup Main
    *@apiDescription 获取创意信息详情
    *@apiParam {String} uid 用户ID(必填)
    *@apiParam {String} creative_id 创意ID(必填)
    *@apiSuccess {String} status = 200
    */
    @ResponseBody
    @RequestMapping(value = "/getCreateInfo" , method = RequestMethod.POST)
    public RestFulBean<CreateLBean> getCreateInfo(String uid , int creative_id){
        System.out.println("获取创意详情");
        return  createListService.getCreateInfo(uid , creative_id);
    }
}
