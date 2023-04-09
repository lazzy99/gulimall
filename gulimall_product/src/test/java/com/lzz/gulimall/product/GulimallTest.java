package com.lzz.gulimall.product;

import com.lzz.gulimall.product.entity.BrandEntity;
import com.lzz.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallTest {

    @Autowired
    private BrandService brandService;

    @Test
    public void test(){
        BrandEntity brandEntity =new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setName("zs");
        brandEntity.setDescript("111111111111111");
        brandEntity.setShowStatus(1);
        brandService.save(brandEntity);
        System.out.println(brandService.getById(1));

    }

}
