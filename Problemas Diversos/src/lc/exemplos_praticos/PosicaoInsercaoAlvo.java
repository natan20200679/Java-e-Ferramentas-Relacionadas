/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lc.exemplos_praticos;

public class PosicaoInsercaoAlvo {

    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
        
            int mid = left + (right - left / 2);
            
            if (nums[mid] == target) {
            
                return mid;
            
            } else if (nums[mid] > target) {
            
                right = mid - 1;
            
            } else {
            
                left = mid + 1;
            
            }
        
        }
        
        return left;

        /**
         *
         * @author natan
         */
//        int j = 0;
//        for(int i = 0; i < nums.length; i++) {
//            if(nums[i] == target) {
//                j = i;
//                                             
//            } else if(nums[i] < target) {
//                j = i + 1;
//                             
//            } else if(nums[i] > target) {
//                j = i - 1;
//                
//            }          
//        }
//        return j;
    }
}
