package com.star.community.dao;

import org.springframework.stereotype.Repository;
/**
 * @Author Star
 * @Date 2022/5/21 0:01
 * @Version 1.0
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
