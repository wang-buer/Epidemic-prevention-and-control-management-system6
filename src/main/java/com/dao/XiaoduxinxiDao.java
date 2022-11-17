package com.dao;

import com.entity.XiaoduxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoduxinxiVO;
import com.entity.view.XiaoduxinxiView;


/**
 * 消毒信息
 * 
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public interface XiaoduxinxiDao extends BaseMapper<XiaoduxinxiEntity> {
	
	List<XiaoduxinxiVO> selectListVO(@Param("ew") Wrapper<XiaoduxinxiEntity> wrapper);
	
	XiaoduxinxiVO selectVO(@Param("ew") Wrapper<XiaoduxinxiEntity> wrapper);
	
	List<XiaoduxinxiView> selectListView(@Param("ew") Wrapper<XiaoduxinxiEntity> wrapper);

	List<XiaoduxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoduxinxiEntity> wrapper);
	
	XiaoduxinxiView selectView(@Param("ew") Wrapper<XiaoduxinxiEntity> wrapper);
	

}
