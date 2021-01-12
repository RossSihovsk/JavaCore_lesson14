import java.util.Comparator;

public class WorkerPositionCorparator implements Comparator<Worker>{


    @Override
    public int compare(Worker o1, Worker o2) {
        return  o1.getPosition().compareTo(o2.getPosition());
    }
}
