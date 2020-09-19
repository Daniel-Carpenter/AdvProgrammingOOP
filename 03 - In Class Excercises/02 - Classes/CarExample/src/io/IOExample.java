package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOExample 
{
	public static void main(String[] args) throws IOException
	{
		// Create writer and output file name
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("Daniel"); // does not add newline at end of data
			writer.write("\n"); 
			writer.write("Kenny"); 
			writer.close();
			
		// Create Reader
			BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
			
			// loop through File (NOT CORRECT)
			while (reader.readLine() != null)
			{
				System.out.println(reader.readLine());				
			}
			reader.close();
	}
}
