/*
 * 文件名：[]
 * 版权：
 * 描述：
 * 修改人：shell
 * 修改时间：2016年3月20日
 * 修改内容：
 */
package com.shell.designpattern.structure.decorator;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * @author   shell
 * @version  [版本号,2016年3月20日]
 * @seee      
 * @since
 * @Deprecated
 */
public class Decorator implements Sourcable {
	private Sourcable sourcable;
	
	public Decorator(Sourcable sourcable) {
		this.sourcable = sourcable;
	}
	
	@Override
	public void method() {
		System.out.println("before decorate");
		sourcable.method();
		System.out.println("after decorate");
	}

}
