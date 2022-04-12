import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    protected int diapason;
    protected int min;

    public Randoms(int min, int max) {
        diapason = max - min;
        this.min = min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int x = random.nextInt(diapason + 1);
                return x += min;
            }
        };
    }
}