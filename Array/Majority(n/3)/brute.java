import java.util.*;
public class brute {
  public static List<Integer>majorityElemnrt(int []nums){
    List<Integer> ls = new ArrayList<>(); 
 for(int i=0;i<nums.length;i++){
    if(ls.size()==0 || ls.get(0) !=nums[i]){
        int count=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==nums[i]){
              count++;
            }
        }
        if(count>nums.length/3)
        ls.add(nums[i]);
    }
    if(ls.size()==2) break;
 }
 return ls;
  }
  public static void main(String[] args) {
    int [] nums={11,33,11,33,33,33};
    List<Integer>ans=majorityElemnrt(nums);
    for(int i=0;i<nums.length;i++){
        System.out.println(ans.get(i)+" ");
    }
    System.out.println();
  }
}


Time Complexity: O(N2), where N = size of the given array.
// Reason: For every element of the array the inner loop runs for N times. And there are N elements in the array. So, the total time complexity is O(N2).

// Space Complexity: O(1) as we are using a list that stores a maximum of 2 elements. The space used is so small that it can be considered constant.