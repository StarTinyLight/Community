package com.star.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
/**
 * @Author Star
 * @Date 2022/5/21 10:14
 * @Version 1.0
 */
@Repository
@Primary
public class AlphaDaoMyBatisImpl implements AlphaDao{
    @Override
    public String select() {
        return "MyBatis";
    }
}
