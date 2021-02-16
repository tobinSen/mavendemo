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
 *
 *
 *
 * 1、回滚
 * 2、tag
 * 3、补丁 文件还是面板
 * 4、cherry pick 摘樱桃  部分功能进行合并，而非merge全部合并
 *      1、切换到需要记性同步的分支
 *      2、通过Git history 进行cherry pick 进行合并操作
 *
 * sss
 */
public interface Maven {

    public static void main(String[] args) {

        System.out.println("cherry pick");
        System.out.println("second cherry pick");
        System.out.println("four cherry pick");
        System.out.println("five cherry pick");

        System.out.println("six cherry pick");
        System.out.println("seven cherry pick");


        System.out.println("nine cherry pick");
        System.out.println("ten cherry pick");


        System.out.println("ele cherry pick");
        System.out.println("two cherry pick");

    }
}
