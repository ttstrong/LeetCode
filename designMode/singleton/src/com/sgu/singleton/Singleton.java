package com.sgu.singleton;


/**
 * @Author T-T强
 * @Date 2022/8/5 9:34
 */
public class Singleton{

    /**
     * 懒汉式，线程不安全
     */
//    private static Singleton instance;
//    private Singleton(){}
//    public static Singleton getInstance(){
//        if (instance == null){
//            instance=new Singleton();
//        }
//        return instance;
//    }


    /**
     * 懒汉式，线程安全
     */
//    private static Singleton instance;
//    private Singleton(){}
//    public static synchronized Singleton getInstance(){
//        if (instance == null){
//            instance=new Singleton();
//        }
//        return instance;
//    }


    /**
     * 饿汉式
     */
//    private static Singleton instance=new Singleton();
//
//    private Singleton(){}
//    public static Singleton getInstance(){
//        return instance;
//    }

    //懒汉式：静态内部类
//    public class Singleton {
//        //私有构造方法
//        private Singleton() {}
//
//        //定义一个静态内部类
//        private static class SingletonHolder{
//            //在内部类中声明并初始化外部类的对象
//            private static final Singleton INSTANCE  = new Singleton();
//        }
//
//        //提供公共访问方式
//        public static Singleton getInstance(){
//            return SingletonHolder.INSTANCE;
//        }
//    }


    /**
     * 懒汉式-双重校验锁-线程安全
     */
    private volatile static Singleton Instance;
    private Singleton(){}

    public static Singleton getInstance(){
        //先判断实例是否存在，不存在再加锁
        if (Instance == null){
            //由于Instace实例有没有被创建过实例不知道，只能对其clss加锁
            synchronized (Singleton.class){
                //当多个线程的时候，只有一个进入，避免多次创建对象！
                if (Instance == null) {
                    Instance=new Singleton();
                }
            }
        }
        return Instance;
    }
}
