package com.atguigu.spring5.collectiontype;

/**
 * @author Leo
 * @date 2020/7/25 - 16:33
 */

//课程类
public class Course {

    private String cname;//课程名称

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" + "cname='" + cname + '\'' + '}';
    }

}
