package company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

        List<Students> studentsData = Arrays.asList(
                new Students(1,"sudeesh P S",Gender.Male,"sudheesh@gmail.com", 50.0,65.0,87.0),
                new Students(2,"Ashly S",Gender.Female,"ashly@gmail.com", 30.0,65.0,45.0),
                new Students(3,"Drum",Gender.Male,"drum@gmail.com", 65.0,80.0,90.0),
                new Students(4,"Varma",Gender.Male,"varma@gmail.com", 35.0,12.8,10.0),
                new Students(5,"Maman",Gender.Male,"manan@gmail.com", 100.0,98.0,23.0)
        );

        long numberOfGirls =  studentsData.stream().filter(i->i.getGender().equals(Gender.Female)).count();
        System.out.println("Number of girls : "+numberOfGirls);
        long numberOfBoys =  studentsData.stream().filter(i->i.getGender().equals(Gender.Male)).count();
        System.out.println("Number of boys : "+numberOfBoys);


        Double percentage = 0.0;
        double value = studentsData.stream().filter(i -> i.getMark() > 45).count();
        percentage = (value/ studentsData.size())*100;
        System.out.println("pass percentage : "+percentage);

        System.out.println("passed studnet details");
        studentsData.stream().filter(i -> i.getMark() > 45).forEach(i-> System.out.println(i.getStudentName()));

        System.out.println("Failed studnet details");
        List<Students> failedStudents = studentsData.stream().filter(i -> i.getMark() < 45).collect(Collectors.toList());

        List<Students> passStudets =  studentsData.stream().filter(i->i.getMark()>45).collect(Collectors.toList());

    }
}
