package com.hc.market.service;

import com.hc.market.bean.User;
import com.hc.market.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper mapper;

    public List<User> select(){
        return mapper.select();
    };


}
