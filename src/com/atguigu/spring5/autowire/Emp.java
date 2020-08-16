package com.atguigu.spring5.autowire;

/**
 * @author Leo
 * @date 2020/7/26 - 16:48
 */

public class Emp {

    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" + "dept=" + dept + '}';
    }

    public void test() {
        System.out.println(dept);
    }

}
