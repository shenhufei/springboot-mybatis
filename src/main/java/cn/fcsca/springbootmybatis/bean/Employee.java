package cn.fcsca.springbootmybatis.bean;

import lombok.Data;

/**
 * Employee
 *
 * @author Fcscanf@樊乘乘
 * @description
 * @date 下午 15:22 2018-08-14
 */
@Data
public class Employee {
    private Integer id;
    private String lastName;
    private Integer gender;
    private String email;
    private Integer dId;
}
