public class findmedian {
    public static void main(String[] args){
        int[] nums1={1,2,3};
        int[] nums2={3,4,5};
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0,j=0,k=0;
        int[] merged = new int[n1+n2];
        while( i<n1 && j<n2 ){
            if(nums1[i]<nums2[i]){
                merged[k]=nums1[i];
                k++;
                i++;
            }else{
                merged[k++]=nums2[j++];
            }
        }
         int total=n1+n2;
        if(total%2==1){
           System.out.println(merged[total/2]);
        }else{
            System.out.println((merged[(total/2)-1]+merged[total/2])/2.0);
        }
        
    }
}
