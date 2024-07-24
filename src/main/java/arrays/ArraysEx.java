package arrays;

import java.util.*;

public class ArraysEx {
    public static void main(String[] args) {

        double[] A = {5,23,76,4235,431,23,1,3,0,65,32,876,34,2,9};

        double[] B = Arrays.copyOf(A, A.length + 5);


        System.out.println("Before Sort:");
        System.out.format("A = %s\n", Arrays.toString(A));
        Arrays.sort(A);

        System.out.println("After Sort:");
        System.out.format("A = %s\n", Arrays.toString(A));

        double a = 0;
        int index = Arrays.binarySearch(A, a);
        System.out.format("A[%d] = %f\n", index, a);

        System.out.format("B = %s\n", Arrays.toString(B));

    }
}

