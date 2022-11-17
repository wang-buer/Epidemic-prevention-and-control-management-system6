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


import com.dao.XuqiuhuifuDao;
import com.entity.XuqiuhuifuEntity;
import com.service.XuqiuhuifuService;
import com.entity.vo.XuqiuhuifuVO;
import com.entity.view.XuqiuhuifuView;

@Service("xuqiuhuifuService")
public class XuqiuhuifuServiceImpl extends ServiceImpl<XuqiuhuifuDao, XuqiuhuifuEntity> implements XuqiuhuifuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuqiuhuifuEntity> page = this.selectPage(
                new Query<XuqiuhuifuEntity>(params).getPage(),
                new EntityWrapper<XuqiuhuifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuqiuhuifuEntity> wrapper) {
		  Page<XuqiuhuifuView> page =new Query<XuqiuhuifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuqiuhuifuVO> selectListVO(Wrapper<XuqiuhuifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuqiuhuifuVO selectVO(Wrapper<XuqiuhuifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuqiuhuifuView> selectListView(Wrapper<XuqiuhuifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuqiuhuifuView selectView(Wrapper<XuqiuhuifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
