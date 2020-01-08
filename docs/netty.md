* netty之IdleStateHandler

最近在将公司一个设备对接控制的项目改造优化的过程中，将原生的socket客户端操作短连接改成netty
其中有一个需求就是超过一定时间没有数据通信时将连接断开，于是想到了IdleStateHandler,之前有用过这个来做心跳功能，这里只需要添加这个Handler和另外一个Handler实现方法

```javascript
断开连接
        public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
            logger.info(ctx + "最近未收到消息，连接即将关闭");
            if (evt instanceof IdleStateEvent){
                ctx.channel().close();
                group.shutdownGracefully();
                logger.info(ctx + "关闭连接");
            } else {
                super.userEventTriggered(ctx, evt);
            }
        }
pipeline
                ChannelPipeline pipeline = ch.pipeline();
                pipeline.addLast("frameDecoder", new LEDDecoder());
                pipeline.addLast("frameEncoder", new LEDEncoder());
                pipeline.addLast("handler", new LEDDealHandler());
                pipeline.addLast(new IdleStateHandler(20, 0, 0, TimeUnit.SECONDS)); 
                pipeline.addLast(new LEDHeartHandler(group, host));
```
>  问题

发现在连接建立成功后，不管有没有消息都会在20秒后断开连接<br/>
>  解决办法

**最好是将IdleStateHandler放在入站的开头，并且重写userEventTriggered这个方法的handler也就是这里的LEDHeartHandler必须在其后面。否则无法触发这个事件。**
