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


import com.dao.XiaoduxinxiDao;
import com.entity.XiaoduxinxiEntity;
import com.service.XiaoduxinxiService;
import com.entity.vo.XiaoduxinxiVO;
import com.entity.view.XiaoduxinxiView;

@Service("xiaoduxinxiService")
public class XiaoduxinxiServiceImpl extends ServiceImpl<XiaoduxinxiDao, XiaoduxinxiEntity> implements XiaoduxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoduxinxiEntity> page = this.selectPage(
                new Query<XiaoduxinxiEntity>(params).getPage(),
                new EntityWrapper<XiaoduxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoduxinxiEntity> wrapper) {
		  Page<XiaoduxinxiView> page =new Query<XiaoduxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoduxinxiVO> selectListVO(Wrapper<XiaoduxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoduxinxiVO selectVO(Wrapper<XiaoduxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoduxinxiView> selectListView(Wrapper<XiaoduxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoduxinxiView selectView(Wrapper<XiaoduxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
