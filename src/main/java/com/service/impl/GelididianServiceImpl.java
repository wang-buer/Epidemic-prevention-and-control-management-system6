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


import com.dao.GelididianDao;
import com.entity.GelididianEntity;
import com.service.GelididianService;
import com.entity.vo.GelididianVO;
import com.entity.view.GelididianView;

@Service("gelididianService")
public class GelididianServiceImpl extends ServiceImpl<GelididianDao, GelididianEntity> implements GelididianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GelididianEntity> page = this.selectPage(
                new Query<GelididianEntity>(params).getPage(),
                new EntityWrapper<GelididianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GelididianEntity> wrapper) {
		  Page<GelididianView> page =new Query<GelididianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GelididianVO> selectListVO(Wrapper<GelididianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GelididianVO selectVO(Wrapper<GelididianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GelididianView> selectListView(Wrapper<GelididianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GelididianView selectView(Wrapper<GelididianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
