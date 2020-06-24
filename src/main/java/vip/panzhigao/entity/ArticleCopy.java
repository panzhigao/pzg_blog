package vip.panzhigao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 文章表
 * </p>
 *
 * @author panzhigao
 * @since 2020-06-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_article_copy")
public class ArticleCopy implements Serializable {


    @TableId("id")
    private Long id;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 用户名
     */
    @TableField("username")
    private String username;

    /**
     * 0-审核未通过，1-草稿，2-审核中，3-发布成功，4-下线
     */
    @TableField("status")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField("update_time")
    private Date updateTime;

    /**
     * 发布时间
     */
    @TableField("publish_time")
    private Date publishTime;

    /**
     * 文章标题
     */
    @TableField("title")
    private String title;

    /**
     * 文章内容
     */
    @TableField("content")
    private String content;

    /**
     * 文章概要
     */
    @TableField("outline")
    private String outline;

    /**
     * 缩略图
     */
    @TableField("image")
    private String image;

    /**
     * 评论数
     */
    @TableField("comment_count")
    private Integer commentCount;

    /**
     * 阅读数
     */
    @TableField("view_count")
    private Integer viewCount;

    /**
     * 1-文章 2系统公告
     */
    @TableField("type")
    private Integer type;

    /**
     * 置顶系数,0-未置顶，1-置顶
     */
    @TableField("top")
    private Integer top;

    /**
     * 是否是精品贴，0-否，1-是
     */
    @TableField("high_quality")
    private Integer highQuality;

    /**
     * 文章分类
     */
    @TableField("category_id")
    private Long categoryId;


}
