import java.util.HashMap;
public class pewpew {
    public static void main(String[] args) {
      int[] arr={4,4,5,5,6,6};
      boolean exist = false;
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
      }
      for(int num: arr){
        if(map.get(num)==1){
            System.out.println("First non-repeating: "+num);
            exist=true;
            break;
        }
      }
      if(!exist){
        System.out.println("No repeating element.");
      }
    }
}
