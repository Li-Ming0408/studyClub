public class Competitor implements Observer, Display, Comparable<Competitor> {

    private String name;
    private int score;
    private int index;

    public Competitor(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public void display() {
        System.out.println("Competitor: " + name + ", Score: " + score + ", Rank: " + index);
    }

    @Override
    public void update(int i) {
        index = i;
    }

    @Override
    public int compareTo(Competitor other) {
        return Integer.compare(other.score, this.score);
    }
}
