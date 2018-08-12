package BinaryTree;

import java.util.List;

/*
mainly for testing
 */
public class TestMainClass {

    public static void main(String args[]) {

        String str = "abcdefgh";

        for (int i = 0; i < str.length(); i++)
            for (int j = 0; j < i; j++)
                System.out.println(str.substring(j, i));

    }
}
