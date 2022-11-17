package com.entity.vo;

import com.entity.PeicanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 配餐信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public class PeicanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 配餐数量
	 */
	
	private Integer peicanshuliang;
		
	/**
	 * 配餐内容
	 */
	
	private String peicanneirong;
		
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
	 * 配餐时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date peicanshijian;
				
	
	/**
	 * 设置：配餐数量
	 */
	 
	public void setPeicanshuliang(Integer peicanshuliang) {
		this.peicanshuliang = peicanshuliang;
	}
	
	/**
	 * 获取：配餐数量
	 */
	public Integer getPeicanshuliang() {
		return peicanshuliang;
	}
				
	
	/**
	 * 设置：配餐内容
	 */
	 
	public void setPeicanneirong(String peicanneirong) {
		this.peicanneirong = peicanneirong;
	}
	
	/**
	 * 获取：配餐内容
	 */
	public String getPeicanneirong() {
		return peicanneirong;
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
	 * 设置：配餐时间
	 */
	 
	public void setPeicanshijian(Date peicanshijian) {
		this.peicanshijian = peicanshijian;
	}
	
	/**
	 * 获取：配餐时间
	 */
	public Date getPeicanshijian() {
		return peicanshijian;
	}
			
}
