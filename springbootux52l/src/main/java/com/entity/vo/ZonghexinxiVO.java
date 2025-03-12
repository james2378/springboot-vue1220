package com.entity.vo;

import com.entity.ZonghexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 综合信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-25 15:35:13
 */
public class ZonghexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 所在班级
	 */
	
	private String suozaibanji;
		
	/**
	 * 院系
	 */
	
	private String yuanxi;
		
	/**
	 * 班主任
	 */
	
	private String banzhuren;
		
	/**
	 * 宿舍号
	 */
	
	private String sushehao;
		
	/**
	 * 入学日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date ruxueriqi;
				
	
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
	 * 设置：所在班级
	 */
	 
	public void setSuozaibanji(String suozaibanji) {
		this.suozaibanji = suozaibanji;
	}
	
	/**
	 * 获取：所在班级
	 */
	public String getSuozaibanji() {
		return suozaibanji;
	}
				
	
	/**
	 * 设置：院系
	 */
	 
	public void setYuanxi(String yuanxi) {
		this.yuanxi = yuanxi;
	}
	
	/**
	 * 获取：院系
	 */
	public String getYuanxi() {
		return yuanxi;
	}
				
	
	/**
	 * 设置：班主任
	 */
	 
	public void setBanzhuren(String banzhuren) {
		this.banzhuren = banzhuren;
	}
	
	/**
	 * 获取：班主任
	 */
	public String getBanzhuren() {
		return banzhuren;
	}
				
	
	/**
	 * 设置：宿舍号
	 */
	 
	public void setSushehao(String sushehao) {
		this.sushehao = sushehao;
	}
	
	/**
	 * 获取：宿舍号
	 */
	public String getSushehao() {
		return sushehao;
	}
				
	
	/**
	 * 设置：入学日期
	 */
	 
	public void setRuxueriqi(Date ruxueriqi) {
		this.ruxueriqi = ruxueriqi;
	}
	
	/**
	 * 获取：入学日期
	 */
	public Date getRuxueriqi() {
		return ruxueriqi;
	}
			
}
