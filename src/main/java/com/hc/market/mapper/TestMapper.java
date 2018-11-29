package com.hc.market.mapper;

import com.hc.market.bean.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {

    @Select("select * from user_table")
    public List<User> select();




}
