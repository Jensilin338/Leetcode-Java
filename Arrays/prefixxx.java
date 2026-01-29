import java.util.Arrays;
class Solutionn {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        for(int i =0; i< first.length;i++){
            if(first[i] != last[i])
                break;
            result.append(first[i]);
        }
        return result.toString();
    }
}
public class prefixxx {
 public static void main(String[] args) {
    Solutionn sol = new Solutionn();
    String[] strs = {"Flower","Flow","FLown"};
    String result1 = sol.longestCommonPrefix(strs);
    System.out.print(result1);
 }   
}
