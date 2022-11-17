package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GelijiechuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GelijiechuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GelijiechuView;


/**
 * 隔离解除
 *
 * @author 
 * @email 
 * @date 2022-05-17 10:14:25
 */
public interface GelijiechuService extends IService<GelijiechuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GelijiechuVO> selectListVO(Wrapper<GelijiechuEntity> wrapper);
   	
   	GelijiechuVO selectVO(@Param("ew") Wrapper<GelijiechuEntity> wrapper);
   	
   	List<GelijiechuView> selectListView(Wrapper<GelijiechuEntity> wrapper);
   	
   	GelijiechuView selectView(@Param("ew") Wrapper<GelijiechuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GelijiechuEntity> wrapper);
   	

}

