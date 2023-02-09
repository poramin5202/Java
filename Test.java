public class Test {   
    public static void main(String[] args) {
        try{
            int num = Integer.parseInt(args[0]);
            System.out.println("Result = " + num);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Usage : java Test <number>");
           
        }
        System.out.println("HelloHello");
    }
}
