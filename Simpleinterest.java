class Simpleinterest {
    public static void main(String[] args) {

        double principal = 1000;   // Principal amount
        double rate = 5;           // Rate of interest (per year)
        double time = 2;           // Time (in years)

        double simpleInterest;

        simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + simpleInterest);
    }
}