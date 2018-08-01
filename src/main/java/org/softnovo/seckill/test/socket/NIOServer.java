package org.softnovo.seckill.test.socket;

import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;

public class NIOServer {
	public static void main(String[] args) {
		try {
			ServerSocketChannel ssc = ServerSocketChannel.open();
			ssc.socket().bind(new InetSocketAddress(8080));
			ssc.configureBlocking(false);
			
			Selector selector = Selector.open();
			ssc.register(selector, SelectionKey.OP_ACCEPT);
			
			Handler handler = new Handler(1024);
			while (true) {
				if (selector.select(3000) == 0) {
					System.out.println("等待请求超时······");
					continue;
				}
				
				System.out.println("处理请求······");
				
				Iterator<SelectionKey> keyIter = selector.selectedKeys().iterator();
				while (keyIter.hasNext()) {
					SelectionKey key = keyIter.next();
					try {
						if (key.isAcceptable()) {
							handler.handleAccept(key);
						}
						
						if (key.isReadable()) {
							handler.handleRead(key);
						}
					} catch (Exception e) {
						keyIter.remove();
						continue;
					}
					keyIter.remove();
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
