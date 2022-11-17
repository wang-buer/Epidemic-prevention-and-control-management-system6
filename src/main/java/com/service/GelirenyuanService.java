package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GelirenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GelirenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GelirenyuanView;


/**
 * 隔离人员
 *
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public interface GelirenyuanService extends IService<GelirenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GelirenyuanVO> selectListVO(Wrapper<GelirenyuanEntity> wrapper);
   	
   	GelirenyuanVO selectVO(@Param("ew") Wrapper<GelirenyuanEntity> wrapper);
   	
   	List<GelirenyuanView> selectListView(Wrapper<GelirenyuanEntity> wrapper);
   	
   	GelirenyuanView selectView(@Param("ew") Wrapper<GelirenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GelirenyuanEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<GelirenyuanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<GelirenyuanEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<GelirenyuanEntity> wrapper);
}

