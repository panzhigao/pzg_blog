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
 * 异常信息日志表
 * </p>
 *
 * @author panzhigao
 * @since 2020-06-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_exception_log")
public class ExceptionLog implements Serializable {


    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    @TableField("username")
    private String username;

    /**
     * 远程访问主机IP
     */
    @TableField("ip")
    private Integer ip;

    /**
     * 类名
     */
    @TableField("class_name")
    private String className;

    /**
     * 方法名
     */
    @TableField("method_name")
    private String methodName;

    /**
     * 异常类型
     */
    @TableField("exception_type")
    private String exceptionType;

    /**
     * 异常信息
     */
    @TableField("exception_msg")
    private String exceptionMsg;

    /**
     * 是否查看，0：未查看、1：已查看
     */
    @TableField("is_view")
    private Integer isView;

    /**
     * 异常发生时间
     */
    @TableField("create_time")
    private Date createTime;


}
