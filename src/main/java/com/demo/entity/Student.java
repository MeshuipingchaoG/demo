package com.demo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Student {

    /**
     * 学生id
     */
    private Integer id;

    /**
     * 学生姓名
     */
    private String name;

    /**
     * 性别
     */
    private Boolean gender;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 头像
     */
    private String headImageFilePath;

}
