package Business.concretes;

import Business.abstracts.GamerService;
import Core.MernisManagerAdapter;
import Core.MernisService;
import DataAccess.concretes.HibernateGamerDao;
import Entities.concretes.Gamer;


public class GamerManager implements GamerService {
    private MernisService mernisService;

    public GamerManager(MernisService mernisService) {
        super();
        this.mernisService = mernisService;
    }

    public GamerManager() {

    }


    @Override
    public void add(Gamer gamer) {
        if (this.mernisService.checkIfRealPerson(gamer)){
            System.out.println("Added to database : " + gamer.getFirstName());
            return;
        }
        else {
            System.out.println("Not a valid person");
        }
    }

    @Override
    public void delete(Gamer gamer) {

    }

    @Override
    public void update(Gamer gamer) {

    }

}
