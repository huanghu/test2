package nio.block;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SocketChannelDemo {
	//加载网页
	public void loadWebPageUseSocket() throws Exception{
		try(FileChannel destChannel = FileChannel.open(Paths.get("context.txt"), StandardOpenOption.WRITE, StandardOpenOption.CREATE);
				SocketChannel sc = SocketChannel.open(new InetSocketAddress("www.baidu.com", 80))){
			String request = "GET / HTTP/1.1\r\n\r\nHost: www.baidu.com\r\n\r\n";
			ByteBuffer header = ByteBuffer.wrap(request.getBytes("UTF-8"));
			sc.write(header);
			destChannel.transferFrom(sc, 0, Integer.MAX_VALUE);
		}
	}
	
	public void send2Server(){
		try(SocketChannel sc = SocketChannel.open(new InetSocketAddress("localhost",10800))){
			String message = "test";
			ByteBuffer messageByte = ByteBuffer.wrap(message.getBytes("UTF-8"));
			sc.write(messageByte);
			ByteBuffer dst = ByteBuffer.allocate(1024);
			sc.read(dst);
			dst.flip();
			System.out.println("dst " + dst.array());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public  static void main(String[] args){
		SocketChannelDemo demo = new SocketChannelDemo();
		try {
			demo.send2Server();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
