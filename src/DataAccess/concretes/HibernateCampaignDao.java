package DataAccess.concretes;

import DataAccess.abstracts.CampaignDao;
import Entities.concretes.Campaign;

import java.util.List;

public class HibernateCampaignDao implements CampaignDao {
    @Override
    public void add(Campaign campaign) {
        System.out.println("The campaign has been added to the system : " + campaign.getCampaignName());

    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("The campaign has been deleted to the system : " + campaign.getCampaignName());

    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("The campaign has been updated to the system : " + campaign.getCampaignName());

    }

    @Override
    public Campaign get(int campaignId) {
        return null;
    }

    @Override
    public List<Campaign> getAll() {
        return null;
    }
}
