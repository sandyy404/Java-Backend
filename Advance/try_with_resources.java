package Advance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class try_with_resources {
   public static void main(String[] args) throws IOException {
     // old way
    /*  BufferedReader br = null;
      int num =0;
      try {
          InputStreamReader in = new InputStreamReader(System.in);
          br = new BufferedReader(in);
          num = Integer.parseInt(br.readLine());
          System.out.println(num);
      } finally{
         br.close();  // this is use in old way to close the resourse.
      }
*/
      // new way 


      int num =0 ;
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){  // this will automatically close the resources.
          num = Integer.parseInt(br.readLine());
          System.out.println(num);
      }
   }
}
