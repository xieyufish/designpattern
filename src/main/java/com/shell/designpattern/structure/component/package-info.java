/*
 * 文件名：组合模式
 * 版权：
 * 描述：组合模式，将对象组合成树形结构以表示“部分-整体”的层次结构，组合模式使得用户对单个对象和组合对象的使用具有一致性。
 *     掌握组合模式的重点是要理解清楚 “部分/整体” 还有 ”单个对象“ 与 “组合对象” 的含义。

	组合模式让你可以优化处理递归或分级数据结构。
	《设计模式》：将对象组合成树形结构以表示“部分整体”的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。

	涉及角色：
	Component：是组合中的对象声明接口，在适当的情况下，实现所有类共有接口的默认行为。声明一个接口用于访问和管理Component子部件。
	Leaf：在组合中表示叶子结点对象，叶子结点没有子结点。
	Composite：定义有枝节点行为，用来存储子部件，在Component接口中实现与子部件有关操作，如增加(add)和删除(remove)等。
 * 修改人：shell
 * 修改时间：2016年3月20日
 * 修改内容：
 */
/**
 * <一句话功能简述>
 * <功能详细描述>
 * @author   shell
 * @version  [版本号,2016年3月20日]
 * @seee      
 * @since
 * @Deprecated
 */
package com.shell.designpattern.structure.component;