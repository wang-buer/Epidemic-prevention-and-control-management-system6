package com.dao;

import com.entity.ShenghuoxuqiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenghuoxuqiuVO;
import com.entity.view.ShenghuoxuqiuView;


/**
 * 生活需求
 * 
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public interface ShenghuoxuqiuDao extends BaseMapper<ShenghuoxuqiuEntity> {
	
	List<ShenghuoxuqiuVO> selectListVO(@Param("ew") Wrapper<ShenghuoxuqiuEntity> wrapper);
	
	ShenghuoxuqiuVO selectVO(@Param("ew") Wrapper<ShenghuoxuqiuEntity> wrapper);
	
	List<ShenghuoxuqiuView> selectListView(@Param("ew") Wrapper<ShenghuoxuqiuEntity> wrapper);

	List<ShenghuoxuqiuView> selectListView(Pagination page,@Param("ew") Wrapper<ShenghuoxuqiuEntity> wrapper);
	
	ShenghuoxuqiuView selectView(@Param("ew") Wrapper<ShenghuoxuqiuEntity> wrapper);
	

}
