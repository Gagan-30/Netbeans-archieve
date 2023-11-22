
package record;

public class Record
{


    public static void main(String[] args)
    {
       Student[] Student = new Student[5];
       
        for (int i = 0; i < Student.length; i++) 
        {
            Student[i] = new Student();
        }
       
        Student[0].age = 10;
        Student[0].idNumber= 1030;
        Student[0].name = "Bilal";
        
        System.out.println(Student[0].age);
        System.out.println(Student[0].idNumber);
        System.out.println(Student[0].name + "\n");
        
        Student[1].age = 11;
        Student[1].idNumber= 1031;
        Student[1].name = "Bob";
        
        System.out.println(Student[1].age);
        System.out.println(Student[1].idNumber);
        System.out.println(Student[1].name+ "\n");
        
        Student[2].age = 12;
        Student[2].idNumber= 1032;
        Student[2].name = "Jim";
        
        System.out.println(Student[2].age);
        System.out.println(Student[2].idNumber);
        System.out.println(Student[2].name+ "\n");
        
        Student[3].age = 15;
        Student[3].idNumber= 1033;
        Student[3].name = "Tom";
        
        System.out.println(Student[3].age);
        System.out.println(Student[3].idNumber);
        System.out.println(Student[3].name+ "\n");
        
        Student[4].age = 11;
        Student[4].idNumber= 1034;
        Student[4].name = "Jeff";
        
        System.out.println(Student[4].age);
        System.out.println(Student[4].idNumber);
        System.out.println(Student[4].name+ "\n");
    }
    
}
