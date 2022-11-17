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
 * 防护工具
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
@TableName("fanghugongju")
public class FanghugongjuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FanghugongjuEntity() {
		
	}
	
	public FanghugongjuEntity(T t) {
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
	 * 工具名称
	 */
					
	private String gongjumingcheng;
	
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
	 * 设置：工具名称
	 */
	public void setGongjumingcheng(String gongjumingcheng) {
		this.gongjumingcheng = gongjumingcheng;
	}
	/**
	 * 获取：工具名称
	 */
	public String getGongjumingcheng() {
		return gongjumingcheng;
	}
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
