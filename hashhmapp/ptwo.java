import java.util.HashMap;
public class ptwo {
    public static void main(String[] args) {
        int[] arr={4,5,1,2,5,1,4};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:arr){
            if(map.get(num)==1){
                System.out.println("First non-repeating value: " + num);
                break;
            }
        }
    }
}
