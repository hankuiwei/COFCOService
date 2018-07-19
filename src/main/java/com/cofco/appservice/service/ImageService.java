package com.cofco.appservice.service;

import com.cofco.appservice.bean.ImageBean;
import com.cofco.appservice.bean.MessageBean;
import com.cofco.appservice.bean.RestFulBean;
import com.cofco.appservice.dao.ImageDao;
import com.cofco.appservice.util.RestFulUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
*@Author: Great Han
*@Description: 图片服务
*@Date: 14:30 2018/7/17
*@email:315807323@qq.com
*/
@Transactional
public class ImageService {
    @Autowired
    private ImageDao imageDao;

    /**
     * 获取图片地址
     * @return 图片地址集
     */
    public RestFulBean<ImageBean> getImages(){

        List<ImageBean> imageBeans =  imageDao.getImageUrls();
        if (imageBeans!=null && imageBeans.size()> 0){
            ImageData imageData = new ImageData();
            imageData.setImageBeans(imageBeans);
           return RestFulUtil.getInstance().getResuFulBean(imageData,200,"获取图片地址成功!");
        }else {
            return RestFulUtil.getInstance().getResuFulBean(null,201,"获取图片地址集失败！");
        }

    }
}

 class ImageData{
    private List<ImageBean> imageBeans;

    public List<ImageBean> getImageBeans() {
        return imageBeans;
    }

    public void setImageBeans(List<ImageBean> imageBeans) {
        this.imageBeans = imageBeans;
    }
}
