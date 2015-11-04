package com.labouardy.test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

import org.junit.Before;

import com.labouardy.model.BinaryTree;


public class TraversalTest extends TestCase{
	
	private BinaryTree<Integer> tree;
	
	@Before
	public void setUp(){
		tree=new BinaryTree<Integer>();
	}
	
	public void testTraversal(){
		tree.insert(5);
		tree.insert(2);
		tree.insert(7);
		tree.insert(1);
		tree.insert(3);
		 // Create a stream to hold the output
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    // IMPORTANT: Save the old System.out!
	    PrintStream old = System.out;
	    // Tell Java to use your special stream
	    System.setOut(ps);
	    // Print some output: goes to your special stream
	    tree.postOrder();
	    // Put things back
	    System.out.flush();
	    System.setOut(old);
		assertEquals("1 3 2 7 5 ", baos.toString() );
	}
}
