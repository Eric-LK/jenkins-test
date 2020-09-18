package com.eric.mybatis.dao;


import com.eric.mybatis.model.Person;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * 测试DAO
 *
 * @author  liuBing
 * @Date 2019/10/28  15:14
 */
@Repository
public interface PersonMapper {

     /*
      * @Param 多参数指定参数名字，否则会被封装成map中的param1，param2 。。。
      * */
     List<Person> selectPerson(String id);

     Boolean insertPerson(Person person);

     // 当返回类型是map的时候，告诉mybatis用什么字段作为map的key
     @MapKey("id")
     Map<Integer,Person> selectPersonMapKey(String name);

     Person selectPersonSchool(String id);

     Map selectPersonByIdAndAge(@Param("id") String id,@Param("age") String age);

     Boolean updatePerson(@Param("person") Person person);
}
