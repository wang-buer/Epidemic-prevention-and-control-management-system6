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


import com.dao.ShenghuoxuqiuDao;
import com.entity.ShenghuoxuqiuEntity;
import com.service.ShenghuoxuqiuService;
import com.entity.vo.ShenghuoxuqiuVO;
import com.entity.view.ShenghuoxuqiuView;

@Service("shenghuoxuqiuService")
public class ShenghuoxuqiuServiceImpl extends ServiceImpl<ShenghuoxuqiuDao, ShenghuoxuqiuEntity> implements ShenghuoxuqiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenghuoxuqiuEntity> page = this.selectPage(
                new Query<ShenghuoxuqiuEntity>(params).getPage(),
                new EntityWrapper<ShenghuoxuqiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenghuoxuqiuEntity> wrapper) {
		  Page<ShenghuoxuqiuView> page =new Query<ShenghuoxuqiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenghuoxuqiuVO> selectListVO(Wrapper<ShenghuoxuqiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenghuoxuqiuVO selectVO(Wrapper<ShenghuoxuqiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenghuoxuqiuView> selectListView(Wrapper<ShenghuoxuqiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenghuoxuqiuView selectView(Wrapper<ShenghuoxuqiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
