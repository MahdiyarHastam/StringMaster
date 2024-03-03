import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public static String wordCensor(String sentence, String word, String newWord){
        String[] splitt=sentence.split(" ");
        for(int i=0;i<splitt.length;i++){
            if(splitt[i].equals(word)==true){
                splitt[i]=newWord;
            }
        }
        String neww=new String();
        for(int i=0;i<splitt.length;i++){
            if(i==splitt.length-1)
                neww=neww.concat(splitt[i]);
            else
                neww=neww.concat(splitt[i]+" ");
        }
        return neww;
    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public static String normalizingName(String firstName, String lastName){
        String First=firstName.toLowerCase();
        String Second=lastName.toLowerCase();
        char[] neww1=First.toCharArray();
        char[] neww2=Second.toCharArray();
        neww1[0]-=32;
        neww2[0]-=32;
        String akhari=new String(neww1);
        String akharii=new String(neww2);
        if(firstName.contains(" ") ){
            return akharii;
        }else if(lastName.contains(" ")){
            return akhari;
        }

        return akhari+" "+akharii;
    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public static String doubleChar(String word) {
        char[] Word=word.toCharArray();
        String finall="";
        int j=0;
        for(int i=0;i<Word.length;){
            if(Word[i]==Word[j]){
                i++;
            }
            else if(Word[i]!=Word[j]){
                finall+=Word[j];
                j=i;
                i++;
            }
        }
        finall+=Word[Word.length-1];
        return finall;
    }
}

