import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {

    private  List<T> items;
    private int maxSize;

    public FixedList(List<T> items, int maxSize) {
        this.items = new ArrayList<>();
        this.maxSize = maxSize;
    }




}
