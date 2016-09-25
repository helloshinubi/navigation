package com.shinubi.navigation.category.dao;

import com.shinubi.navigation.category.Category;

/**
 *@ClassName:CategoryDao 
 *@Function: TODO ADD FUNCTION. 
 *@Reason:	 TODO ADD REASON. 
 *@Date:     2016-9-25 下午2:27:23 
 *@author   ShiNubi
 *@version   
 */
public interface CategoryDao {

    public boolean addCategory(Category category);
    
    public boolean delCategory(int categoryId);
    
    public Category findCategoryById(int categoryId);
    
    public boolean updateCategory(Category category);
}

