import java.util.HashMap;
public class ststttst {
    public static void main(String[] args) {
        String arr="programming";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char n:arr.toCharArray()){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        System.out.println(map);
    }
}
