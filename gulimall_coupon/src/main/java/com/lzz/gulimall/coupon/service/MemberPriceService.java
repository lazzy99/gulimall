package com.lzz.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzz.common.utils.PageUtils;
import com.lzz.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 
 *
 * @author lazzy
 * @email lazzy@gmail.com
 * @date 2023-04-08 12:10:40
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

