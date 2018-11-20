package com.wang.test.entities;

import java.util.Date;

public class User {
    private Integer userId;
    private String userName;
    private String passWord;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString(){
        return this.userId+":"+this.userName+":"+this.passWord;
    }



    private Integer id;
    private String appName;
    private String packageName;
    private String downloadUrl;
    private String version;
    private String source;
    private String pushSdk;
    private String fileLocation;
    /**
     * 0->创建初始状态
     * 1->apk 下载中
     * 2->apk 下载完成
     * 3->apk 解析中
     * 4->apk 解析完成
     * 5->apk 失败
     * */

    // TODO: 18/8/28 这个状态是所有失败状态的一个统称吗？不需要具体区分是哪一个步骤的失败吗？？？？
    // TODO: 18/8/28 这些状态都有对应的数字，状态数字的映射是在哪里呢？

    private Integer status;
    private Date createTime;







}
