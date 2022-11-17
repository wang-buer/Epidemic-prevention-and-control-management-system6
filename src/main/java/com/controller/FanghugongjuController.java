package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.FanghugongjuEntity;
import com.entity.view.FanghugongjuView;

import com.service.FanghugongjuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 防护工具
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
@RestController
@RequestMapping("/fanghugongju")
public class FanghugongjuController {
    @Autowired
    private FanghugongjuService fanghugongjuService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FanghugongjuEntity fanghugongju,
		HttpServletRequest request){
        EntityWrapper<FanghugongjuEntity> ew = new EntityWrapper<FanghugongjuEntity>();
		PageUtils page = fanghugongjuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fanghugongju), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FanghugongjuEntity fanghugongju, 
		HttpServletRequest request){
        EntityWrapper<FanghugongjuEntity> ew = new EntityWrapper<FanghugongjuEntity>();
		PageUtils page = fanghugongjuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fanghugongju), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FanghugongjuEntity fanghugongju){
       	EntityWrapper<FanghugongjuEntity> ew = new EntityWrapper<FanghugongjuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fanghugongju, "fanghugongju")); 
        return R.ok().put("data", fanghugongjuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FanghugongjuEntity fanghugongju){
        EntityWrapper< FanghugongjuEntity> ew = new EntityWrapper< FanghugongjuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fanghugongju, "fanghugongju")); 
		FanghugongjuView fanghugongjuView =  fanghugongjuService.selectView(ew);
		return R.ok("查询防护工具成功").put("data", fanghugongjuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FanghugongjuEntity fanghugongju = fanghugongjuService.selectById(id);
        return R.ok().put("data", fanghugongju);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FanghugongjuEntity fanghugongju = fanghugongjuService.selectById(id);
        return R.ok().put("data", fanghugongju);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FanghugongjuEntity fanghugongju, HttpServletRequest request){
    	fanghugongju.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fanghugongju);
        fanghugongjuService.insert(fanghugongju);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FanghugongjuEntity fanghugongju, HttpServletRequest request){
    	fanghugongju.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fanghugongju);
        fanghugongjuService.insert(fanghugongju);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FanghugongjuEntity fanghugongju, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fanghugongju);
        fanghugongjuService.updateById(fanghugongju);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fanghugongjuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<FanghugongjuEntity> wrapper = new EntityWrapper<FanghugongjuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = fanghugongjuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
