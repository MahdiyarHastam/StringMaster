public class Problem1 {
    public static String WordFinder(String org,int n){
        String[] ok=org.split(" ");
        String number=Integer.toString(n);
        if(n>ok.length)
            return "Number = "+number+" is out Of Bound";
        return ok[n-1];
    }
}
