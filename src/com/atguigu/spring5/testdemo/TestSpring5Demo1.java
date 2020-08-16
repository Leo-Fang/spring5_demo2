package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.autowire.Emp;
import com.atguigu.spring5.bean.Orders;
import com.atguigu.spring5.collectiontype.Book;
import com.atguigu.spring5.collectiontype.Course;
import com.atguigu.spring5.collectiontype.Stu;
import com.atguigu.spring5.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Leo
 * @date 2020/7/25 - 16:11
 */

public class TestSpring5Demo1 {

    @Test
    public void testCollection1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu",Stu.class);
        Stu stu2 = context.getBean("stu2",Stu.class);
        stu.test();
        stu2.test2();
    }

    @Test
    public void testCollection2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book",Book.class);
        Book book2 = context.getBean("book",Book.class);
//        book.test();
        System.out.println(book);
        System.out.println(book2);
    }

    @Test
    public void testFactoryBean3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean("myBean",Course.class);
        System.out.println(course);
    }

    @Test
    public void testBean4() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders",Orders.class);
        System.out.println("第四步：获取创建bean实例对象");
        System.out.println(orders);

        //手动让bean实例销毁
        context.close();
    }

    @Test
    public void test5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp",Emp.class);
        System.out.println(emp);
    }

}
