class harry{
    public int removeDup(int[] nums){
    if(nums.length==0){
        return 0;
    }
    int k=1;
    for(int i=1;i<nums.length;i++){
        if(nums[i] != nums[i-1]){
            nums[k] = nums[i];
            k++;
        }
    }
    return k;

    }
}

public class delduplic {
    public static void main(String[] args) {
        harry h = new harry();
        int[] nums={2,0,1,1,2,3,3,4,4,4,4,5};
        int k = h.removeDup(nums);
        System.out.println("K= "+ k);
        for(int i=0;i<k;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
