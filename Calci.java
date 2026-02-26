class Calci{
    public static void main(String[] args){
        int a=5,b=4;
        String operator="/";
        int result=0;
     
        switch (operator) {
            case "+":
                result=a+b;
                break;
            case "-":
                result=a-b;
                break;
            case "*":
                result=a*b;
                break;
            case "/":
                result=a/b;
                break;
            default:
                System.out.println("choose the correct operator");
          }
          System.out.println("The Result is =" + result);

    }
}