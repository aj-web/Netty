package com.example.demo.packet;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class MessageEncoder extends MessageToByteEncoder<MyMessageProtol> {
    @Override
    protected void encode(ChannelHandlerContext ctx, MyMessageProtol msg, ByteBuf out) throws Exception {
        out.writeInt(msg.getLen());
        out.writeByte(msg.getContent());
    }
}
