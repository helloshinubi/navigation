package com.navigation.website;
/**
 *@ClassName:Website 
 *@Function: 某个网站实体. 
 *@Reason:	 Website. 
 *@Date:     2016-9-24 下午9:39:28 
 *@author   ShiNubi
 *@version   
 */
public class Website {

    private int id;
    private String name;
    private String URL;
    private String bgImageURL;
    private String bgColor;
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
    public String getURL() {
        return URL;
    }
    public void setURL(String uRL) {
        URL = uRL;
    }
    public String getBgImageURL() {
        return bgImageURL;
    }
    public void setBgImageURL(String bgImageURL) {
        this.bgImageURL = bgImageURL;
    }
    public String getBgColor() {
        return bgColor;
    }
    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }
    
}

