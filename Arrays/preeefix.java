import java.util.Arrays;
class Sol{
    public String longestCommonStr(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }
        Arrays.sort(strs);
        StringBuilder result = new StringBuilder();
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();
        for(int i=0;i<first.length;i++){
            if(first[i]==last[i]){
              result.append(first[i]); 
            }else{
                break;
            }
        }
        return result.toString();
    }
}

public class preeefix {
    public static void main(String[] args) {
        Sol s = new Sol();
        String[] strs={"flower","flow","flower"};
        System.out.println(s.longestCommonStr(strs));
    }
}
