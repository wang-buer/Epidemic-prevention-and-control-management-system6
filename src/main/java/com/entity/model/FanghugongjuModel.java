package com.entity.model;

import com.entity.FanghugongjuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 防护工具
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public class FanghugongjuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 工具图片
	 */
	
	private String gongjutupian;
		
	/**
	 * 数量
	 */
	
	private String shuliang;
		
	/**
	 * 工具简介
	 */
	
	private String gongjujianjie;
		
	/**
	 * 储存位置
	 */
	
	private String chucunweizhi;
				
	
	/**
	 * 设置：工具图片
	 */
	 
	public void setGongjutupian(String gongjutupian) {
		this.gongjutupian = gongjutupian;
	}
	
	/**
	 * 获取：工具图片
	 */
	public String getGongjutupian() {
		return gongjutupian;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(String shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public String getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：工具简介
	 */
	 
	public void setGongjujianjie(String gongjujianjie) {
		this.gongjujianjie = gongjujianjie;
	}
	
	/**
	 * 获取：工具简介
	 */
	public String getGongjujianjie() {
		return gongjujianjie;
	}
				
	
	/**
	 * 设置：储存位置
	 */
	 
	public void setChucunweizhi(String chucunweizhi) {
		this.chucunweizhi = chucunweizhi;
	}
	
	/**
	 * 获取：储存位置
	 */
	public String getChucunweizhi() {
		return chucunweizhi;
	}
			
}
