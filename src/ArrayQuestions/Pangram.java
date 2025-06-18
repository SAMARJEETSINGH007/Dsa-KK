package ArrayQuestions;
public class Pangram
{
    public static void main(String[] args)
    {
        String sentence = "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
        boolean result=checkIfPangram(sentence);
        System.out.println(result);
    }
    public static boolean checkIfPangram(String sentence)
    {
        if (sentence.length() < 26) {
            return false;
        }
        char[] cArr = sentence.toCharArray();
        boolean[] ls = new boolean[26];
        int asciichar;
        for (int i = 0; i < sentence.length(); i++)
        {
            asciichar = (int) cArr[i];
            if ((asciichar >= 97) && (asciichar <= 123))
            {
                ls[asciichar-97]=true;
            }
        }
        for(int i=0;i<ls.length;i++)
        {
            if(ls[i]!=true)
            {
                return false;
            }
        }
        return true;
    }
}
/*
class Solution {
    public boolean checkIfPangram(String sentence) {
		if (sentence.length() < 26) {
			return false;
        }
		for (char i = 'a'; i <= 'z'; i++) {
			if (sentence.indexOf(i) == -1) {
				return false;
			}
		}
		return true;
	}
}
 */