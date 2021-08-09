class Student{
    private String name;
    private String city;
    private double cgpa;
    public static int stuCount=0;

    public void getData(String x,String y,double z){
        name=x;
        city=y;
        cgpa=z;
        ++stuCount;

    }
    public void printData(){
        System.out.println("Name of the Student:"+name);
        System.out.println("City of the student:"+city);
        System.out.println("CGPA of Student:"+cgpa);
        //System.out.println("Total Students:"+ stuCount);
    }
}


class MainStudent{
    public static void main(String[] args) {
       Student Amit=new Student();
       Amit.getData("Amit kumar","Kanpur", 8.72);
       //System.out.println(Student.stuCount);
       Amit.printData();
       Student Ajay= new Student();
       Ajay.getData("Ajay Sharma", "Delhi", 7.77);
       Ajay.printData();
       //System.out.println(Student.stuCount);
    

        
    }
}
