package tests.day08;

import org.testng.annotations.Test;

public class C01_Notations {

    @Test (priority = -9)
    public  void  youtubeTesti(){
        System.out.println("youtube testi calisti");

    }
    @Test
    public void amazonTesti(){//priority atanmazsa priority sifir kabul eder
        System.out.println("amazon testi calisti");
    }
    @Test(priority = 5)
    public void bestBuyTesti(){
        System.out.println("bestbuy testi calisti");
    }
}
