public interface Subject {

    public abstract void register(Observer observer);

    public abstract void withdraw(Observer observer);

    public abstract void notifyChange();
}
