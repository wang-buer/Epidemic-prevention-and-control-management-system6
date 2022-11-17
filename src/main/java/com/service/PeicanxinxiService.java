package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeicanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeicanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeicanxinxiView;


/**
 * 配餐信息
 *
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public interface PeicanxinxiService extends IService<PeicanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeicanxinxiVO> selectListVO(Wrapper<PeicanxinxiEntity> wrapper);
   	
   	PeicanxinxiVO selectVO(@Param("ew") Wrapper<PeicanxinxiEntity> wrapper);
   	
   	List<PeicanxinxiView> selectListView(Wrapper<PeicanxinxiEntity> wrapper);
   	
   	PeicanxinxiView selectView(@Param("ew") Wrapper<PeicanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeicanxinxiEntity> wrapper);
   	

}

