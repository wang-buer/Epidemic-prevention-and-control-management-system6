package com.entity.vo;

import com.entity.GongjupeisongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 工具配送
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public class GongjupeisongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 地点名称
	 */
	
	private String didianmingcheng;
		
	/**
	 * 区域
	 */
	
	private String quyu;
		
	/**
	 * 配送原因
	 */
	
	private String peisongyuanyin;
		
	/**
	 * 配送时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date peisongshijian;
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
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
	 * 设置：配送原因
	 */
	 
	public void setPeisongyuanyin(String peisongyuanyin) {
		this.peisongyuanyin = peisongyuanyin;
	}
	
	/**
	 * 获取：配送原因
	 */
	public String getPeisongyuanyin() {
		return peisongyuanyin;
	}
				
	
	/**
	 * 设置：配送时间
	 */
	 
	public void setPeisongshijian(Date peisongshijian) {
		this.peisongshijian = peisongshijian;
	}
	
	/**
	 * 获取：配送时间
	 */
	public Date getPeisongshijian() {
		return peisongshijian;
	}
			
}
