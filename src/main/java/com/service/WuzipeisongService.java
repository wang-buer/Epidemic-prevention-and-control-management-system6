package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuzipeisongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuzipeisongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuzipeisongView;


/**
 * 物资配送
 *
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public interface WuzipeisongService extends IService<WuzipeisongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuzipeisongVO> selectListVO(Wrapper<WuzipeisongEntity> wrapper);
   	
   	WuzipeisongVO selectVO(@Param("ew") Wrapper<WuzipeisongEntity> wrapper);
   	
   	List<WuzipeisongView> selectListView(Wrapper<WuzipeisongEntity> wrapper);
   	
   	WuzipeisongView selectView(@Param("ew") Wrapper<WuzipeisongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuzipeisongEntity> wrapper);
   	

}

