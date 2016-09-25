package com.shinubi.navigation.base.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;

/**
 *@ClassName:BaseDao 
 *@Function: 负责管理MyBatis的SqlSession. 
 *@Reason:	 提供给其他的Dao使用. 
 *@Date:     2016-9-24 下午9:45:51 
 *@author   ShiNubi
 *@version   
 */
public class BaseDao {
    
    protected SqlSessionTemplate sqlSessionTemplate;

    @Resource
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
    
}

