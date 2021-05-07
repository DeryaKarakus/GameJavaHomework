package Business.concretes;


import Business.abstracts.CampaignService;
import Business.abstracts.GameSaleService;
import Business.abstracts.GameService;
import Business.abstracts.GamerService;
import DataAccess.abstracts.CampaignDao;
import DataAccess.abstracts.GameDao;
import DataAccess.abstracts.GamerDao;
import Entities.concretes.Campaign;
import Entities.concretes.Game;
import Entities.concretes.Gamer;

public class GameSaleManager implements GameSaleService{
    private CampaignDao campaignDao;
    private GameDao gameDao;
    private GamerDao gamerDao;

    public GameSaleManager(CampaignDao campaignDao, GameDao gameDao, GamerDao gamerDao) {
        this.campaignDao = campaignDao;
        this.gameDao = gameDao;
        this.gamerDao = gamerDao;
    }

    public GameSaleManager() {

    }


    @Override
    public void purchase(Gamer gamer, Game game, Campaign campaign) {
        System.out.println(gamer.getFirstName());

    }

    @Override
    public void refund(Gamer gamer, Game game, Campaign campaign) {

    }
}
