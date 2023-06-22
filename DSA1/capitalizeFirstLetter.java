import java.util.Scanner;

class capitalizeFirstLetter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("After capitalizing the first word :" + capitalize(str));
    }
    static String capitalize(String s){
        StringBuilder sb=new StringBuilder();
        if(isLowerCase(s.charAt(0)) && s.charAt(0)!=' '){
            sb.append(Character.toUpperCase(s.charAt(0)));
        }
        for(int i=1;i<s.length();i++){
            if(isLowerCase(s.charAt(i)) && s.charAt(i-1)==' '){
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    static boolean isLowerCase(char ch){
        if(ch>='a' || ch<='z') return true;
        else return false;
    }
}