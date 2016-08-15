package com.zkbr.core;

import java.io.IOException;
import java.rmi.server.RMISocketFactory;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zkbr.util.SystemDetails;


public class Launcher
{

    private static Logger logger = Logger.getLogger(Launcher.class);

    public static void main(String[] args)
    {
        System.out.println("=======================");
        System.out.println("        Core包启动          ");
        SystemDetails.outputDetails();
        System.out.println("=======================");

        try 
        {
			RMISocketFactory.setSocketFactory(new HermRMISocket());
		} catch (IOException ex) {
			logger.error(ex);
		}
        getLocalip();
        // 初始化spring
		new ClassPathXmlApplicationContext("server.xml");
       
        try
        {
            System.in.read();
        }
        catch (Exception e)
        {
            logger.error(e);
        }
    }

    /**
     * 取得本机ip地址 注意：Spring RmiServiceExporter取得本机ip的方法：InetAddress.getLocalHost()
     */
    private static void getLocalip()
    {
        try
        {
            System.out.println("服务暴露的ip: " + java.net.InetAddress.getLocalHost().getHostAddress());
        }
        catch (Exception e)
        {
            logger.error(e);
        }
    }
}
