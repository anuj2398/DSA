import java.util.Scanner;

public class capitalizeFirstLatter01 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("After capitalizing the first word :" + capitalize(str));
    }
    static String capitalize(String s){
        String[] words=s.split(" ");
        String result="";
        for(String word : words){
            String first=word.substring(0,1);
            String afterFirst=word.substring(1);
            result+=first.toUpperCase()+afterFirst+" ";
        }
        return result;
    }
}
