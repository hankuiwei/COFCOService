package com.cofco.appservice.service;

import com.cofco.appservice.bean.CreateLBean;
import com.cofco.appservice.bean.RestFulBean;
import com.cofco.appservice.dao.CreateListDao;
import com.cofco.appservice.util.RestFulUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
*@Author: Great Han
*@Description: 获取创意列表服务
*@Date: 13:57 2018/7/18
*@email:315807323@qq.com
*/
@Transactional
public class CreateListService {
    @Autowired
    private CreateListDao createListDao;

    public RestFulBean<CreateLBean> getCreateInfo(String uid , int createId){
      CreateLBean createLBean =   createListDao.getCreateInfo(uid, createId);
      if (createLBean != null){
          return RestFulUtil.getInstance().getResuFulBean(createLBean, 200,"获取创意详情信息成功！");
      }else {
          return RestFulUtil.getInstance().getResuFulBean(null,201,"获取创意详情信息失败！");
      }
    }

    /**
     * 获取列表数据
     * @return
     */
    public RestFulBean<CreateLBean> getCreateList(){
        List<CreateLBean> createLBeans = createListDao.getCreateList();
        if (createLBeans != null && createLBeans.size() > 0){
            CreateData createData = new CreateData();
            createData.setCreateLBeans(createLBeans);
            return RestFulUtil.getInstance().getResuFulBean(createData , 200,"获取创意列表数据成功！");
        }else {
            return RestFulUtil.getInstance().getResuFulBean(null,201,"获取创意列表失败！");
        }
    }
}

class CreateData {
    private List<CreateLBean> createLBeans;

    public List<CreateLBean> getCreateLBeans() {
        return createLBeans;
    }

    public void setCreateLBeans(List<CreateLBean> createLBeans) {
        this.createLBeans = createLBeans;
    }



}