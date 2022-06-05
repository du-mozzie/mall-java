package com.du.mall.product.service;

import cn.hutool.core.lang.tree.Tree;
import com.baomidou.mybatisplus.extension.service.IService;
import com.du.common.utils.PageUtils;
import com.du.mall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [商品三级分类]
 * @Version : [v1.1]
 * @Date : [2022-06-02 14:50:30]
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<Tree<Long>> listWithTree();

    void removeMenusByIds(List<Long> asList);
}

