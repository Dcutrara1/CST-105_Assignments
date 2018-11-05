import java.io.BufferedReader;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Name:		Daniel Cutrara
// Course:		CST-105
// Date:		11/04/2018
// Instructor:	Dennis Atawaia
// This is my own work.

public class PigLatin
{
	public static void main(String[] args) 
	{
		// The name of the file to open.
        String fileName = "input.txt";

        // This will reference one line at a time
        String line = null;

        try 
        {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read each line
            while((line = bufferedReader.readLine()) != null) 
            { 
            	// Split each word to its own line
            	String[] words = line.split("\\s");           
                        	
            	// Create an Array of Constant Clusters to compare beginning of words to.
            	String[] constantClusters = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", 
            			"fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", 
            			"sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
            	
            	// Take action on each word in the string array. 
            	for (String word: words)
            	{    
            		// Check words that start with a vowel.
            		char ch = word.charAt(0);
            		
            		
            		if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
            		        ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
            		        ch=='u' || ch=='U')         	
            		{             			                	
            			String pigLatin = word + "way";                		
            			System.out.printf("%-15s%-15s\n", word, pigLatin.toUpperCase());           			                		
            		}   
            		
            		// Check words longer than a word to see if they start with a constant cluster
            		else if(word.length() > 1)
            		{          			
            			char ch2 = word.charAt(1);     
            		
            			String cluster = new StringBuilder().append(ch).append(ch2).toString();            		
            			cluster.toLowerCase();   
            		
            			if (Arrays.asList(constantClusters).contains(cluster))            			    				
            			{          			
            			String pigLatin = word.substring(2) + cluster + "ay";
            			System.out.printf("%-15s%-15s\n", word, pigLatin.toUpperCase()); 
            			}           	
            		
            			// If they do not start with a cluster, move only the 1st letter to end of word
            			else 	
            			{             			
            				String pigLatin = (word.substring(1) + ch + "ay");
            				System.out.printf("%-15s%-15s\n", word, pigLatin.toUpperCase()); 	
            			}
            		}           	
            	}
            }   

            // Always close files.
            bufferedReader.close();         
        }
        
        catch(FileNotFoundException ex) 
        {        	
        	System.out.println( "Unable to open file '" + fileName + "'"); 	
        }
        
        catch(IOException ex) 
        {
            System.out.println("Error reading file '" + fileName + "'");                   
        }
	}

}
