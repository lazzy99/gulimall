package com.lzz.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu
 * 
 * @author lazzy
 * @email lazzy@gmail.com
 * @date 2023-04-08 11:10:04
 */
@Data
@TableName("pms_product_attr_value")
public class ProductAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long spuId;
	/**
	 * 
	 */
	private Long attrId;
	/**
	 * 
	 */
	private String attrName;
	/**
	 * 
	 */
	private String attrValue;
	/**
	 * ˳
	 */
	private Integer attrSort;
	/**
	 * 
	 */
	private Integer quickShow;

}
