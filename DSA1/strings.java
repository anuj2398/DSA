public class strings {
    public static void main(String args[]){
        String str="anuj kumar deka";
        StringBuilder sb=new StringBuilder();
        //System.out.println(str);
        sb.append(Character.toUpperCase(str.charAt(0)));
        //System.out.println(sb);
        String[] words=str.split(" ");
        for(String word : words){
            System.out.println(word);
        }
        System.out.println("abc"+"def");
        char[] charArr=str.replaceAll("\\s+","").toCharArray();
        for(char c : charArr){
            System.out.print(c);
        }
    }
}
