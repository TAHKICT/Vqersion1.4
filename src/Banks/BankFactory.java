package Banks;

/**
 * Created with IntelliJ IDEA.
 * User: админ
 * Date: 26.11.14
 * Time: 0:45
 * To change this template use File | Settings | File Templates.
 */
public class BankFactory {
    public Bank getBank(String bankName){
        Bank bank = null;
        if(bankName == null)
            bank = null;
        if(bankName.equalsIgnoreCase("CityCommerceBank"))
            bank = new BankCityCommerce();
        else if(bankName.equalsIgnoreCase("PravexBank"))
            bank =  new BankPravex();
        else if (bankName.equalsIgnoreCase("PrivatBank"))
            bank = new BankPrivat();
        else if (bankName.equalsIgnoreCase("XBank"))
            bank = new BankXCity();

        return bank;
    }
}
