
public class Problem3 {
    public static String firstWord(String wordA, String wordB){
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
        return "equal";


    }

}
