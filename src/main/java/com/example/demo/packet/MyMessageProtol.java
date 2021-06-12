package com.example.demo.packet;

/**
 * @Author ninan
 * @Description
 * @Date  2021/6/12
 **/

public class MyMessageProtol {
    private int len;
    private byte[] content;

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getContent() {
        return content.length;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

}
