package DataAccess.concretes;

import DataAccess.abstracts.GamerDao;
import Entities.concretes.Gamer;

import java.util.List;

public class HibernateGamerDao implements GamerDao {
    @Override
    public void add(Gamer gamer) {
        System.out.println("The game has been added to the system : " + gamer.getFirstName());
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("The game has been deleted to the system : " + gamer.getFirstName());

    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("The game has been updated to the system : " + gamer.getFirstName());

    }

    @Override
    public Gamer get(int id) {
        return null;
    }

    @Override
    public List<Gamer> getAll() {
        return null;
    }
}
