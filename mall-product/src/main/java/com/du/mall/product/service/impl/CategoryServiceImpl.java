package com.du.mall.product.service.impl;

import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeNodeConfig;
import cn.hutool.core.lang.tree.TreeUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.du.common.utils.PageUtils;
import com.du.common.utils.Query;
import com.du.mall.product.dao.CategoryDao;
import com.du.mall.product.entity.CategoryEntity;
import com.du.mall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [商品三级分类]
 * @Version : [v1.1]
 * @Date : [2022-06-02 14:50:30]
 */
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<Tree<Long>> listWithTree() {
        // 查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);

        // hutool tree配置
        TreeNodeConfig config = new TreeNodeConfig();
        config.setIdKey("catId");
        config.setParentIdKey("parentCid");
        config.setChildrenKey("children");
        config.setDeep(3);
        config.setWeightKey("sort");

        // hutool 转换器
        return TreeUtil.build(entities, 0L, config, (object, tree) -> {
            tree.putExtra("catId",object.getCatId());
            tree.setName(object.getName());
            tree.putExtra("parentCid", object.getParentCid());
            tree.putExtra("catLevel", object.getCatLevel());
            tree.putExtra("showStatus", object.getShowStatus());
            tree.putExtra("sort", object.getSort());
            tree.putExtra("icon", object.getIcon());
            tree.putExtra("productUnit", object.getProductUnit());
            tree.putExtra("productCount", object.getProductCount());
        });
    }

    @Override
    public void removeMenusByIds(List<Long> asList) {
       // todo 1、检查当前删除的菜单，是否有被别的地方引用
       baseMapper.deleteBatchIds(asList);
    }

}