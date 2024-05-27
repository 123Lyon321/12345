package com.hj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
<<<<<<< HEAD
 * @author Lyon
 * @since 2024-05-23
=======
 * @author cw
 * @since 2024-05-21
>>>>>>> 5b27481 (init)
 */
@TableName("tb_dept")
@ApiModel(value = "Dept对象", description = "")
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

<<<<<<< HEAD
    private byte[] pid;
=======
    private Integer pid;
>>>>>>> 5b27481 (init)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    public byte[] getPid() {
        return pid;
    }

    public void setPid(byte[] pid) {
=======
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
>>>>>>> 5b27481 (init)
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Dept{" +
            "id = " + id +
            ", name = " + name +
            ", pid = " + pid +
        "}";
    }
}
