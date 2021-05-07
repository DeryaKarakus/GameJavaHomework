package Business.abstracts;

import Entities.concretes.Campaign;
import Entities.concretes.Game;
import Entities.concretes.Gamer;

public interface GameSaleService {
    void purchase (Gamer gamer, Game game, Campaign campaign);
    void refund(Gamer gamer, Game game, Campaign campaign);
}
