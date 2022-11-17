package com.dao;

import com.entity.FanghugongjuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FanghugongjuVO;
import com.entity.view.FanghugongjuView;


/**
 * 防护工具
 * 
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public interface FanghugongjuDao extends BaseMapper<FanghugongjuEntity> {
	
	List<FanghugongjuVO> selectListVO(@Param("ew") Wrapper<FanghugongjuEntity> wrapper);
	
	FanghugongjuVO selectVO(@Param("ew") Wrapper<FanghugongjuEntity> wrapper);
	
	List<FanghugongjuView> selectListView(@Param("ew") Wrapper<FanghugongjuEntity> wrapper);

	List<FanghugongjuView> selectListView(Pagination page,@Param("ew") Wrapper<FanghugongjuEntity> wrapper);
	
	FanghugongjuView selectView(@Param("ew") Wrapper<FanghugongjuEntity> wrapper);
	

}
