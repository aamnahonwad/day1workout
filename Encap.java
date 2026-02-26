class Bank{
    private int balance;

    public int getbalance(){
        return balance;
    }
    public void setbalance(int balance){
        this.balance=balance;
    }
}

class Encap{
    public static void main(String[] args){
        Bank b1=new Bank();
        b1.setbalance(100);

        Bank b2=new Bank();
        b2.setbalance(1000);

        b1.getbalance();
        b2.getbalance();

        System.out.println("the balance of b1:" + b1.getbalance());
        System.out.println("the balance of b2:" + b2.getbalance());   
    }
}