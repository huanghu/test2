package nio.block;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerSocketChannelDemo {
	public void startSimpleServer() throws IOException{
		ServerSocketChannel channel = ServerSocketChannel.open();
		channel.bind(new InetSocketAddress("localhost", 10800));
		while(true){
			try(SocketChannel sc = channel.accept()){
				sc.write(ByteBuffer.wrap("Hello".getBytes("UTF-8")));
			}	
		}
	}
	
	public static void main(String[] args){
		ServerSocketChannelDemo demo = new ServerSocketChannelDemo();
		try {
			demo.startSimpleServer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
