package org.wyq;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wyq.entity.Person;

import static org.junit.Assert.*;

public class MyTest {

    private Person person;

    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @Test
    public void test1(){
        person = new Person(1, "张三", 12);
        System.out.println(person);
    }
}