package count.words;

import java.util.*;

class CountWords {


        // Method to find the words longer than the given length
        // Input : List of words and length
        // Output : List of longer words
        public static void findNLengthWords(List <String> words,int n)
        {
            // Creating new list for n length words
            List <String> list2=new ArrayList<String>();
            // Looping through the list
            for(String w:words)
            {
                // Checking the length of each word longer than n
                if(w.length()>n)
                    list2.add(w);	// adding longer than n length words to the list
            }
            System.out.println("The words with length "+n+" are");
            // Printing n length words
            for(String li:list2)
                System.out.println(li);
        }
        // Method to count the number of words starts with given character
        // Input : List of words and character
        // Output : count of words starts with given character
        public static void countWordsStartingWith(List<String> words,char ch1,char ch2)
        {
            int count=0;
            // Looping through the list
            for(String w:words)
            {
                if(w.charAt(0)==ch1 || w.charAt(0)==ch2) // Checking each words starts with given character
                    count++; // Adding the count
            }
            // Printing the count of words starts with given character
            System.out.println("The number of words starts with "+ch1+" or "+ch2+" is "+count);
        }
        public static void main(String[] args) {
            // Creating list to store words
            List<String> word_list=new ArrayList<String>();
            // Adding words to the list
            word_list.add("Rose");
            word_list.add("Jasmine");
            word_list.add("Mesh");
            word_list.add("Lilly");
            word_list.add("meat");
            word_list.add("Melon");
            word_list.add("Apple");
            word_list.add("mulberry");
            word_list.add("Strawberry");
            System.out.println("Number of words in the list: "+word_list.size());
            System.out.println();
            // Calling the method for displaying the words longer than given length from the list
            findNLengthWords(word_list,5);
            System.out.println();
            // Calling the method for displaying the number of words starting with given characters
            countWordsStartingWith(word_list,'m','M');
        }

}
