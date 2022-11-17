package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuqiuhuifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuqiuhuifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuqiuhuifuView;


/**
 * 需求回复
 *
 * @author 
 * @email 
 * @date 2022-05-17 10:14:25
 */
public interface XuqiuhuifuService extends IService<XuqiuhuifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuqiuhuifuVO> selectListVO(Wrapper<XuqiuhuifuEntity> wrapper);
   	
   	XuqiuhuifuVO selectVO(@Param("ew") Wrapper<XuqiuhuifuEntity> wrapper);
   	
   	List<XuqiuhuifuView> selectListView(Wrapper<XuqiuhuifuEntity> wrapper);
   	
   	XuqiuhuifuView selectView(@Param("ew") Wrapper<XuqiuhuifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuqiuhuifuEntity> wrapper);
   	

}

