package leadersInAnArray;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 13-03-2021
 * Time: 18:28
 */

public class LeadersInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int [] input_array = new int[size];

        for (int index = 0; index < size; index++) {
            input_array[index] = sc.nextInt();
        }

        // max is a temp variable to hold the last leader going right to left
        int max = input_array[size-1], leaders [] = new int[size];
        leaders[0] = max;       // rightmost element is already a leader


        int leaders_index = 1;
        for(int index = size-2; index >= 0; index--) {
            // if current element is more the the greatest element of the right side
            if(input_array[index] > max) {
                max = input_array[index];
                leaders[leaders_index++] = max;
            }
        }

        for(int index = (leaders_index -1) ; index >= 0; index--) {
            System.out.print(leaders[index] + " ");
        }
    }
}
