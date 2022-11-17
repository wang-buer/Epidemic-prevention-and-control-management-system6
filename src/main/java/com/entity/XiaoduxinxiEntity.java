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
 * 消毒信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
@TableName("xiaoduxinxi")
public class XiaoduxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoduxinxiEntity() {
		
	}
	
	public XiaoduxinxiEntity(T t) {
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
	 * 地点名称
	 */
					
	private String didianmingcheng;
	
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
