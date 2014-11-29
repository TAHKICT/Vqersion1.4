package Banks;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Pandora
 * Date: 02.10.14
 * Time: 16:53
 * To change this template use File | Settings | File Templates.
 */
public class Current {
    static BankFactory bankFactory = new BankFactory();
    static Bank privat = bankFactory.getBank("privatbank");
    static Bank pravex = bankFactory.getBank("pravexbank");
    static Bank citycommerce = bankFactory.getBank("citycommercebank");
    static Bank xrest = bankFactory.getBank("xbank");
       //PrivatBank
    public static double getPrivatUSDbuy() throws IOException {
        return privat.getUSDbuy();
    }
    public static double getPrivatUSDsell() throws IOException {
        return privat.getUSDsell();
    }
    public static double getPrivatEURbuy() throws IOException {
        return privat.getEURbuy();
    }
    public static double getPrivatEURsell() throws IOException {
        return privat.getEURsell();
    }
    //CityCommerceBank
    public static double getCityCommerceUSDbuy() throws IOException{
        return citycommerce.getUSDbuy();
    }
    public static double getCityCommerceUSDsell() throws IOException{
        return citycommerce.getUSDsell();
    }
    public static double getCityCommerceEURbuy() throws IOException{
        return citycommerce.getEURbuy();
    }
    public static double getCityCommerceEURsell() throws IOException{
        return citycommerce.getEURsell();
    }
    //PravexBank
    public static double getPravexUSDbuy() throws IOException{
        return pravex.getUSDbuy();
    }
    public static double getPravexUSDsell() throws IOException{
        return pravex.getUSDsell();
    }
    public static double getPravexEURbuy() throws IOException{
        return pravex.getEURbuy();
    }
    public static double getPravexEURsell() throws IOException{
        return pravex.getEURsell();
    }
    public static String getHTML() throws IOException{
        return pravex.getHTML("");
    }
    //XCityBank
    public static double getXCityUSDbuy() throws IOException {
        return  xrest.getUSDbuy();
    }
    public static double getXCityUSDsell() throws IOException {
        return  xrest.getUSDsell();
    }
    public static double getXCityEURbuy() throws IOException {
        return  xrest.getEURbuy();
    }
    public static double getXCityEURsell() throws IOException {
        return  xrest.getEURsell();
    }

    public static void main (String[] args) throws IOException {
        /*int n = getHTML().indexOf("15.5500");
        int nn = getHTML().indexOf("19.1000");
        int nnn = getHTML().indexOf("19.5500");
        System.out.println(n + " " + nn + " " + nnn);   */
        //System.out.println(getHTML());
        //System.out.println(pravex.getUSDbuy());
        System.out.println(getPrivatUSDbuy() + " " + getPrivatUSDsell() + " " + getPrivatEURbuy() + " " + getPrivatEURsell());
        System.out.println(getCityCommerceUSDbuy() + " " + getCityCommerceUSDsell() + " " + getCityCommerceEURbuy() + " " + getCityCommerceEURsell());
        System.out.println(getPravexUSDbuy() + " " + getPravexUSDsell() + " " + getPrivatEURbuy() + " " + getPravexEURsell());
        System.out.println(getXCityUSDbuy() + " " + getXCityUSDsell() + " " + getXCityEURbuy() + " " + getXCityEURsell());

    }
}
