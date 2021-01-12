import java.util.Comparator;

public class WorkerSalaryComparator implements Comparator<Worker> {

    @Override
    public int compare(Worker o1, Worker o2) {
        if (o1.getSalary()>o2.getSalary())
        {return 1;}
        else if(o1.getSalary()<o2.getSalary()){
            return -1;
        }
        else return 0;
    }


}
