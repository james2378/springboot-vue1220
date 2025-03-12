package com.entity.view;

import com.entity.XueshengjiaofeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生缴费
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-25 15:35:13
 */
@TableName("xueshengjiaofei")
public class XueshengjiaofeiView  extends XueshengjiaofeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengjiaofeiView(){
	}
 
 	public XueshengjiaofeiView(XueshengjiaofeiEntity xueshengjiaofeiEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengjiaofeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
