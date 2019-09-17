package edu.cn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program First
 * @description:
 * @author:
 * @create:2019-09-17 11:20:15
 **/

public class Main {
    public static void main(String[] args){
        ApplicationContext context  = new ClassPathXmlApplicationContext
                ("beans.xml");

        Circle c = context.getBean(Circle.class);
        c.draw();
    }
}
