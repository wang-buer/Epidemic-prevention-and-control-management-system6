package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GelizixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GelizixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GelizixunView;


/**
 * 隔离资讯
 *
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public interface GelizixunService extends IService<GelizixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GelizixunVO> selectListVO(Wrapper<GelizixunEntity> wrapper);
   	
   	GelizixunVO selectVO(@Param("ew") Wrapper<GelizixunEntity> wrapper);
   	
   	List<GelizixunView> selectListView(Wrapper<GelizixunEntity> wrapper);
   	
   	GelizixunView selectView(@Param("ew") Wrapper<GelizixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GelizixunEntity> wrapper);
   	

}

