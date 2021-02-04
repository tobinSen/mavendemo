package com.maven.pay;

/**
 * 场景：代码commit到本地仓库，还没有push到远程仓库，这时要回退代码。
 *
 * 介绍下Reset Head中三种Reset Type类型：
 *
 * 1.Mixed（默认）：它回退到某个版本，本地会保留源码，回退commit和index信息(add 信息)，若要提交重新commit。
 *
 * 2.soft: 回退到某个版本，只回退了commit的信息，不会恢复到index file一级，若要提交重新commit。
 *
 * 3.Hard:彻底回退到某个版本，本地的源码也会变为上一个版本的内容。
 */
public interface Maven {

    public static void main(String[] args) {
        System.out.println("==================== maven git commit ====================");
        System.out.println("==================== maven git commit ====================");
        System.out.println("==================== maven git commit ====================");
        System.out.println("==================== maven git commit ====================");
        System.out.println("==================== maven git commit ====================");
        System.out.println("==================== maven git commit ====================");
        System.out.println("==================== maven git commit ====================");
        System.out.println("==================== maven git end ====================");




    }
}
