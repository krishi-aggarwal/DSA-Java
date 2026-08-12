public class GcdHcf {
    public static void main(String[] args) {
        int a = 9;
        int b = 12;

        while(a>0 && b>0){
            if(a>b){
                a = a%b;
            }
            else if(a<b){
                b = b%a;
            }
        }
        if(a==0){
            System.out.println("GCD : "+b);
        }
        else{
            System.out.println("GCD : "+a);
        }
    }
}
