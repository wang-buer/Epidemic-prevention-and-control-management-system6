package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenghuoxuqiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenghuoxuqiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenghuoxuqiuView;


/**
 * 生活需求
 *
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public interface ShenghuoxuqiuService extends IService<ShenghuoxuqiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenghuoxuqiuVO> selectListVO(Wrapper<ShenghuoxuqiuEntity> wrapper);
   	
   	ShenghuoxuqiuVO selectVO(@Param("ew") Wrapper<ShenghuoxuqiuEntity> wrapper);
   	
   	List<ShenghuoxuqiuView> selectListView(Wrapper<ShenghuoxuqiuEntity> wrapper);
   	
   	ShenghuoxuqiuView selectView(@Param("ew") Wrapper<ShenghuoxuqiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenghuoxuqiuEntity> wrapper);
   	

}

