package com.superbeyone.design.pattern.creational.simplefactory;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className VideoFactory
 * @description
 * @date 2019-03-22 14:44
 **/

public class VideoFactory {

    public Video getVideo1(String type) {
        if ("java".equals(type)) {
            return new JavaVideo();
        } else if ("python".equals(type)) {
            return new PythonVideo();
        } else {
            return null;
        }
    }

    //反射方式
    public Video getVideo2(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
