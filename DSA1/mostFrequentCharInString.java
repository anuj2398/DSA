import java.util.HashMap;
import java.util.Map;

public class mostFrequentCharInString {
    public static void main(String[] args){
        String str="Anuj Kumar Deka";
        mostFrequentChar(str);
    }
    static void mostFrequentChar(String s){
        s=s.toUpperCase();
        Map<Character,Integer> hm=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
            if(hm.containsKey(key)){
                hm.put(key,hm.get(key)+1);
            }
            else{
                hm.put(key, 1);
            }
        }
        System.out.println(hm);
        //check for most repeated char
        int maxCount=0;
        char res=0;
        for(Map.Entry<Character,Integer> val : hm.entrySet()){
            if(val.getValue()>maxCount){
                maxCount=val.getValue();
                res=val.getKey();
            }
        }
        System.out.println(res +" "+maxCount); 
    }
}
