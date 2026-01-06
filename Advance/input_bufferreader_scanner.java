package Advance;

import java.io.IOException;
import java.util.Scanner;

public class input_bufferreader_scanner {

    public static void main(String[] args) throws IOException {
        //  System.out.println("Enter the number");  
        //  int num1 = System.in.available();  // this will give 0
        //  System.out.println(num1);
        //  int num2 = System.in.hashCode();
        //  System.out.println(num2); // this will give hashcode number
        //  int num3 = System.in.read();  //only for int but give us in ascii value 
        //  System.out.println(num3 -48);

// InputStreamReader in = new InputStreamReader(System.in);
//    BufferedReader bf = new BufferedReader(in);
//    //int num = bf.read();
//     String  num = bf.readLine();    // this will give the string as output.
//    System.out.println(num);
        Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  System.out.println(num);
    }
}
