package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FanghugongjuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FanghugongjuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FanghugongjuView;


/**
 * 防护工具
 *
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public interface FanghugongjuService extends IService<FanghugongjuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FanghugongjuVO> selectListVO(Wrapper<FanghugongjuEntity> wrapper);
   	
   	FanghugongjuVO selectVO(@Param("ew") Wrapper<FanghugongjuEntity> wrapper);
   	
   	List<FanghugongjuView> selectListView(Wrapper<FanghugongjuEntity> wrapper);
   	
   	FanghugongjuView selectView(@Param("ew") Wrapper<FanghugongjuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FanghugongjuEntity> wrapper);
   	

}

