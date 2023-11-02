import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("NURTILEK", 18, "JAVA 12 ");
        Student student1 = new Student("NURTILEK1", 90, "JAVA 12 ");
        Student student2 = new Student("NURTILEK2", 87, "JAVA 12 ");
        Student student3 = new Student("NURTILEK3", 1, "JS 12 ");
        Student student4 = new Student("NURTILEK4", 4, "JS 12 ");
        Student[] masiv = {student, student1, student2, student3, student4};
        int a = student.age+student1.age+student2.age+student3.age+student4.age;
        int x = a/masiv.length;
        System.out.println( "СРЕДНОЕ ВОЗРАСТ СТУДЕНТОВ: "+x);



        int s = 0;
        int c = 0;

        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i].group.contains("JAVA")) {
                s++;
            } else {
                c++;
            }

        }
        System.out.println("В групе Java учится :" + s + " студентав");
        System.out.println("В групе Js учится :" + c + " студентав");


    }


}
