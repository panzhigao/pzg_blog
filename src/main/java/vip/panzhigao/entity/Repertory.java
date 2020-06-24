package vip.panzhigao.entity;

import java.math.BigDecimal;
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
 * 库存表
 * </p>
 *
 * @author panzhigao
 * @since 2020-06-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_repertory")
public class Repertory implements Serializable {


    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 规格型号
     */
    @TableField("specification")
    private String specification;

    /**
     * 单位
     */
    @TableField("unit")
    private String unit;

    /**
     * 数量
     */
    @TableField("quantity")
    private Integer quantity;

    /**
     * 单价
     */
    @TableField("unit_price")
    private BigDecimal unitPrice;

    /**
     * 金额
     */
    @TableField("amount")
    private BigDecimal amount;

    /**
     * 税额
     */
    @TableField("tax")
    private BigDecimal tax;

    /**
     * 总价
     */
    @TableField("total_amount")
    private BigDecimal totalAmount;

    /**
     * 创建人
     */
    @TableField("create_user_id")
    private Long createUserId;

    /**
     *  创建时间
     */
    @TableField("create_time")
    private Date createTime;


}
