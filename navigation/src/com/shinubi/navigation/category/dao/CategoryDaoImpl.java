package com.shinubi.navigation.category.dao;

import org.springframework.stereotype.Component;

import com.shinubi.navigation.base.dao.BaseDao;
import com.shinubi.navigation.category.pojo.Category;

/**
 *@ClassName:CategoryDaoImpl 
 *@Function: TODO ADD FUNCTION. 
 *@Reason:	 TODO ADD REASON. 
 *@Date:     2016-9-25 下午2:30:29 
 *@author   ShiNubi
 *@version   
 */
@Component("CategoryDao")
public class CategoryDaoImpl extends BaseDao implements CategoryDao {

    public boolean addCategory(Category category) {
        boolean flag = false;
        try{
            this.sqlSessionTemplate.insert("insert-category", category);
            flag = true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean delCategory(int categoryId) {
        boolean flag = false;
        try{
            this.sqlSessionTemplate.delete("delete-category-by-id", categoryId);
            flag = true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public Category findCategoryById(int categoryId) {
        Category category = null;
        try{
            category = (Category)this.sqlSessionTemplate.selectOne("select-category-by-id", categoryId);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return category;
    }

    public boolean updateCategory(Category category) {
        boolean flag = false;
        try{
            this.sqlSessionTemplate.update("update-category",category);
            flag = true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

}

