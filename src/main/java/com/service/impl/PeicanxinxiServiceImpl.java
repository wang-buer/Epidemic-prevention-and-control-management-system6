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


import com.dao.PeicanxinxiDao;
import com.entity.PeicanxinxiEntity;
import com.service.PeicanxinxiService;
import com.entity.vo.PeicanxinxiVO;
import com.entity.view.PeicanxinxiView;

@Service("peicanxinxiService")
public class PeicanxinxiServiceImpl extends ServiceImpl<PeicanxinxiDao, PeicanxinxiEntity> implements PeicanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeicanxinxiEntity> page = this.selectPage(
                new Query<PeicanxinxiEntity>(params).getPage(),
                new EntityWrapper<PeicanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeicanxinxiEntity> wrapper) {
		  Page<PeicanxinxiView> page =new Query<PeicanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PeicanxinxiVO> selectListVO(Wrapper<PeicanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeicanxinxiVO selectVO(Wrapper<PeicanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeicanxinxiView> selectListView(Wrapper<PeicanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeicanxinxiView selectView(Wrapper<PeicanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
