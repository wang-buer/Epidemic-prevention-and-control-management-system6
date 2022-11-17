package com.dao;

import com.entity.GelididianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GelididianVO;
import com.entity.view.GelididianView;


/**
 * 隔离地点
 * 
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public interface GelididianDao extends BaseMapper<GelididianEntity> {
	
	List<GelididianVO> selectListVO(@Param("ew") Wrapper<GelididianEntity> wrapper);
	
	GelididianVO selectVO(@Param("ew") Wrapper<GelididianEntity> wrapper);
	
	List<GelididianView> selectListView(@Param("ew") Wrapper<GelididianEntity> wrapper);

	List<GelididianView> selectListView(Pagination page,@Param("ew") Wrapper<GelididianEntity> wrapper);
	
	GelididianView selectView(@Param("ew") Wrapper<GelididianEntity> wrapper);
	

}
