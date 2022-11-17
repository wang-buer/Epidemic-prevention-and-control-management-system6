package com.entity.vo;

import com.entity.XuqiuhuifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 需求回复
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-17 10:14:25
 */
public class XuqiuhuifuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 需求名称
	 */
	
	private String xuqiumingcheng;
		
	/**
	 * 需求数量
	 */
	
	private Integer xuqiushuliang;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机号码
	 */
	
	private String shoujihaoma;
		
	/**
	 * 地点名称
	 */
	
	private String didianmingcheng;
		
	/**
	 * 区域
	 */
	
	private String quyu;
		
	/**
	 * 申请时间
	 */
	
	private String shenqingshijian;
		
	/**
	 * 回复内容
	 */
	
	private String huifuneirong;
		
	/**
	 * 回复时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date huifushijian;
				
	
	/**
	 * 设置：需求名称
	 */
	 
	public void setXuqiumingcheng(String xuqiumingcheng) {
		this.xuqiumingcheng = xuqiumingcheng;
	}
	
	/**
	 * 获取：需求名称
	 */
	public String getXuqiumingcheng() {
		return xuqiumingcheng;
	}
				
	
	/**
	 * 设置：需求数量
	 */
	 
	public void setXuqiushuliang(Integer xuqiushuliang) {
		this.xuqiushuliang = xuqiushuliang;
	}
	
	/**
	 * 获取：需求数量
	 */
	public Integer getXuqiushuliang() {
		return xuqiushuliang;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机号码
	 */
	 
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
				
	
	/**
	 * 设置：地点名称
	 */
	 
	public void setDidianmingcheng(String didianmingcheng) {
		this.didianmingcheng = didianmingcheng;
	}
	
	/**
	 * 获取：地点名称
	 */
	public String getDidianmingcheng() {
		return didianmingcheng;
	}
				
	
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
	 * 设置：申请时间
	 */
	 
	public void setShenqingshijian(String shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	
	/**
	 * 获取：申请时间
	 */
	public String getShenqingshijian() {
		return shenqingshijian;
	}
				
	
	/**
	 * 设置：回复内容
	 */
	 
	public void setHuifuneirong(String huifuneirong) {
		this.huifuneirong = huifuneirong;
	}
	
	/**
	 * 获取：回复内容
	 */
	public String getHuifuneirong() {
		return huifuneirong;
	}
				
	
	/**
	 * 设置：回复时间
	 */
	 
	public void setHuifushijian(Date huifushijian) {
		this.huifushijian = huifushijian;
	}
	
	/**
	 * 获取：回复时间
	 */
	public Date getHuifushijian() {
		return huifushijian;
	}
			
}
