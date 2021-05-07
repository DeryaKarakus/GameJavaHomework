package Business.concretes;

import Business.abstracts.CampaignService;
import DataAccess.concretes.HibernateCampaignDao;
import Entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

    public CampaignManager(HibernateCampaignDao hibernateCampaignDao) {
    }

    public CampaignManager() {

    }

    @Override
    public void add(Campaign campaign) {
        System.out.println("The campaign has been added to the system : " + campaign.getCampaignName());
        System.out.println("The discount in the campaign is : " + campaign.getDiscount());

    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("The campaign has been deleted to the system : " + campaign.getCampaignName());

    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("The campaign has been updated to the system : " + campaign.getCampaignName());

    }
}
