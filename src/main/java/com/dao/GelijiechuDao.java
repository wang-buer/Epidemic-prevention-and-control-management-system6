package com.dao;

import com.entity.GelijiechuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GelijiechuVO;
import com.entity.view.GelijiechuView;


/**
 * 隔离解除
 * 
 * @author 
 * @email 
 * @date 2022-05-17 10:14:25
 */
public interface GelijiechuDao extends BaseMapper<GelijiechuEntity> {
	
	List<GelijiechuVO> selectListVO(@Param("ew") Wrapper<GelijiechuEntity> wrapper);
	
	GelijiechuVO selectVO(@Param("ew") Wrapper<GelijiechuEntity> wrapper);
	
	List<GelijiechuView> selectListView(@Param("ew") Wrapper<GelijiechuEntity> wrapper);

	List<GelijiechuView> selectListView(Pagination page,@Param("ew") Wrapper<GelijiechuEntity> wrapper);
	
	GelijiechuView selectView(@Param("ew") Wrapper<GelijiechuEntity> wrapper);
	

}
