import java.util.HashMap;
import java.util.Map;

public class mostRepeatedNumberInAnArray {
    public static void main(String[] args){
        int[] arr={1,2,3,2,4,3,2,2,3,2};
        int res=mostRepeatedNumber(arr);
        System.out.println(res);
    }
    static int mostRepeatedNumber(int[] ar){
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        //insert into HashMap
        for(int i=0;i<ar.length;i++){
            int key=ar[i];
            if(hm.containsKey(key)){
                int freq=hm.get(key);
                freq++;
                hm.put(key, freq);
            }
            else{
                hm.put(key, 1);
            }
            
        }
        System.out.println(hm);
        //check which number is repeated the max time
        int maxCount=0;
        int res=-1;
        for(Map.Entry<Integer,Integer> val : hm.entrySet()){
            if(val.getValue()>maxCount){
                maxCount=val.getValue();
                res=val.getKey();
            }
        }
        return res;
    }
}
