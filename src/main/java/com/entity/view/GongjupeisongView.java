package com.entity.view;

import com.entity.GongjupeisongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 工具配送
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-17 10:14:24
 */
@TableName("gongjupeisong")
public class GongjupeisongView  extends GongjupeisongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongjupeisongView(){
	}
 
 	public GongjupeisongView(GongjupeisongEntity gongjupeisongEntity){
 	try {
			BeanUtils.copyProperties(this, gongjupeisongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
