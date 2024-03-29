package com.entity.model;

import com.entity.ZhuanjiapingshenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 专家评审
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-21 16:28:28
 */
public class ZhuanjiapingshenModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目类型
	 */
	
	private String xiangmuleixing;
		
	/**
	 * 项目描述
	 */
	
	private String xiangmumiaoshu;
		
	/**
	 * 学生团队
	 */
	
	private String xueshengtuandui;
		
	/**
	 * 成员介绍
	 */
	
	private String chengyuanjieshao;
		
	/**
	 * 文件
	 */
	
	private String wenjian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 评审专家
	 */
	
	private String pingshenzhuanjia;
		
	/**
	 * 评委意见
	 */
	
	private String pingweiyijian;
		
	/**
	 * 评审日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingshenriqi;
				
	
	/**
	 * 设置：项目类型
	 */
	 
	public void setXiangmuleixing(String xiangmuleixing) {
		this.xiangmuleixing = xiangmuleixing;
	}
	
	/**
	 * 获取：项目类型
	 */
	public String getXiangmuleixing() {
		return xiangmuleixing;
	}
				
	
	/**
	 * 设置：项目描述
	 */
	 
	public void setXiangmumiaoshu(String xiangmumiaoshu) {
		this.xiangmumiaoshu = xiangmumiaoshu;
	}
	
	/**
	 * 获取：项目描述
	 */
	public String getXiangmumiaoshu() {
		return xiangmumiaoshu;
	}
				
	
	/**
	 * 设置：学生团队
	 */
	 
	public void setXueshengtuandui(String xueshengtuandui) {
		this.xueshengtuandui = xueshengtuandui;
	}
	
	/**
	 * 获取：学生团队
	 */
	public String getXueshengtuandui() {
		return xueshengtuandui;
	}
				
	
	/**
	 * 设置：成员介绍
	 */
	 
	public void setChengyuanjieshao(String chengyuanjieshao) {
		this.chengyuanjieshao = chengyuanjieshao;
	}
	
	/**
	 * 获取：成员介绍
	 */
	public String getChengyuanjieshao() {
		return chengyuanjieshao;
	}
				
	
	/**
	 * 设置：文件
	 */
	 
	public void setWenjian(String wenjian) {
		this.wenjian = wenjian;
	}
	
	/**
	 * 获取：文件
	 */
	public String getWenjian() {
		return wenjian;
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
	 * 设置：评审专家
	 */
	 
	public void setPingshenzhuanjia(String pingshenzhuanjia) {
		this.pingshenzhuanjia = pingshenzhuanjia;
	}
	
	/**
	 * 获取：评审专家
	 */
	public String getPingshenzhuanjia() {
		return pingshenzhuanjia;
	}
				
	
	/**
	 * 设置：评委意见
	 */
	 
	public void setPingweiyijian(String pingweiyijian) {
		this.pingweiyijian = pingweiyijian;
	}
	
	/**
	 * 获取：评委意见
	 */
	public String getPingweiyijian() {
		return pingweiyijian;
	}
				
	
	/**
	 * 设置：评审日期
	 */
	 
	public void setPingshenriqi(Date pingshenriqi) {
		this.pingshenriqi = pingshenriqi;
	}
	
	/**
	 * 获取：评审日期
	 */
	public Date getPingshenriqi() {
		return pingshenriqi;
	}
			
}
