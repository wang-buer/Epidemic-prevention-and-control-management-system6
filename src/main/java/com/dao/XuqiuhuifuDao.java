package com.dao;

import com.entity.XuqiuhuifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuqiuhuifuVO;
import com.entity.view.XuqiuhuifuView;


/**
 * 需求回复
 * 
 * @author 
 * @email 
 * @date 2022-05-17 10:14:25
 */
public interface XuqiuhuifuDao extends BaseMapper<XuqiuhuifuEntity> {
	
	List<XuqiuhuifuVO> selectListVO(@Param("ew") Wrapper<XuqiuhuifuEntity> wrapper);
	
	XuqiuhuifuVO selectVO(@Param("ew") Wrapper<XuqiuhuifuEntity> wrapper);
	
	List<XuqiuhuifuView> selectListView(@Param("ew") Wrapper<XuqiuhuifuEntity> wrapper);

	List<XuqiuhuifuView> selectListView(Pagination page,@Param("ew") Wrapper<XuqiuhuifuEntity> wrapper);
	
	XuqiuhuifuView selectView(@Param("ew") Wrapper<XuqiuhuifuEntity> wrapper);
	

}
