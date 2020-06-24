package vip.panzhigao.service.impl;

import vip.panzhigao.entity.ArticleCategory;
import vip.panzhigao.mapper.ArticleCategoryMapper;
import vip.panzhigao.service.IArticleCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章分类表 服务实现类
 * </p>
 *
 * @author panzhigao
 * @since 2020-06-24
 */
@Service
public class ArticleCategoryServiceImpl extends ServiceImpl<ArticleCategoryMapper, ArticleCategory> implements IArticleCategoryService {

}
