import java.util.HashMap;
public class swweee {
    public static void main(String[] args) {
        int[] arr={2,11,7,15};
        HashMap<Integer,Integer> map=new HashMap<>();
        int target = 9;
        for(int i=0;i<arr.length;i++){
            int remaining = target-arr[i];
            if(map.containsKey(remaining)){
                System.out.println(map.get(remaining)+","+i);
                break;
            }
            map.put(arr[i],i);
        }
    }
}
