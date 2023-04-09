package com.lzz.gulimall.coupon.feign;


import com.lzz.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CouponFenignService {

    @RequestMapping("/coupon/coupon/memeber/list")
    public R memberCoupons();
}
