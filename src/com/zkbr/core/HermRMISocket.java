
package com.zkbr.core;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.server.RMISocketFactory;


/**
 * 	１）从RMISocketFactory继承，重写你自己的createServerSocket(int port) 与createSocket(String host, int port) 
	２）用setSocketFactory(RMISocketFactory fac) 向RMI运行时　进行注册就行了。
 * @author admin
 *
 */
public class HermRMISocket extends RMISocketFactory {

	@Override
	public ServerSocket createServerSocket(int port) throws IOException {
		if (port == 0)
		{
			port = 8388;
		}
		return new ServerSocket(port);
	}

	@Override
	public Socket createSocket(String host, int port) throws IOException {
		return new Socket(host, port);
	}

}
