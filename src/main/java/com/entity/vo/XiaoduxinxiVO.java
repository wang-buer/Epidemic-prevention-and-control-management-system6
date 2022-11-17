package com.entity.vo;

import com.entity.XiaoduxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 消毒信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public class XiaoduxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 区域
	 */
	
	private String quyu;
		
	/**
	 * 消毒时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiaodushijian;
		
	/**
	 * 消毒内容
	 */
	
	private String xiaoduneirong;
				
	
	/**
	 * 设置：区域
	 */
	 
	public void setQuyu(String quyu) {
		this.quyu = quyu;
	}
	
	/**
	 * 获取：区域
	 */
	public String getQuyu() {
		return quyu;
	}
				
	
	/**
	 * 设置：消毒时间
	 */
	 
	public void setXiaodushijian(Date xiaodushijian) {
		this.xiaodushijian = xiaodushijian;
	}
	
	/**
	 * 获取：消毒时间
	 */
	public Date getXiaodushijian() {
		return xiaodushijian;
	}
				
	
	/**
	 * 设置：消毒内容
	 */
	 
	public void setXiaoduneirong(String xiaoduneirong) {
		this.xiaoduneirong = xiaoduneirong;
	}
	
	/**
	 * 获取：消毒内容
	 */
	public String getXiaoduneirong() {
		return xiaoduneirong;
	}
			
}
