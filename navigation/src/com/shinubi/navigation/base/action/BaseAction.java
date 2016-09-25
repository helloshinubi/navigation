package com.shinubi.navigation.base.action;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName:BaseAction
 * @Function: the baseAction offer the base function for other Action.
 * @Reason: include the base function.
 * @Date: 2016-9-24 下午9:08:49
 * @author ShiNubi
 * @version
 */
public class BaseAction extends ActionSupport implements ServletRequestAware, ServletResponseAware,
        Serializable {

    /**
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).
     */
    private static final long serialVersionUID = 1L;

    public String returnPageURL;
    public String currentURL;
    public String returnParamater;

    public HttpServletRequest request;
    public HttpServletResponse response;
    public Map<String, Object> dataMap = new HashMap<String, Object>();
    
    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }

    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }
    
    public Map<String,Object> getSession(){
        return ActionContext.getContext().getSession();
    }

    public String getReturnPageURL() {
        return returnPageURL;
    }

    public void setReturnPageURL(String returnPageURL) {
        this.returnPageURL = returnPageURL;
    }

    public String getCurrentURL() {
        return currentURL;
    }

    public void setCurrentURL(String currentURL) {
        this.currentURL = currentURL;
    }

    public String getReturnParamater() {
        return returnParamater;
    }

    public void setReturnParamater(String returnParamater) {
        this.returnParamater = returnParamater;
    }

    public Map<String, Object> getDataMap() {
        return dataMap;
    }

    public void setDataMap(Map<String, Object> dataMap) {
        this.dataMap = dataMap;
    }

}
