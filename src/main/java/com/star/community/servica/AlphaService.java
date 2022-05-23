package com.star.community.servica;

import com.star.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author Star
 * @Date 2022/5/21 10:26
 * @Version 1.0
 */
@Service
//@Scope("prototype")
//设置Bean不是单例，默认单例
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    public String find(){
        return alphaDao.select();
    }

    public AlphaService(){
        System.out.println("实例化AlphaService");
    }

    @PostConstruct
    //    在构造器之后调用
    public void init(){
        System.out.println("初始化AlphaService");
    }

    @PreDestroy
    //在销毁之前调用
    public void destroy(){
        System.out.println("销毁AlphaService");
    }
}
