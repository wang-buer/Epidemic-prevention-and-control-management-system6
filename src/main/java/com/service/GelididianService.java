package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GelididianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GelididianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GelididianView;


/**
 * 隔离地点
 *
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public interface GelididianService extends IService<GelididianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GelididianVO> selectListVO(Wrapper<GelididianEntity> wrapper);
   	
   	GelididianVO selectVO(@Param("ew") Wrapper<GelididianEntity> wrapper);
   	
   	List<GelididianView> selectListView(Wrapper<GelididianEntity> wrapper);
   	
   	GelididianView selectView(@Param("ew") Wrapper<GelididianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GelididianEntity> wrapper);
   	

}

