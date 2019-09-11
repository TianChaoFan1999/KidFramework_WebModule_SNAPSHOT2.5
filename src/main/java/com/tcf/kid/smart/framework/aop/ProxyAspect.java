package com.tcf.kid.smart.framework.aop;

/***
 * TODO TCF AOP������࣬ʵ��AOP��̬����ӿڣ�����������͸�����ǿ�������������ڴ������������ǿ�������Ķ�̬֯��
 * @author 71485
 *
 */
public class ProxyAspect implements Proxy{
	
	@Override
	public Object doProxy(ProxyChain proxyChain) 
	{
		Object invokeResult=null;
		
		try
		{
			//TODO TCF ���㺺��ģʽ-��ǿ��������̬֯��
			before();
			
			invokeResult=proxyChain.doProxyChain();
			
			afterReturning();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return invokeResult;
	}
	
	//TODO TCF ...���������ǿ������
	//TODO TCF ǰ����ǿ
	public void before()
	{
		System.out.println("====��������ǰ����ǿ������ִ��====");
	}
	
	//TODO TCF ������ǿ
	public void afterReturning()
	{
		System.out.println("====�������ĺ�����ǿ������ִ��====");
	}

}
