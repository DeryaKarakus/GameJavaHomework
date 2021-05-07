package Business.abstracts;

import Entities.concretes.Gamer;

public interface GamerService {
    void add(Gamer gamer);
    void delete(Gamer gamer);
    void update(Gamer gamer);

}
