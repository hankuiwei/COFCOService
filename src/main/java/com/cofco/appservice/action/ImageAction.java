package com.cofco.appservice.action;

import com.cofco.appservice.bean.ImageBean;
import com.cofco.appservice.bean.RestFulBean;
import com.cofco.appservice.service.ImageService;
import com.cofco.appservice.util.RestFulUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
*@Author: Great Han
*@Description: 获取图片
*@Date: 14:53 2018/7/17
*@email:315807323@qq.com
*/
@Controller
@RequestMapping("/image")
public class ImageAction {
    @Autowired
    private ImageService imageService;
    /**
    *@api {get} /image/getImages 获取图片列表
    *@apiVersion 0.1.0
    *@apiName getImages
    *@apiGroup Main
    *@apiDescription
    *@apiExample
    *@apiSuccess {String} status= 200.
    */
    //*@apiSuccessExample {json}
    @ResponseBody
    @RequestMapping(value = "/getImages" ,method = RequestMethod.GET)
    public RestFulBean<ImageBean> getImages(){
        return imageService.getImages();
    }
}
