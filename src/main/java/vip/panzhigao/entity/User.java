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
 * 用户表
 * </p>
 *
 * @author panzhigao
 * @since 2020-06-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_user")
public class User implements Serializable {


    /**
     * 用户id
     */
    @TableId("id")
    private Long id;

    /**
     * 性别 0-未知，1-男，2-女
     */
    @TableField("sex")
    private Integer sex;

    /**
     * 用户名
     */
    @TableField("username")
    private String username;

    /**
     * 昵称
     */
    @TableField("nickname")
    private String nickname;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 最近登陆时间
     */
    @TableField("last_login_time")
    private Date lastLoginTime;

    /**
     * 0-禁用，1-正常
     */
    @TableField("status")
    private Integer status;

    /**
     * 手机号
     */
    @TableField("telephone")
    private String telephone;

    /**
     * 修改时间
     */
    @TableField("update_time")
    private Date updateTime;

    /**
     * 用户头像
     */
    @TableField("user_portrait")
    private String userPortrait;

    /**
     * 更新人id
     */
    @TableField("update_user_id")
    private Long updateUserId;

    /**
     * 管理员标志，0-否，1-是
     */
    @TableField("admin_flag")
    private Integer adminFlag;

    /**
     * 地址
     */
    @TableField("address")
    private String address;

    /**
     * 用户简介
     */
    @TableField("user_brief")
    private String userBrief;


}
