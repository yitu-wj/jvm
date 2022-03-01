package com.yitu.jvm.chapter7;

/**
 * 通过数组定义来引用类，不会触发此类的初始化
 */
public class NotInitialization_2 {
    public static void main(String[] args) {
        SuperClass[] sca = new SuperClass[10];
    }
}
