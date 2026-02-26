class Student{
    int id;
    String name;
    
    void display(){
        System.out.println(id + " " + name);
    }
    
    public static void main(String[] args){
        Student S1 = new Student();
        S1.id = 101;
        S1.name = "Aamna";
        S1.display();
        
        Student S2 = new Student();
        S2.id = 102;
        S2.name = "Honwad";
        S2.display();
    }
}
