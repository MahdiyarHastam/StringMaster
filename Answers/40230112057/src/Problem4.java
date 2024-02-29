public class Problem4 {
    public static String wordCensor(String sentence, String word, String newWord){
        String[] splitt=sentence.split(" ");
        for(int i=0;i<splitt.length;i++){
            if(splitt[i].equals(word)==true){
                splitt[i]=newWord;
            }
        }
        String neww=new String();
        for(int i=0;i<splitt.length;i++){
           neww=neww.concat(splitt[i]+" ");
        }
        return neww;
    }
}
