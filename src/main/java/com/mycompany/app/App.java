package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String findPopular(String str) {
        String[] words = str.split(" ");
        String popularWord = "";
        String tempWord = "";
        int count = 0;
        int resultCounter = 0;
        boolean isPopularExist = true;
        for (int i = 0; i < words.length; i++) {
            tempWord = words[i].toLowerCase();
            for (int j = i; j < words.length; j++) {
                if (tempWord.equals(words[j].toLowerCase()) == true) {
                    count += 1;
                }
            }

            if (count == resultCounter) {
                isPopularExist = false;
            } else if (count > resultCounter) {
                popularWord = tempWord;
                resultCounter = count;
                isPopularExist = true;
            }
            count = 0;
        }


        if (isPopularExist == true) {
            return popularWord;
        } else {
            return "There are 0 popular words";
        }

    }
}
