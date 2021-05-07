package Core;

import Entities.concretes.Gamer;
import Mernis.EPAKPSPublicSoap;

import java.util.Locale;

public class MernisManagerAdapter implements MernisService{
    @Override
    public boolean checkIfRealPerson(Gamer gamer) {

        EPAKPSPublicSoap client = new EPAKPSPublicSoap();

        try {
            return client.TCKimlikNoDogrula(gamer.getNationalityId(),gamer.getFirstName().toUpperCase(Locale.ROOT),gamer.getLastName().toUpperCase(Locale.ROOT),gamer.getDateOfBirth().getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
