package suitA;

import homePage.FirstPage;
import org.testng.annotations.Test;

/**
 * Created by MdKhan on 12/29/13.
 */
public class OpenPage extends FirstPage{

    @Test
    public void UrlTest(){

        System.out.println("New Massages");
        OpenWebpage();
        System.out.println("A Firefox page will open");
    }
}
