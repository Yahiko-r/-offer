package problem;
//一个数组中找有没有重复数字，范围从0~length-1
public class No3 {
    private boolean isDuplicate(int[] nums){
        int length=nums.length;
        if(length==0)return false;
        for(int i=0;i<length;i++){
            if(nums[i]<0||nums[i]>length-1)return false;
            while(nums[i]!=i){
                if(nums[i]==nums[nums[i]])return true;
                int temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
            }

        }
        return false;
    }
}
