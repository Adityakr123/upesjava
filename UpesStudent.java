package upes;
public class Students{
    String name;
    String city;
    double cgpa;

}
class UpesStudent{
    public static void main(String[] args) {
        Students Ajay=new Students();
        Ajay.name="Ajay Sharma";
        Ajay.city="Delhi";
        Ajay.cgpa=5.55;
        System.out.println("Name: "+Ajay.name);
        System.out.println("City:"+Ajay.city);
        System.out.println("CGPA: "+Ajay.cgpa);
    }
}
