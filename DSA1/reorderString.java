public class reorderString {
    public static void main(String[] args){
        String str="abcd";
        int[] permutation={2,4,3,1};
        StringBuilder sb=new StringBuilder();
        //String res=
        //result : "dacb"
        for(int i=0;i<str.length();i++){
            sb.setCharAt(i,str.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
