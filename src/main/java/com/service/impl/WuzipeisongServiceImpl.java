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


import com.dao.WuzipeisongDao;
import com.entity.WuzipeisongEntity;
import com.service.WuzipeisongService;
import com.entity.vo.WuzipeisongVO;
import com.entity.view.WuzipeisongView;

@Service("wuzipeisongService")
public class WuzipeisongServiceImpl extends ServiceImpl<WuzipeisongDao, WuzipeisongEntity> implements WuzipeisongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuzipeisongEntity> page = this.selectPage(
                new Query<WuzipeisongEntity>(params).getPage(),
                new EntityWrapper<WuzipeisongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuzipeisongEntity> wrapper) {
		  Page<WuzipeisongView> page =new Query<WuzipeisongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuzipeisongVO> selectListVO(Wrapper<WuzipeisongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuzipeisongVO selectVO(Wrapper<WuzipeisongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuzipeisongView> selectListView(Wrapper<WuzipeisongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuzipeisongView selectView(Wrapper<WuzipeisongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
