package Practica2.ejercicio5;

public interface IRepository {
    void subscription(IDeveloper developer);
    void removeSubscription(IDeveloper developer);
    void notify(Code code,String message);
}
