package com.lzz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzz.common.utils.PageUtils;
import com.lzz.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * Ʒ
 *
 * @author lazzy
 * @email lazzy@gmail.com
 * @date 2023-04-08 11:10:04
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

