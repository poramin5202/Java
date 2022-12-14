// 6403052412103
// Poramin Boonchusawad
public class Grade {
    public static void main(String[] args) {
   if(args.length != 1 ){
       System.out.println("Please enter your score");
       System.exit(0);
   }else{
    try{
       int num = Integer.parseInt(args[0]);
       if(num <= 100 && num >= 0){
            
               if(num > 79){
                  System.out.println("Your score is grade A"); 
               }else if(num < 80 && num >69){
                   System.out.println("Your score is grade B"); 
               }else if(num < 70 && num >59){
                   System.out.println("Your score is grade C"); 
               }else if(num < 60 && num >49){
                   System.out.println("Your score is grade D"); 
               }else if(num < 50){
                   System.out.println("Your score is grade F"); 
               }
            
        
       }else{
          System.out.println("Please enter number 0 - 100");
       System.exit(0);  
       }
   } catch (Exception e) {
    System.out.println("Please enter integer number");           
     }
    }
  }
}
