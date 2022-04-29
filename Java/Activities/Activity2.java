package activities;

public class Activity2 {
    public static void main(String[] args){
        int[] num = {10, 77, 10, 54, -11, 10};
        int sum=0;
        for(int i=0;i<num.length;i++){
            if(num[i]==10){
                sum+= num[i];
            }
        }
        System.out.println(sum);
        if(sum==30){
            System.out.println("true");
        }
        else
            System.out.println("false");

    }
}
