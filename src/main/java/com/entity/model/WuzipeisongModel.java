package com.entity.model;

import com.entity.WuzipeisongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 物资配送
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
public class WuzipeisongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 物资数量
	 */
	
	private Integer wuzishuliang;
		
	/**
	 * 物资详情
	 */
	
	private String wuzixiangqing;
		
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
	 * 配送时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date peisongshijian;
				
	
	/**
	 * 设置：物资数量
	 */
	 
	public void setWuzishuliang(Integer wuzishuliang) {
		this.wuzishuliang = wuzishuliang;
	}
	
	/**
	 * 获取：物资数量
	 */
	public Integer getWuzishuliang() {
		return wuzishuliang;
	}
				
	
	/**
	 * 设置：物资详情
	 */
	 
	public void setWuzixiangqing(String wuzixiangqing) {
		this.wuzixiangqing = wuzixiangqing;
	}
	
	/**
	 * 获取：物资详情
	 */
	public String getWuzixiangqing() {
		return wuzixiangqing;
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
