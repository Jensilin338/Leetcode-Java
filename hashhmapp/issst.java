import java.util.HashMap;
public class issst {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1};
        HashMap<Integer,Boolean> map= new HashMap<>();
        boolean exist=false;
        for(int num: arr){
            if(map.containsKey(num)){
                exist=true;
                break;
            }
            map.put(num,true);
        }
        System.out.println(exist);
    }
}
