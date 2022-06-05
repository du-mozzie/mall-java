package com.du.mall.product.controller;

import cn.hutool.core.lang.tree.Tree;
import com.du.common.utils.PageUtils;
import com.du.common.utils.R;
import com.du.mall.product.entity.CategoryEntity;
import com.du.mall.product.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [商品三级分类]
 * @Version : [v1.1]
 * @Date : [2022-06-02 14:50:30]
 */
@RestController
@RequestMapping("product/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    /**
     * 查出所有分类以及子分类，以树形结构组装起来
     */
    @RequestMapping("/list/tree")
    public R listTree() {
        List<Tree<Long>> entities = categoryService.listWithTree();
        return R.ok().put("page", entities);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = categoryService.queryPage(params);
        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    // @RequiresPermissions("product:category:info")
    public R info(@PathVariable("catId") Long catId) {
        CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:category:save")
    public R save(@RequestBody CategoryEntity category) {
        categoryService.save(category);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:category:update")
    public R update(@RequestBody CategoryEntity category) {
        categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     *
     * @RequestBody：获取请求体,必须发送POST请求 SpringMVC自动将请求体的数据(json), 转为对应的对象
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:category:delete")
    public R delete(@RequestBody List<Long> catIds) {
        categoryService.removeMenusByIds(catIds);
        return R.ok();
    }
}
