import java.util.LinkedList;

public class Leaderboard implements Subject {

    private LinkedList<Observer> competitors;

    public Leaderboard() {
        this.competitors = new LinkedList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer != null && !competitors.contains(observer)) {
            competitors.add(observer);
            this.notifyChange();
        }
    }

    @Override
    public void withdraw(Observer observer) {
        competitors.remove(observer);
        this.notifyChange();
    }

    @Override
    public void notifyChange() {
        for (int i = 0; i < competitors.size(); i++) {
            competitors.get(i).update(i);
        }
    }
}
