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

import com.entity.HesuanjieguoEntity;
import com.entity.view.HesuanjieguoView;

import com.service.HesuanjieguoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 核酸结果
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
@RestController
@RequestMapping("/hesuanjieguo")
public class HesuanjieguoController {
    @Autowired
    private HesuanjieguoService hesuanjieguoService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HesuanjieguoEntity hesuanjieguo,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date jianceshijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date jianceshijianend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			hesuanjieguo.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HesuanjieguoEntity> ew = new EntityWrapper<HesuanjieguoEntity>();
                if(jianceshijianstart!=null) ew.ge("jianceshijian", jianceshijianstart);
                if(jianceshijianend!=null) ew.le("jianceshijian", jianceshijianend);
		PageUtils page = hesuanjieguoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hesuanjieguo), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HesuanjieguoEntity hesuanjieguo, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date jianceshijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date jianceshijianend,
		HttpServletRequest request){
        EntityWrapper<HesuanjieguoEntity> ew = new EntityWrapper<HesuanjieguoEntity>();
                if(jianceshijianstart!=null) ew.ge("jianceshijian", jianceshijianstart);
                if(jianceshijianend!=null) ew.le("jianceshijian", jianceshijianend);
		PageUtils page = hesuanjieguoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hesuanjieguo), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HesuanjieguoEntity hesuanjieguo){
       	EntityWrapper<HesuanjieguoEntity> ew = new EntityWrapper<HesuanjieguoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( hesuanjieguo, "hesuanjieguo")); 
        return R.ok().put("data", hesuanjieguoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HesuanjieguoEntity hesuanjieguo){
        EntityWrapper< HesuanjieguoEntity> ew = new EntityWrapper< HesuanjieguoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( hesuanjieguo, "hesuanjieguo")); 
		HesuanjieguoView hesuanjieguoView =  hesuanjieguoService.selectView(ew);
		return R.ok("查询核酸结果成功").put("data", hesuanjieguoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HesuanjieguoEntity hesuanjieguo = hesuanjieguoService.selectById(id);
        return R.ok().put("data", hesuanjieguo);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HesuanjieguoEntity hesuanjieguo = hesuanjieguoService.selectById(id);
        return R.ok().put("data", hesuanjieguo);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HesuanjieguoEntity hesuanjieguo, HttpServletRequest request){
    	hesuanjieguo.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(hesuanjieguo);
        hesuanjieguoService.insert(hesuanjieguo);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HesuanjieguoEntity hesuanjieguo, HttpServletRequest request){
    	hesuanjieguo.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(hesuanjieguo);
        hesuanjieguoService.insert(hesuanjieguo);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HesuanjieguoEntity hesuanjieguo, HttpServletRequest request){
        //ValidatorUtils.validateEntity(hesuanjieguo);
        hesuanjieguoService.updateById(hesuanjieguo);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        hesuanjieguoService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<HesuanjieguoEntity> wrapper = new EntityWrapper<HesuanjieguoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = hesuanjieguoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
