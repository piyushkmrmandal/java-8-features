package core.java8.parallelStreams;

/**
 * Class made to use in SumClient for showing when not to use parallelstream
 */
public class Sum {
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void performSum(int input){
        total+=input;
    }
}
