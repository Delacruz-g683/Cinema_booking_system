/*
 *  Name: Siphiwe Edson Chauque
 *  Student Number: 219084777
 *  Group: 26
 *
 */

package repository;


import domain.Booking;

public interface IRepository<T,ID> {
    T create(T t);
    Booking read(String id);
    T update(T t);
    boolean delete(ID id);
}
