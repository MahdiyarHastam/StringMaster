public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public static String wordFinder(String sentence, int number) {
        String[] ok=sentence.split(" ");
        String number1=Integer.toString(number);
        if(number>ok.length)
            return "Number = "+number1+" is out Of Bound";
        return ok[number-1];
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public static int oddEvenCounter(String number, boolean searchForEven) {
        int count=0;
        long adad=Long.parseLong(number);
        if(searchForEven==true){
            while(adad>0){
                if(adad%2==0)
                    count++;
                adad=adad/10;
            }
        }
        else{
            while(adad>0){
                if(adad%2==1)
                    count++;
                adad=adad/10;
            }
        }
        return count;
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public static String firstWord(String wordA, String wordB) {
        char[] word1=wordA.toCharArray();
        char[] word2=wordB.toCharArray();
        if(word1.length>word2.length){
            for(int i=0;i<word2.length;i++){
                if(word2[i]>word1[i]){
                    return wordA;
                }
                if(word2[i]<word1[i]){
                    return wordB;
                }
            }
        }
        else{
            for(int i=0;i<word1.length;i++){
                if(word2[i]>word1[i]){
                    return wordA;
                }
                if(word2[i]<word1[i]){
                    return wordB;
                }
            }
        }
        return "words are equal";
    }
}
