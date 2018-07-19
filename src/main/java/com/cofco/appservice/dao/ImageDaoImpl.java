package com.cofco.appservice.dao;

import com.cofco.appservice.bean.ImageBean;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class ImageDaoImpl extends HibernateDaoSupport implements ImageDao {
    /**
     * 获取图片的地址集
     * @return
     */
    public List<ImageBean> getImageUrls() {
        List<ImageBean> images = (List<ImageBean>) this.getHibernateTemplate().find("from ImageBean ");

        return images;
    }
}
