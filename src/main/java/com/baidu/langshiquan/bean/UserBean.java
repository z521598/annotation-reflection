package com.baidu.langshiquan.bean;

import com.baidu.langshiquan.annotation.Description;

/**
 * Created by langshiquan on 17/10/4.
 */
@Description("class")
public class UserBean {
    private int id;

    @Description("param")
    private String name;

    @Description("method")
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
}
