package vip.panzhigao.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import vip.panzhigao.entity.Article;
import vip.panzhigao.service.IArticleService;

/**
 * <p>
 * 文章表 前端控制器
 * </p>
 *
 * @author panzhigao
 * @since 2020-06-24
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    @GetMapping("{id}")
    @ResponseBody
    public Article getById(@PathVariable Long id){
        return articleService.getById(id);
    }
}

