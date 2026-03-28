package p0003;

public class Resource {
    private int id;
    private long[] data;
    
    Resource(int id, int s) {
        this.id = id;
        this.data = new long[s];
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Sential: Resource " + id + " is being reclaimed.");
        } finally {
            super.finalize();
        }
    }
}