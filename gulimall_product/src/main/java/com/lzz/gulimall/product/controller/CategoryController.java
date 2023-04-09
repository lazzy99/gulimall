package com.lzz.gulimall.product.controller;

import com.lzz.common.utils.PageUtils;
import com.lzz.common.utils.R;
import com.lzz.gulimall.product.entity.CategoryEntity;
import com.lzz.gulimall.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * @author lazzy
 * @email lazzy@gmail.com
 * @date 2023-04-08 11:10:04
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {


    @Autowired
    private CategoryService categoryService;

    /**
     * 查出索引分类以及子分类，以树形结构组装
     */

    @RequestMapping("/list/tree")
    public R list() {
        //1、查出所有分类
        List<CategoryEntity> list = categoryService.list();

        //2、组装成父子的树形结构

        //2.1找到所有的一级分类
        List<CategoryEntity> collect = list.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0
        ).map((item) -> {
            item.setChirdren(getChirdren(item, list));
            return item;
        }).sorted((list1, list2) -> {
            return (list1.getSort()==null?0:list1.getSort()) - (list2.getSort()==null?0:list2.getSort());
        }).collect(Collectors.toList());


        return R.ok().put("collect", collect);
    }

    public List<CategoryEntity> getChirdren(CategoryEntity category, List<CategoryEntity> categoryEntityList) {
        List<CategoryEntity> collect = categoryEntityList.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == category.getCatId();
        }).map(categoryEntity -> {
            categoryEntity.setChirdren(getChirdren(categoryEntity, categoryEntityList));
            return categoryEntity;
        }).sorted((list1, list2) -> {
            return (list1.getSort()==null?0:list1.getSort()) - (list2.getSort()==null?0:list2.getSort());
        }).collect(Collectors.toList());
        return collect;
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:category:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = categoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    //@RequiresPermissions("product:category:info")
    public R info(@PathVariable("catId") Long catId) {
        CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:category:save")
    public R save(@RequestBody CategoryEntity category) {
        categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:category:update")
    public R update(@RequestBody CategoryEntity category) {
        categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:category:delete")
    public R delete(@RequestBody Long[] catIds) {
        categoryService.removeByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
