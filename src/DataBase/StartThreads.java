package DataBase;

/**
 * Created with IntelliJ IDEA.
 * User: Scirocco
 * Date: 16.10.14
 * Time: 15:56
 * To change this template use File | Settings | File Templates.
 */
public class StartThreads {
    static PutInDB DBwork;
    public static void start(){
        DBwork = new PutInDB();
        DBwork.start();
    }
    public static void main(String[]args){
        DBwork = new PutInDB();
        DBwork.start();
    }
}
