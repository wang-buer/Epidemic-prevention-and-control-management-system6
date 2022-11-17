package com.dao;

import com.entity.WuzipeisongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuzipeisongVO;
import com.entity.view.WuzipeisongView;


/**
 * 物资配送
 * 
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public interface WuzipeisongDao extends BaseMapper<WuzipeisongEntity> {
	
	List<WuzipeisongVO> selectListVO(@Param("ew") Wrapper<WuzipeisongEntity> wrapper);
	
	WuzipeisongVO selectVO(@Param("ew") Wrapper<WuzipeisongEntity> wrapper);
	
	List<WuzipeisongView> selectListView(@Param("ew") Wrapper<WuzipeisongEntity> wrapper);

	List<WuzipeisongView> selectListView(Pagination page,@Param("ew") Wrapper<WuzipeisongEntity> wrapper);
	
	WuzipeisongView selectView(@Param("ew") Wrapper<WuzipeisongEntity> wrapper);
	

}
