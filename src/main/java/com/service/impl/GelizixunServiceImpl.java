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


import com.dao.GelizixunDao;
import com.entity.GelizixunEntity;
import com.service.GelizixunService;
import com.entity.vo.GelizixunVO;
import com.entity.view.GelizixunView;

@Service("gelizixunService")
public class GelizixunServiceImpl extends ServiceImpl<GelizixunDao, GelizixunEntity> implements GelizixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GelizixunEntity> page = this.selectPage(
                new Query<GelizixunEntity>(params).getPage(),
                new EntityWrapper<GelizixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GelizixunEntity> wrapper) {
		  Page<GelizixunView> page =new Query<GelizixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GelizixunVO> selectListVO(Wrapper<GelizixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GelizixunVO selectVO(Wrapper<GelizixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GelizixunView> selectListView(Wrapper<GelizixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GelizixunView selectView(Wrapper<GelizixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
