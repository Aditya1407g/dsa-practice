package bitwiseoperations;

public class Power {
    public static void main(String[] args) {
        int  base =100, power =4, ans =1;
        while(power>0){
            if((power &1) ==1){
                ans*=base;
            }
            base*=base;
            power =power >> 1;
        }
        System.out.println(ans);
    }
}
