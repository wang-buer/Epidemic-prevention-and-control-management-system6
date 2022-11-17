package com.entity.view;

import com.entity.PeicanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 配餐信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
@TableName("peicanxinxi")
public class PeicanxinxiView  extends PeicanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeicanxinxiView(){
	}
 
 	public PeicanxinxiView(PeicanxinxiEntity peicanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, peicanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
