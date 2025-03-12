package com.entity.model;

import com.entity.XueshengjiaofeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学生缴费
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-25 15:35:13
 */
public class XueshengjiaofeiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 缴费类型
	 */
	
	private String jiaofeileixing;
		
	/**
	 * 缴费金额
	 */
	
	private Float jiaofeijine;
		
	/**
	 * 缴费明细
	 */
	
	private String jiaofeimingxi;
		
	/**
	 * 缴费时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiaofeishijian;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：缴费类型
	 */
	 
	public void setJiaofeileixing(String jiaofeileixing) {
		this.jiaofeileixing = jiaofeileixing;
	}
	
	/**
	 * 获取：缴费类型
	 */
	public String getJiaofeileixing() {
		return jiaofeileixing;
	}
				
	
	/**
	 * 设置：缴费金额
	 */
	 
	public void setJiaofeijine(Float jiaofeijine) {
		this.jiaofeijine = jiaofeijine;
	}
	
	/**
	 * 获取：缴费金额
	 */
	public Float getJiaofeijine() {
		return jiaofeijine;
	}
				
	
	/**
	 * 设置：缴费明细
	 */
	 
	public void setJiaofeimingxi(String jiaofeimingxi) {
		this.jiaofeimingxi = jiaofeimingxi;
	}
	
	/**
	 * 获取：缴费明细
	 */
	public String getJiaofeimingxi() {
		return jiaofeimingxi;
	}
				
	
	/**
	 * 设置：缴费时间
	 */
	 
	public void setJiaofeishijian(Date jiaofeishijian) {
		this.jiaofeishijian = jiaofeishijian;
	}
	
	/**
	 * 获取：缴费时间
	 */
	public Date getJiaofeishijian() {
		return jiaofeishijian;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
