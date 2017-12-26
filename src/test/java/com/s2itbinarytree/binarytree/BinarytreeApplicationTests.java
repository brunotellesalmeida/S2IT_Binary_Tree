package com.s2itbinarytree.binarytree;

import com.s2itbinarytree.binarytree.model.BinaryTree;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BinarytreeApplicationTests {

	BinaryTreeOperations binaryTreeOperations = new BinaryTreeOperations();

	@Test
	public void contextLoads() {
	}

	@Test
	public void sumMustReturn35(){
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.setLeft(new BinaryTree());
		binaryTree.setRight(new BinaryTree());
		int expectedValue = 35;

		binaryTree.setValor(5);
		binaryTree.getLeft().setValor(10);
		binaryTree.getRight().setValor(20);

		Assert.assertEquals(expectedValue,binaryTreeOperations.sumBinaryTreeValues(binaryTree));

	};
}
