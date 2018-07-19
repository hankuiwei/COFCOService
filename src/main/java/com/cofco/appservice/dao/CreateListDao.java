package com.cofco.appservice.dao;

import com.cofco.appservice.bean.CreateLBean;

import java.util.List;

/**
*@Author: Great Han
*@Description: 创意列表业务处理层
*@Date: 13:47 2018/7/18
*@email:315807323@qq.com
*/
public interface CreateListDao {
    /**
     * 获取创意详情
     * @param uid
     * @param createId
     * @return
     */
    CreateLBean getCreateInfo(String uid ,int createId);
    /**
     * 获取列表数据
     * @return 创意列表集
     */
    List<CreateLBean> getCreateList();
}
