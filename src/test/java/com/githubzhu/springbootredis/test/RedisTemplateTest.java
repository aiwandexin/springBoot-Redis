package com.githubzhu.springbootredis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import javax.crypto.interfaces.PBEKey;
import java.security.PublicKey;

/**
 * @Author: github_zhu
 * @Describtion:
 * @Date:Created in 2020/5/5 22:47
 * @ModifiedBy:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTemplateTest {
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Test
    public void test1() {
        ValueOperations<Object, Object> ops = redisTemplate.opsForValue();
        String cat = "cat";
        ops.set("animal", cat);
    }


}

