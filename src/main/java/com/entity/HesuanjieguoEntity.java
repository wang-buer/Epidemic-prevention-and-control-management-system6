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
 * 核酸结果
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
@TableName("hesuanjieguo")
public class HesuanjieguoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HesuanjieguoEntity() {
		
	}
	
	public HesuanjieguoEntity(T t) {
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
	 * 检测编号
	 */
					
	private String jiancebianhao;
	
	/**
	 * 检测时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jianceshijian;
	
	/**
	 * 检测结果
	 */
					
	private String jiancejieguo;
	
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
	 * 核酸备注
	 */
					
	private String hesuanbeizhu;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	
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
	 * 设置：检测编号
	 */
	public void setJiancebianhao(String jiancebianhao) {
		this.jiancebianhao = jiancebianhao;
	}
	/**
	 * 获取：检测编号
	 */
	public String getJiancebianhao() {
		return jiancebianhao;
	}
	/**
	 * 设置：检测时间
	 */
	public void setJianceshijian(Date jianceshijian) {
		this.jianceshijian = jianceshijian;
	}
	/**
	 * 获取：检测时间
	 */
	public Date getJianceshijian() {
		return jianceshijian;
	}
	/**
	 * 设置：检测结果
	 */
	public void setJiancejieguo(String jiancejieguo) {
		this.jiancejieguo = jiancejieguo;
	}
	/**
	 * 获取：检测结果
	 */
	public String getJiancejieguo() {
		return jiancejieguo;
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
	 * 设置：核酸备注
	 */
	public void setHesuanbeizhu(String hesuanbeizhu) {
		this.hesuanbeizhu = hesuanbeizhu;
	}
	/**
	 * 获取：核酸备注
	 */
	public String getHesuanbeizhu() {
		return hesuanbeizhu;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}

}
