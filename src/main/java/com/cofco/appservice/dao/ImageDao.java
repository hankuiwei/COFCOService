package com.cofco.appservice.dao;

import com.cofco.appservice.bean.ImageBean;

import java.util.List;

/**
*@Author: Great Han
*@Description: 处理图片数据
*@Date: 14:16 2018/7/17
*@email:315807323@qq.com
*/
public interface ImageDao {
    /**
     * 获取图片地址
     * @return
     */
    List<ImageBean> getImageUrls();
}
