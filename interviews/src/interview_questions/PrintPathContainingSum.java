package interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import util.Node;

/*
 * You are given a binary tree in which each node contains a value.
 * Design an algorithm to print all paths which sum up to that value
 * Note that it can be any path in the tree - it does not have to start at the root (hard mode, not implemented)
 * Note it can be negative!
 */
public class PrintPathContainingSum {

    //psudocode
    //starting from root, sum == 0;
    //add root to path.
    //if path

    public static void printPathsContainingSum(Node root, int sumGoal){

        printPaths(sumGoal,new ArrayList<Integer>(),root, 0);
    }

    private static void printPaths(int sumGoal, List<Integer> path, Node root,int currSum){

        if(root==null){
            return;
        }
        path.add(root.getValue());

        currSum+=root.getValue();

        if(sumGoal==currSum){
            System.out.print("[");
            for(int i : path){
                System.out.print(i);
                System.out.print(", ");
            }
            System.out.print("]");
        }
        printPaths(sumGoal, new ArrayList<Integer>(path), root.getLeft(), currSum);
        printPaths(sumGoal, new ArrayList<Integer>(path), root.getRight(), currSum);
    }


}
