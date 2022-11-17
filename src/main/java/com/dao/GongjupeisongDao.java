package com.dao;

import com.entity.GongjupeisongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongjupeisongVO;
import com.entity.view.GongjupeisongView;


/**
 * 工具配送
 * 
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public interface GongjupeisongDao extends BaseMapper<GongjupeisongEntity> {
	
	List<GongjupeisongVO> selectListVO(@Param("ew") Wrapper<GongjupeisongEntity> wrapper);
	
	GongjupeisongVO selectVO(@Param("ew") Wrapper<GongjupeisongEntity> wrapper);
	
	List<GongjupeisongView> selectListView(@Param("ew") Wrapper<GongjupeisongEntity> wrapper);

	List<GongjupeisongView> selectListView(Pagination page,@Param("ew") Wrapper<GongjupeisongEntity> wrapper);
	
	GongjupeisongView selectView(@Param("ew") Wrapper<GongjupeisongEntity> wrapper);
	

}
