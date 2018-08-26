package cn.fcsca.springbootmybatis.mapper;

import cn.fcsca.springbootmybatis.bean.Employee;

/**
 * EmployeeMapper Mybatis的Mapper文件配置@Mapper注解或者在SpringBoot文件配置@MapperScan扫描注解
 *
 * @author Fcscanf@樊乘乘
 * @date 下午 16:54 2018-08-14
 */
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
