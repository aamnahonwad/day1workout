class Student{
    Student(){
        System.out.println("Constructor working");
    }
    Student(float a){
        System.out.println(a);
    }
    Student(int a ,int b){
        System.out.println(a + " " + b);
    }
}
class Constructor{
    public static void main(String[] args){
        Student S1 = new Student();
        Student S2 = new  Student(1.34f);
        Student S3 = new Student(10,20);
    }
}