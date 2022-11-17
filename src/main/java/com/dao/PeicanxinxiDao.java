package com.dao;

import com.entity.PeicanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeicanxinxiVO;
import com.entity.view.PeicanxinxiView;


/**
 * 配餐信息
 * 
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public interface PeicanxinxiDao extends BaseMapper<PeicanxinxiEntity> {
	
	List<PeicanxinxiVO> selectListVO(@Param("ew") Wrapper<PeicanxinxiEntity> wrapper);
	
	PeicanxinxiVO selectVO(@Param("ew") Wrapper<PeicanxinxiEntity> wrapper);
	
	List<PeicanxinxiView> selectListView(@Param("ew") Wrapper<PeicanxinxiEntity> wrapper);

	List<PeicanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<PeicanxinxiEntity> wrapper);
	
	PeicanxinxiView selectView(@Param("ew") Wrapper<PeicanxinxiEntity> wrapper);
	

}
