package com.navigation.category;
/**
 *@ClassName:Category 
 *@Function: 导航模块类型. 
 *@Reason:	 Category. 
 *@Date:     2016-9-24 下午9:34:41 
 *@author   ShiNubi
 *@version   
 */
public class Category {

    private int id;
    private String name;
    private String bgImageURL;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBgImageURL() {
        return bgImageURL;
    }
    public void setBgImageURL(String bgImageURL) {
        this.bgImageURL = bgImageURL;
    }
    
}

