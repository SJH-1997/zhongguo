package com.beijing.dto;

/**
 * @author shenjianhua
 * @create 2019/6/18 15:34
 * @package com.beijing.dto
 */

public class HelloWorld {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("haidianquqinghezhen");
        System.out.println("buffer=" + stringBuffer);

        //删除下标从3到5的字符
        stringBuffer.delete(3, 5);
        System.out.println(stringBuffer);

        stringBuffer = new StringBuffer("012515465");
        //删除下标为8的字符
        stringBuffer.deleteCharAt(8);
        System.out.println(stringBuffer);

    }
}
