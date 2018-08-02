package com.example.demo.api.entity;

/**
 * user实体
 */
public class User {
    private String name;
    private Integer age;
    private String profile;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getProfile() {
        return profile;
    }

    @Override
    public String toString() {
        return "abc";
    }
}
