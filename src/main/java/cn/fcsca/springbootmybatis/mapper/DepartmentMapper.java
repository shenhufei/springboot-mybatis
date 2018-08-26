package cn.fcsca.springbootmybatis.mapper;

import cn.fcsca.springbootmybatis.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * DepartmentMapper Mybatis的Mapper文件配置@Mapper注解或者在SpringBoot文件配置@MapperScan扫描注解
 *
 * @author Fcscanf@樊乘乘
 * @date 下午 16:54 2018-08-14
 */
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
