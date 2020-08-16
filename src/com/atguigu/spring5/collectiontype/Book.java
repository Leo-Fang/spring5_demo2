package com.atguigu.spring5.collectiontype;

import java.util.List;

/**
 * @author Leo
 * @date 2020/7/25 - 17:19
 */

public class Book {

    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test() {
        System.out.println(list);
    }

}
