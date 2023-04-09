package com.lzz.gulimall.coupon;

import com.lzz.gulimall.coupon.entity.CouponEntity;
import com.lzz.gulimall.coupon.service.CouponService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallCouponTest {

    @Autowired
    private CouponService couponService;


    @Test
    public void test(){
        CouponEntity coupon = new CouponEntity();
        coupon.setCouponName("111");
        coupon.setCouponName("111");

    }

}
