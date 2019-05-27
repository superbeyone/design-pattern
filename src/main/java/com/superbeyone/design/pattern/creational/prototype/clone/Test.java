package com.superbeyone.design.pattern.creational.prototype.clone;

import com.superbeyone.design.pattern.creational.singleton.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Test
 * @description
 * @date 2019-05-27 08:53
 **/

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇", birthday);
        Pig pig2 = (Pig) pig1.clone();

        System.out.println(pig1);

        System.out.println(pig2);

        System.out.println("---------------------------");
        pig1.getBirthday().setTime(8888888888888L);
        System.out.println(pig1);
        System.out.println(pig2);

        System.out.println("---------------------------");
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);

        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
        System.out.println(hungrySingleton);
        System.out.println(cloneHungrySingleton);


    }

}
