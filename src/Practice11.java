public class Practice11 {


    public static void main(String[] args){
        int[] a={2,34,54,23};
        sumArray(a);
    }

    public static void sumArray(int[] b){
        int sum=0;
        for(int i=0;i<b.length;i++){
            sum=sum+b[i];

        }
        System.out.println("sum is: "+sum);
    }
}
