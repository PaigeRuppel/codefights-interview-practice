package com.paigeruppel.interviewpractice.linkedlists;

import java.util.LinkedList;

import javax.xml.soap.Node;

import org.junit.Before;
import org.junit.Test;

public class ListRemovalTest {

	private ListRemoval underTest;
	
	@Before
	public void setup() {
		underTest = new ListRemoval();
	}
	
	@Test
	public void testCase1() {
		ListNode<ListNode> l = new ListNode(1);
		l.next = new ListNode(2);
	}
}
