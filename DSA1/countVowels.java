public class countVowels {
    public static void main(String args[]){
        String str="aeiou";
        String s=str.toUpperCase();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                count++;
            }
        }
        System.out.println(s);
        System.out.println("count="+count);
    }
}
