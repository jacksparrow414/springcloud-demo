package com.example.clientone.democlientone.entity;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author jacksparrow414
 * @date 2020-03-07
 * @description: TODO
 */
@TableName(value = "user")
public class User {
    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
