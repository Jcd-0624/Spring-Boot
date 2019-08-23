package com.chadj.mybatisplus;

import com.chadj.mybatisplus.mapper.UserMapper;
import com.chadj.mybatisplus.vo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void contextLoads() {
        System.out.println("----- select by id -----");
        User user = userMapper.selectById(1L);
        System.out.println(user);

        System.out.println("----- select all -----");
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

}
