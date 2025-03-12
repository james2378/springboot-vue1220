package com.entity.view;

import com.entity.ZonghexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 综合信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-25 15:35:13
 */
@TableName("zonghexinxi")
public class ZonghexinxiView  extends ZonghexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZonghexinxiView(){
	}
 
 	public ZonghexinxiView(ZonghexinxiEntity zonghexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zonghexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
