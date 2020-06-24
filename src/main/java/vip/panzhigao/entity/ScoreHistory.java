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
 * 积分历史表
 * </p>
 *
 * @author panzhigao
 * @since 2020-06-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_score_history")
public class ScoreHistory implements Serializable {


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
     * 积分类型，1-登陆，2-发表文章成功，3-回帖,4-签到.5-注册
     */
    @TableField("type")
    private Integer type;

    /**
     * 类型名
     */
    @TableField("type_name")
    private String typeName;

    /**
     * 积分
     */
    @TableField("score")
    private Integer score;

    /**
     * 积分获取日期
     */
    @TableField("score_date")
    private Date scoreDate;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 积分总计
     */
    @TableField("total_score")
    private Integer totalScore;


}
