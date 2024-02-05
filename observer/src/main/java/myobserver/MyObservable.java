package myobserver;

public interface MyObservable {
    void add(Observer observer);
    void remove(Observer observer);
    void updateAll();
}
