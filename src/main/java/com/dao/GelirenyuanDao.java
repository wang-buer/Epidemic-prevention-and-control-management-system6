package com.dao;

import com.entity.GelirenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GelirenyuanVO;
import com.entity.view.GelirenyuanView;


/**
 * 隔离人员
 * 
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public interface GelirenyuanDao extends BaseMapper<GelirenyuanEntity> {
	
	List<GelirenyuanVO> selectListVO(@Param("ew") Wrapper<GelirenyuanEntity> wrapper);
	
	GelirenyuanVO selectVO(@Param("ew") Wrapper<GelirenyuanEntity> wrapper);
	
	List<GelirenyuanView> selectListView(@Param("ew") Wrapper<GelirenyuanEntity> wrapper);

	List<GelirenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<GelirenyuanEntity> wrapper);
	
	GelirenyuanView selectView(@Param("ew") Wrapper<GelirenyuanEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GelirenyuanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GelirenyuanEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GelirenyuanEntity> wrapper);
}
