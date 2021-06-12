package com.example.demo.packet;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

import java.nio.charset.StandardCharsets;

/**
 * @Author ninan
 * @Description
 * @Date  2021/6/12
 **/
public class PacketHandler extends SimpleChannelInboundHandler<MyMessageProtol> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MyMessageProtol msg) {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        for (int i = 0; i < 5; i++) {
            String msg = "hello packet test";
            MyMessageProtol myMessageProtol = new MyMessageProtol();
            myMessageProtol.setLen(msg.getBytes(CharsetUtil.UTF_8).length);
            myMessageProtol.setContent(msg.getBytes(CharsetUtil.UTF_8));
            ctx.writeAndFlush(myMessageProtol);
        }
    }
}
