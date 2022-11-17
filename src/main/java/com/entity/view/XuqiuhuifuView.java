package com.entity.view;

import com.entity.XuqiuhuifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 需求回复
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-17 10:14:25
 */
@TableName("xuqiuhuifu")
public class XuqiuhuifuView  extends XuqiuhuifuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuqiuhuifuView(){
	}
 
 	public XuqiuhuifuView(XuqiuhuifuEntity xuqiuhuifuEntity){
 	try {
			BeanUtils.copyProperties(this, xuqiuhuifuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
