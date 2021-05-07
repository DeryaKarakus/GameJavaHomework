import Business.abstracts.CampaignService;
import Business.abstracts.GameSaleService;
import Business.abstracts.GameService;
import Business.abstracts.GamerService;
import Business.concretes.CampaignManager;
import Business.concretes.GameManager;
import Business.concretes.GameSaleManager;
import Business.concretes.GamerManager;
import Core.MernisManagerAdapter;
import DataAccess.concretes.HibernateCampaignDao;
import DataAccess.concretes.HibernateGameDao;
import DataAccess.concretes.HibernateGamerDao;
import Entities.concretes.Campaign;
import Entities.concretes.Game;
import Entities.concretes.Gamer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        GamerService gamerService = new GamerManager(new MernisManagerAdapter());
        gamerService.add(new Gamer(2, "Derya", "Karakuş", "12345678912",LocalDate.of(1900,1,23)));

        System.out.println("***********************************************************");

        GameService gameService = new GameManager(new HibernateGameDao());
        gameService.add(new Game(12,"Don't Starve Together",24,8.16,"Survival",
                "Fight, Farm, Build and Explore Together in the standalone multiplayer expansion to the uncompromising wilderness survival game, Don't Starve.",
                "21 April 2016","Klei Entertainment"));

        System.out.println("***********************************************************");

        CampaignService campaignService = new CampaignManager(new HibernateCampaignDao());
        campaignService.add(new Campaign(22,"SPECIAL PROMOTION!",0.66));


        System.out.println("***********************************************************");

        





    }
}
