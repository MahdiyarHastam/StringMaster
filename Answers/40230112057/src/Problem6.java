public class Problem6 {
    public static String doubleChar(String word){
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
