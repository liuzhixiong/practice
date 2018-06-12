package com.lzx.java.algorithm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.lzx.java.node.TreeNode;

/**
 * 非递归先序遍历二叉树
 * @author liuzhixiong
 * 2018年06月11日17:05:35
 */

public class PreOrder_NonRecur {

	private static List<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(6);
		TreeNode node6 = new TreeNode(7);
		
		root.setLeft(node1);
		root.setRight(node2);
		
		node1.setLeft(node3);
		node1.setRight(node4);
		
		node2.setLeft(node5);
		node2.setRight(node6);
		
		preOrder(root);
		
		System.out.println(list.toString());
	}
	
	public static void preOrder(TreeNode root){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode p = root;
		
		while(!stack.isEmpty() || p != null){
			while(p != null){
				list.add(p.getVal());
				stack.push(p);
				p = p.getLeft();
			}
			
			if(!stack.isEmpty()){
				TreeNode pTemp = stack.pop();
				p = pTemp.getRight();
			}
		}
	}
	
}
