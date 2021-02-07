package com.drips.mybatis.entity;

/**
 * @author lijb
 */
public enum Gender {

    WOMEN(1, "女"),
    MAN(0, "男");

    Gender(int gender, String desc) {
        this.desc = desc;
        this.gender = gender;
    }

    private int gender;
    private String desc;

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }}
