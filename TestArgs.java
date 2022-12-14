// 6403052412103
// Poramin Boonchusawad
public class TestArgs {
     public static void main(String[] args) {
        if(args.length == 2){
        try{
            Double num = Double.parseDouble(args[0]);
            Double num1 = Double.parseDouble(args[1]);
            System.out.println(num + " x "+ num1 + " = " + (num * num1));
        }catch (Exception eee) {
            System.out.println("Usage :  java TestArgs <number1> <number2>");           
        }
     }else{
        System.out.println("Usage :  java TestArgs <number1> <number2>");
        System.exit(0);
     }
    }
}
