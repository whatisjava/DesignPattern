package com.thxjava.dp.observer;

// 具体观察者
public class StudentObserver implements Observer {

    //保存一个具体被观察者的引用,以后如果可以想取消订阅,有了这个引用会比较方便
    private TeacherSubject teacher;

    //学生的姓名,用来标识不同的学生对象
    private String name;

    //构造器用来注册观察者
    public StudentObserver(String name, TeacherSubject teacher) {
        this.name = name;
        this.teacher = teacher;
        //每新建一个学生对象,默认添加到观察者的行列
        teacher.addObserver(this);
    }

    public void update() {
        System.out.println(name + "得到作业:" + teacher.getInfo());
    }

}
