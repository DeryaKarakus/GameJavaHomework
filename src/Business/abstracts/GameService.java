package Business.abstracts;

import Entities.concretes.Game;

import java.util.List;

public interface GameService {
    void add(Game game);
    void delete(Game game);
    void update(Game game);
    List<Game> getAll();
}
