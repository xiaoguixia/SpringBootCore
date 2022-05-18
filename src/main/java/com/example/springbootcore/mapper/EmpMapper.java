package com.example.springbootcore.mapper;

import com.example.springbootcore.bean.Emp;
import com.example.springbootcore.bean.EmpExample;
import com.example.springbootcore.bean.EmpKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface EmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    long countByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    int deleteByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    int deleteByPrimaryKey(EmpKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    int insert(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    int insertSelective(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    List<Emp> selectByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    Emp selectByPrimaryKey(EmpKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    int updateByExampleSelective(@Param("record") Emp record, @Param("example") EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    int updateByExample(@Param("record") Emp record, @Param("example") EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    int updateByPrimaryKeySelective(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    int updateByPrimaryKey(Emp record);
}