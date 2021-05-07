package DataAccess.abstracts;

import Entities.concretes.Gamer;

import java.util.List;

public interface GamerDao {
    void add(Gamer gamer);
    void delete(Gamer gamer);
    void update(Gamer gamer);
    Gamer get(int id);
    List<Gamer> getAll();
}
