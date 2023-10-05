package services;

import ru.geekbrains.lesson4.Employee;

import java.util.List;

public interface Repository<T, TId>
{
    void add(T item);

    void update(T item);

    void delete(TId id);

    List<T> getAll();


}
