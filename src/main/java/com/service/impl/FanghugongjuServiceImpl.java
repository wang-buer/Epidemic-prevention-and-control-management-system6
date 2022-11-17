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


import com.dao.FanghugongjuDao;
import com.entity.FanghugongjuEntity;
import com.service.FanghugongjuService;
import com.entity.vo.FanghugongjuVO;
import com.entity.view.FanghugongjuView;

@Service("fanghugongjuService")
public class FanghugongjuServiceImpl extends ServiceImpl<FanghugongjuDao, FanghugongjuEntity> implements FanghugongjuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FanghugongjuEntity> page = this.selectPage(
                new Query<FanghugongjuEntity>(params).getPage(),
                new EntityWrapper<FanghugongjuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FanghugongjuEntity> wrapper) {
		  Page<FanghugongjuView> page =new Query<FanghugongjuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FanghugongjuVO> selectListVO(Wrapper<FanghugongjuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FanghugongjuVO selectVO(Wrapper<FanghugongjuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FanghugongjuView> selectListView(Wrapper<FanghugongjuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FanghugongjuView selectView(Wrapper<FanghugongjuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
