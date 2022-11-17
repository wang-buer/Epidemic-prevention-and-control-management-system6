package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongjupeisongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongjupeisongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongjupeisongView;


/**
 * 工具配送
 *
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public interface GongjupeisongService extends IService<GongjupeisongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongjupeisongVO> selectListVO(Wrapper<GongjupeisongEntity> wrapper);
   	
   	GongjupeisongVO selectVO(@Param("ew") Wrapper<GongjupeisongEntity> wrapper);
   	
   	List<GongjupeisongView> selectListView(Wrapper<GongjupeisongEntity> wrapper);
   	
   	GongjupeisongView selectView(@Param("ew") Wrapper<GongjupeisongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongjupeisongEntity> wrapper);
   	

}

