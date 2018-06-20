package com.thxjava.dp.observer;

public class TestObserver {

    public static void main(String[] args) throws Exception {

        TeacherSubject teacher = new TeacherSubject();

        StudentObserver jack = new StudentObserver("jack", teacher);
        StudentObserver mark = new StudentObserver("mark", teacher);

        teacher.setInfo("测试题1");
        teacher.notifyObserver();

        System.out.println("=============================");

        teacher.setInfo("测试题2");
        teacher.deleteObserver(jack);
        teacher.notifyObserver();

        System.out.println("=============================");

        teacher.addObserver(jack);
        teacher.notifyObserver();
    }

}
