package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GongjupeisongDao;
import com.entity.GongjupeisongEntity;
import com.service.GongjupeisongService;
import com.entity.vo.GongjupeisongVO;
import com.entity.view.GongjupeisongView;

@Service("gongjupeisongService")
public class GongjupeisongServiceImpl extends ServiceImpl<GongjupeisongDao, GongjupeisongEntity> implements GongjupeisongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongjupeisongEntity> page = this.selectPage(
                new Query<GongjupeisongEntity>(params).getPage(),
                new EntityWrapper<GongjupeisongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongjupeisongEntity> wrapper) {
		  Page<GongjupeisongView> page =new Query<GongjupeisongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongjupeisongVO> selectListVO(Wrapper<GongjupeisongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongjupeisongVO selectVO(Wrapper<GongjupeisongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongjupeisongView> selectListView(Wrapper<GongjupeisongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongjupeisongView selectView(Wrapper<GongjupeisongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
