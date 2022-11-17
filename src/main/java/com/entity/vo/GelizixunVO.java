package com.entity.vo;

import com.entity.GelizixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 隔离资讯
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public class GelizixunVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 资讯图片
	 */
	
	private String zixuntupian;
		
	/**
	 * 地点名称
	 */
	
	private String didianmingcheng;
		
	/**
	 * 新增人数
	 */
	
	private Integer xinzengrenshu;
		
	/**
	 * 累计人数
	 */
	
	private Integer leijirenshu;
		
	/**
	 * 解除人数
	 */
	
	private Integer jiechurenshu;
		
	/**
	 * 流调轨迹
	 */
	
	private String liudiaoguiji;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：资讯图片
	 */
	 
	public void setZixuntupian(String zixuntupian) {
		this.zixuntupian = zixuntupian;
	}
	
	/**
	 * 获取：资讯图片
	 */
	public String getZixuntupian() {
		return zixuntupian;
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
	 * 设置：新增人数
	 */
	 
	public void setXinzengrenshu(Integer xinzengrenshu) {
		this.xinzengrenshu = xinzengrenshu;
	}
	
	/**
	 * 获取：新增人数
	 */
	public Integer getXinzengrenshu() {
		return xinzengrenshu;
	}
				
	
	/**
	 * 设置：累计人数
	 */
	 
	public void setLeijirenshu(Integer leijirenshu) {
		this.leijirenshu = leijirenshu;
	}
	
	/**
	 * 获取：累计人数
	 */
	public Integer getLeijirenshu() {
		return leijirenshu;
	}
				
	
	/**
	 * 设置：解除人数
	 */
	 
	public void setJiechurenshu(Integer jiechurenshu) {
		this.jiechurenshu = jiechurenshu;
	}
	
	/**
	 * 获取：解除人数
	 */
	public Integer getJiechurenshu() {
		return jiechurenshu;
	}
				
	
	/**
	 * 设置：流调轨迹
	 */
	 
	public void setLiudiaoguiji(String liudiaoguiji) {
		this.liudiaoguiji = liudiaoguiji;
	}
	
	/**
	 * 获取：流调轨迹
	 */
	public String getLiudiaoguiji() {
		return liudiaoguiji;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
