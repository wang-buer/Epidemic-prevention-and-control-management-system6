package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 配餐信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
@TableName("peicanxinxi")
public class PeicanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PeicanxinxiEntity() {
		
	}
	
	public PeicanxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 配餐名称
	 */
					
	private String peicanmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：配餐名称
	 */
	public void setPeicanmingcheng(String peicanmingcheng) {
		this.peicanmingcheng = peicanmingcheng;
	}
	/**
	 * 获取：配餐名称
	 */
	public String getPeicanmingcheng() {
		return peicanmingcheng;
	}
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
