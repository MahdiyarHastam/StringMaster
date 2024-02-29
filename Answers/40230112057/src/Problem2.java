public class Problem2 {
    public static int oddEvenCounter(String number, boolean searchForEven){
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

}
