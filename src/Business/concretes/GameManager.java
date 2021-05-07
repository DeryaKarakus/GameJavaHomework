package Business.concretes;

import Business.abstracts.GameService;
import DataAccess.concretes.HibernateGameDao;
import Entities.concretes.Game;

import java.util.List;

public class GameManager implements GameService {


    public GameManager(HibernateGameDao hibernateGameDao) {
    }

    public GameManager() {

    }

    @Override
    public void add(Game game) {
        System.out.println("The game has been added to the system : " + game.getGameName());
        System.out.println("The game price : " + game.getGamePrice());
        System.out.println("The campaign price : " + game.getCampaignPrice());
        System.out.println("Game type : " +game.getGameType() + " type");
        System.out.println("The game description is : " +game.getGameDescription());
        System.out.println("Tha game developer : " + game.getDeveloper());
        System.out.println("Game of release date : " + game.getReleaseDate());
    }

    @Override
    public void delete(Game game) {
        System.out.println("The game has been deleted to the system : " + game.getGameName());

    }

    @Override
    public void update(Game game) {
        System.out.println("The game has been deleted to the system : " + game.getGameName());

    }

    @Override
    public List<Game> getAll() {
        return null;
    }
}
