package com.entity.view;

import com.entity.GelirenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 隔离人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
@TableName("gelirenyuan")
public class GelirenyuanView  extends GelirenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GelirenyuanView(){
	}
 
 	public GelirenyuanView(GelirenyuanEntity gelirenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, gelirenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
