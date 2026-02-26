class Grade{
    public static void main(String[] args){
        int marks=85;
        if(marks>=90){
            System.out.println("your result is");
        }
        else if(marks>=75 && marks<=89){
            System.out.println("B grade");
        }
        else if(marks>=50 && marks<74){
            System.out.println("C grade");
        }
        else if(marks<=50){
            System.out.println("Fail");
        }
        else{
            System.out.println("plz enter your marks :");
        }
    }
}