package com.lzz.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author lazzy
 * @email lazzy@gmail.com
 * @date 2023-04-08 11:10:04
 */
@Data
@TableName("pms_attr_group")
public class AttrGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long attrGroupId;
	/**
	 * 
	 */
	private String attrGroupName;
	/**
	 * 
	 */
	private Integer sort;
	/**
	 * 
	 */
	private String descript;
	/**
	 * 
	 */
	private String icon;
	/**
	 * 
	 */
	private Long catelogId;

}
