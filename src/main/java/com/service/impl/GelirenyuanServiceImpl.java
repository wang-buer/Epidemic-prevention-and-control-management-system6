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


import com.dao.GelirenyuanDao;
import com.entity.GelirenyuanEntity;
import com.service.GelirenyuanService;
import com.entity.vo.GelirenyuanVO;
import com.entity.view.GelirenyuanView;

@Service("gelirenyuanService")
public class GelirenyuanServiceImpl extends ServiceImpl<GelirenyuanDao, GelirenyuanEntity> implements GelirenyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GelirenyuanEntity> page = this.selectPage(
                new Query<GelirenyuanEntity>(params).getPage(),
                new EntityWrapper<GelirenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GelirenyuanEntity> wrapper) {
		  Page<GelirenyuanView> page =new Query<GelirenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GelirenyuanVO> selectListVO(Wrapper<GelirenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GelirenyuanVO selectVO(Wrapper<GelirenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GelirenyuanView> selectListView(Wrapper<GelirenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GelirenyuanView selectView(Wrapper<GelirenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<GelirenyuanEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<GelirenyuanEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<GelirenyuanEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
