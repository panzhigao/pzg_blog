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
 * 权限表
 * </p>
 *
 * @author panzhigao
 * @since 2020-06-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_permission")
public class Permission implements Serializable {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 权限名
     */
    @TableField("permission_name")
    private String permissionName;

    /**
     * 权限点
     */
    @TableField("permission_point")
    private String permissionPoint;

    /**
     * url路径
     */
    @TableField("url")
    private String url;

    /**
     * 父级id
     */
    @TableField("pid")
    private Long pid;

    /**
     * 层级数
     */
    @TableField("level")
    private Integer level;

    /**
     * 排序
     */
    @TableField("sort")
    private Integer sort;

    /**
     * 图标
     */
    @TableField("icon")
    private String icon;

    /**
     * 类型 0-菜单 1-链接 2-按钮
     */
    @TableField("type")
    private Integer type;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 创建者id
     */
    @TableField("create_user_id")
    private Long createUserId;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;

    /**
     * 修改人
     */
    @TableField("update_user_id")
    private Long updateUserId;


}
