import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set <Worker> w1 = new HashSet<>();
        w1.add( new Worker("Ann","Junior-Java",600));
        w1.add( new Worker("Sem","Middle-c++",1400));
        w1.add( new Worker("Deam","Junior-c++",700));
        w1.add( new Worker("Jummi","Senor-Java",2500));
        w1.add( new Worker("Karl","Middle-Java",1300));
        w1.add( new Worker("Jully","Senor-c++",2400));


        System.out.println("\nХешСет виводить в рандомному порядку");
        for (Worker w:w1
             ) {
            System.out.println(w);
        }

        Set <Worker>w3 = new TreeSet<Worker>(new WorkerSalaryComparator());
        w3.add( new Worker("Ann","Junior-Java",600));
        w3.add( new Worker("Sem","Middle-c++",1400));
        w3.add( new Worker("Deam","Junior-c++",700));
        w3.add( new Worker("Jummi","Senor-Java",2500));
        w3.add( new Worker("Karl","Middle-Java",1300));
        w3.add( new Worker("Jully","Senor-c++",2400));


        System.out.println("\nВідсортовано за Зарплатою");
        for (Worker w:w3
        ) {
            System.out.println(w);
        }

        Set <Worker>w4 = new TreeSet<Worker>(new WorkerPositionCorparator());
        w4.add( new Worker("Ann","Junior-Java",600));
        w4.add( new Worker("Sem","Middle-c++",1400));
        w4.add( new Worker("Deam","Junior-c++",700));
        w4.add( new Worker("Jummi","Senor-Java",2500));
        w4.add( new Worker("Karl","Middle-Java",1300));
        w4.add( new Worker("Jully","Senor-c++",2400));


        System.out.println("\nВідсортовано за посадою");
        for (Worker w:w4
        ) {
            System.out.println(w);
        }

        Set <Worker>w5 = new TreeSet<Worker>(new WorkerNameComparator());
        w5.add( new Worker("Ann","Junior-Java",600));
        w5.add( new Worker("Sem","Middle-c++",1400));
        w5.add( new Worker("Deam","Junior-c++",700));
        w5.add( new Worker("Jummi","Senor-Java",2500));
        w5.add( new Worker("Karl","Middle-Java",1300));
        w5.add( new Worker("Jully","Senor-c++",2400));


        System.out.println("\nВідсортовано за імям");
        for (Worker w:w5
        ) {
            System.out.println(w);
        }

    }
}
