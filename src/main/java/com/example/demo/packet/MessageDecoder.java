package com.example.demo.packet;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * @Author ninan
 * @Description
 * @Date  2021/6/12
 **/
public class MessageDecoder extends ByteToMessageDecoder {
    int length = 0;

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) {
        if (in.readableBytes() >= 4) {
            if (length == 0) {
                length = in.readInt();
            }

            if (in.readableBytes() < length) {
                System.out.println("等待");
            }

            byte[] content = new byte[length];
            if (in.readableBytes() >= length) {
                in.readBytes(content);

                MyMessageProtol myMessageProtol = new MyMessageProtol();
                myMessageProtol.setLen(length);
                myMessageProtol.setContent(content);
                out.add(myMessageProtol);
            }
            length = 0;
        }
    }
}
