package cn.studyhuang.dubbo.demo.impl;
import java.io.IOException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ����Զ�̷���
 * 
 * */
public class Provider {
  @Test	
  public   void fun1() {
	  ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("dubbo-provider.xml");
	  System.out.println(context.getDisplayName()+"provider");
	  context.start();
	  System.out.println("Զ�̷�����");
	  try {
		System.in.read();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
 }
}
