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


import com.dao.GelijiechuDao;
import com.entity.GelijiechuEntity;
import com.service.GelijiechuService;
import com.entity.vo.GelijiechuVO;
import com.entity.view.GelijiechuView;

@Service("gelijiechuService")
public class GelijiechuServiceImpl extends ServiceImpl<GelijiechuDao, GelijiechuEntity> implements GelijiechuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GelijiechuEntity> page = this.selectPage(
                new Query<GelijiechuEntity>(params).getPage(),
                new EntityWrapper<GelijiechuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GelijiechuEntity> wrapper) {
		  Page<GelijiechuView> page =new Query<GelijiechuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GelijiechuVO> selectListVO(Wrapper<GelijiechuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GelijiechuVO selectVO(Wrapper<GelijiechuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GelijiechuView> selectListView(Wrapper<GelijiechuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GelijiechuView selectView(Wrapper<GelijiechuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
