package vn.edu.rmit.problem1;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.Scanner;

public class ReadFileLineByLine {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a text file name: ");  
    String fileName = sc.nextLine();

    BufferedReader reader;
    boolean wantToExit;

    try {
			reader = new BufferedReader(new FileReader(fileName));
			String line = reader.readLine();

			while (line != null) {
				System.out.println("<<" + line + ">>");
        System.out.println();

        System.out.print("Continue (Enter) or Exit (X, then Enter)? ");
        wantToExit = sc.nextLine().equals("X");

        // User wants to exit
        if (wantToExit) {
          break;
        }

				// read next line
				line = reader.readLine();
			}

      // Rember to close the file at the end
			reader.close();
      sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
  }
}
