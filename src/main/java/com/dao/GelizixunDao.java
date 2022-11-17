package com.dao;

import com.entity.GelizixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GelizixunVO;
import com.entity.view.GelizixunView;


/**
 * 隔离资讯
 * 
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public interface GelizixunDao extends BaseMapper<GelizixunEntity> {
	
	List<GelizixunVO> selectListVO(@Param("ew") Wrapper<GelizixunEntity> wrapper);
	
	GelizixunVO selectVO(@Param("ew") Wrapper<GelizixunEntity> wrapper);
	
	List<GelizixunView> selectListView(@Param("ew") Wrapper<GelizixunEntity> wrapper);

	List<GelizixunView> selectListView(Pagination page,@Param("ew") Wrapper<GelizixunEntity> wrapper);
	
	GelizixunView selectView(@Param("ew") Wrapper<GelizixunEntity> wrapper);
	

}
