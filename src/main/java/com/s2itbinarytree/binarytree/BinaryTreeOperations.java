package com.s2itbinarytree.binarytree;

import com.s2itbinarytree.binarytree.model.BinaryTree;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BinaryTreeOperations {

    public int sumBinaryTreeValues(BinaryTree binaryTree){
        if(binaryTree == null){
            return 0;
        } else
            return binaryTree.getValor() + sumBinaryTreeValues(binaryTree.getLeft()) + sumBinaryTreeValues(binaryTree.getRight());
    }

}
