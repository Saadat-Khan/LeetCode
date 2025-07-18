class Solution {
    public int removeDuplicates(int[] nums) {
        //Hello
        int[] arr=new int[nums.length];
        int c=0;
        for(int i=0; i<nums.length; i++){
            boolean flag=false;
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                arr[c]=nums[i];
                c++;
            }
        }
        for(int i=0; i<nums.length; i++){
            nums[i]=arr[i];
        }
        return c;
    }
}