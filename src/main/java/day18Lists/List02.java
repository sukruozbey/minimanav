package day18Lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class List02 {
    public static void main(String[] args) {
        //Example 1Example 1: Integer bir List olusturunuz
        //Bu Listte birbirine en yakın iki tamsayıyıyazınız.
        //[12.23,9,11,35]==>11,12
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(9);
        nums.add(11);
        nums.add(35);
        Collections.sort(nums);
        System.out.println(nums);
        int mindiff=nums.get(1)-nums.get(0);
        System.out.println(mindiff);
        for (int i=1;i<nums.size();i++){
           mindiff= Math.min(mindiff,nums.get(i)-nums.get(i-1));

        }
        System.out.println(mindiff);
        for(int i=1; i<nums.size(); i++){
            if(nums.get(i)-nums.get(i-1) == mindiff) {
                System.out.println(nums.get(i-1) + " and " + nums.get(i));
            }
        }
    }
}
