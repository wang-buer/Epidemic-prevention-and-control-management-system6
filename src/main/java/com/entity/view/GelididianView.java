package com.entity.view;

import com.entity.GelididianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 隔离地点
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
@TableName("gelididian")
public class GelididianView  extends GelididianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GelididianView(){
	}
 
 	public GelididianView(GelididianEntity gelididianEntity){
 	try {
			BeanUtils.copyProperties(this, gelididianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
