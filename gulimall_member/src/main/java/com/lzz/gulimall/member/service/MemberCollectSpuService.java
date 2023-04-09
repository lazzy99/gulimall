package com.lzz.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzz.common.utils.PageUtils;
import com.lzz.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 
 *
 * @author lazzy
 * @email lazzy@gmail.com
 * @date 2023-04-08 12:37:26
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
