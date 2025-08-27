import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text =sc.nextLine();
        //remove duplicate characters
        String result = "";
        for(int i=0; i<text.length();i++){
            char ch = text.charAt(i);
            if(result.indexOf(ch)==-1){
                result +=ch;
            }
        }
        System.out.println(result);
        sc.close();
    }
}


/*import java.util.Scanner;
public class Count{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        //count the digits
        int count =0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}*/

/*import java.util.Scanner;

public class CountFrequency{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the text:");
        String text =sc.nextLine();
        int freq[]= new int[256];
        for(int i=0; i<text.length();i++){
            freq[text.charAt(i)]++;
        }
        char maxChar = text.charAt(0);
        int max =0;
        for(int i=0; i<text.length();i++){
            if(max<freq[text.charAt(i)]){
                max = freq[text.charAt(i)];
                maxChar = text.charAt(i);
            }
        }
       sc.close();
    }
       
} */