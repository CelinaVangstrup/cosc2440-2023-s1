package vn.edu.rmit.problem2;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileWriter;

public class StoreIntegerToDifferentFormatFiles {
  public static void main(String[] args) throws IOException {
    
    // Allows users to enter a list of integers
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a list of integers: ");  
    StringTokenizer input = new StringTokenizer(sc.nextLine());
    Integer[] inputIntegers = new Integer[input.countTokens()];
    for (int i = 0; i < inputIntegers.length; i++) {
      inputIntegers[i] = Integer.parseInt(input.nextToken());
      //System.out.println(inputIntegers[i]);
    }
    sc.close();
    System.out.println("Reading integers is done!"); 

    // Save the list in a binary file
    FileOutputStream fout = new FileOutputStream("integers.dat");
    DataOutputStream dout=new DataOutputStream(fout);
    for (int i = 0; i < inputIntegers.length; i++) {
      dout.writeInt(inputIntegers[i]);
    }
    // Closing binary file object
    fout.close();
    dout.close();
    System.out.println("Writing to binary file is done!");

    // Save the list in a text file
    FileWriter writer = new FileWriter("integers.txt");
    for (int i = 0; i < inputIntegers.length; i++) {
      writer.write(inputIntegers[i].toString());
    }
    // Closing text file object
    writer.close();
    System.out.println("Writing to text file is done!"); 
  }
}
