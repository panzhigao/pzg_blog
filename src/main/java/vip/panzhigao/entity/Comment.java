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
 * 评论信息
 * </p>
 *
 * @author panzhigao
 * @since 2020-06-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_comment")
public class Comment implements Serializable {


    /**
     * id
     */
    @TableId("id")
    private Long id;

    /**
     * 评论者id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 文章id
     */
    @TableField("article_id")
    private Long articleId;

    /**
     * 评论内容
     */
    @TableField("comment_content")
    private String commentContent;

    /**
     * 接收评论者的userId
     */
    @TableField("reply_to_user_id")
    private String replyToUserId;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 点赞数
     */
    @TableField("praise_counts")
    private Long praiseCounts;


}
