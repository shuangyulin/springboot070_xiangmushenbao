package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 项目中检
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-21 16:28:28
 */
@TableName("xiangmuzhongjian")
public class XiangmuzhongjianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiangmuzhongjianEntity() {
		
	}
	
	public XiangmuzhongjianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 项目名称
	 */
					
	private String xiangmumingcheng;
	
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
	 * 立项时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date lixiangshijian;
	
	/**
	 * 计划结束时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jihuajieshushijian;
	
	/**
	 * 项目进展情况
	 */
					
	private String xiangmujinzhanqingkuang;
	
	/**
	 * 项目成员是否变化
	 */
					
	private String xiangmuchengyuanshifoubianhua;
	
	/**
	 * 能否按时完成计划
	 */
					
	private String nengfouanshiwanchengjihua;
	
	/**
	 * 前旗经费使用情况
	 */
					
	private String qianqijingfeishiyongqingkuang;
	
	/**
	 * 其他需说明的问题
	 */
					
	private String qitaxushuomingdewenti;
	
	/**
	 * 指导老师意见
	 */
					
	private String zhidaolaoshiyijian;
	
	/**
	 * 院系管理员意见
	 */
					
	private String yuanxiguanliyuanyijian;
	
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
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：项目名称
	 */
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
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
	 * 设置：立项时间
	 */
	public void setLixiangshijian(Date lixiangshijian) {
		this.lixiangshijian = lixiangshijian;
	}
	/**
	 * 获取：立项时间
	 */
	public Date getLixiangshijian() {
		return lixiangshijian;
	}
	/**
	 * 设置：计划结束时间
	 */
	public void setJihuajieshushijian(Date jihuajieshushijian) {
		this.jihuajieshushijian = jihuajieshushijian;
	}
	/**
	 * 获取：计划结束时间
	 */
	public Date getJihuajieshushijian() {
		return jihuajieshushijian;
	}
	/**
	 * 设置：项目进展情况
	 */
	public void setXiangmujinzhanqingkuang(String xiangmujinzhanqingkuang) {
		this.xiangmujinzhanqingkuang = xiangmujinzhanqingkuang;
	}
	/**
	 * 获取：项目进展情况
	 */
	public String getXiangmujinzhanqingkuang() {
		return xiangmujinzhanqingkuang;
	}
	/**
	 * 设置：项目成员是否变化
	 */
	public void setXiangmuchengyuanshifoubianhua(String xiangmuchengyuanshifoubianhua) {
		this.xiangmuchengyuanshifoubianhua = xiangmuchengyuanshifoubianhua;
	}
	/**
	 * 获取：项目成员是否变化
	 */
	public String getXiangmuchengyuanshifoubianhua() {
		return xiangmuchengyuanshifoubianhua;
	}
	/**
	 * 设置：能否按时完成计划
	 */
	public void setNengfouanshiwanchengjihua(String nengfouanshiwanchengjihua) {
		this.nengfouanshiwanchengjihua = nengfouanshiwanchengjihua;
	}
	/**
	 * 获取：能否按时完成计划
	 */
	public String getNengfouanshiwanchengjihua() {
		return nengfouanshiwanchengjihua;
	}
	/**
	 * 设置：前旗经费使用情况
	 */
	public void setQianqijingfeishiyongqingkuang(String qianqijingfeishiyongqingkuang) {
		this.qianqijingfeishiyongqingkuang = qianqijingfeishiyongqingkuang;
	}
	/**
	 * 获取：前旗经费使用情况
	 */
	public String getQianqijingfeishiyongqingkuang() {
		return qianqijingfeishiyongqingkuang;
	}
	/**
	 * 设置：其他需说明的问题
	 */
	public void setQitaxushuomingdewenti(String qitaxushuomingdewenti) {
		this.qitaxushuomingdewenti = qitaxushuomingdewenti;
	}
	/**
	 * 获取：其他需说明的问题
	 */
	public String getQitaxushuomingdewenti() {
		return qitaxushuomingdewenti;
	}
	/**
	 * 设置：指导老师意见
	 */
	public void setZhidaolaoshiyijian(String zhidaolaoshiyijian) {
		this.zhidaolaoshiyijian = zhidaolaoshiyijian;
	}
	/**
	 * 获取：指导老师意见
	 */
	public String getZhidaolaoshiyijian() {
		return zhidaolaoshiyijian;
	}
	/**
	 * 设置：院系管理员意见
	 */
	public void setYuanxiguanliyuanyijian(String yuanxiguanliyuanyijian) {
		this.yuanxiguanliyuanyijian = yuanxiguanliyuanyijian;
	}
	/**
	 * 获取：院系管理员意见
	 */
	public String getYuanxiguanliyuanyijian() {
		return yuanxiguanliyuanyijian;
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
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
