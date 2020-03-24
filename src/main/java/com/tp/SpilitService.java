package com.tp;

/**
 * 1、将配置文件中指定字符串，按照给定的字符进行切割
 * 2、通过自动配置，将该Service注册为Spring bean
 */
public class SpilitService {
    /**
     * 目标字符串
     */
    private String targetString;

    public SpilitService(String targetString){
        this.targetString = targetString;
    }

    /**
     * 切割
     * @param spilitString
     * @return
     */
    public String[] spilit(String spilitString){
        return targetString.split(spilitString);
    }
}
