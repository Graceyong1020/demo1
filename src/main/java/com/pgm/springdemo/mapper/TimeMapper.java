package com.pgm.springdemo.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
    //@Select("SELECT now()")
    String getTime(); // getTime() 메서드는 조회하는 쿼리를 실행
   // @Select("select count(*) from test_tbl")
    int getCount();


}
