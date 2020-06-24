package vip.panzhigao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 文章审核表
 * </p>
 *
 * @author panzhigao
 * @since 2020-06-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_article_check")
public class ArticleCheck implements Serializable {


    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
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
     * 文章id
     */
    @TableField("article_id")
    private Long articleId;

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
     * 是否审核完成，0-否，1-是
     */
    @TableField("complete_flag")
    private Integer completeFlag;

    /**
     * 审核类型，0-创建，1-修改
     */
    @TableField("check_type")
    private Integer checkType;

    /**
     * 审核人id
     */
    @TableField("check_user_id")
    private String checkUserId;

    /**
     * 审核人名
     */
    @TableField("check_username")
    private String checkUsername;

    /**
     * 审核时间
     */
    @TableField("check_time")
    private Date checkTime;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 是否通过，0-否，1-是
     */
    @TableField("approve_flag")
    private Integer approveFlag;

    /**
     * 审核备注
     */
    @TableField("remark")
    private String remark;

    /**
     * 文章分类
     */
    @TableField("category_id")
    private Long categoryId;


}
