package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoduxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoduxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoduxinxiView;


/**
 * 消毒信息
 *
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public interface XiaoduxinxiService extends IService<XiaoduxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoduxinxiVO> selectListVO(Wrapper<XiaoduxinxiEntity> wrapper);
   	
   	XiaoduxinxiVO selectVO(@Param("ew") Wrapper<XiaoduxinxiEntity> wrapper);
   	
   	List<XiaoduxinxiView> selectListView(Wrapper<XiaoduxinxiEntity> wrapper);
   	
   	XiaoduxinxiView selectView(@Param("ew") Wrapper<XiaoduxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoduxinxiEntity> wrapper);
   	

}

