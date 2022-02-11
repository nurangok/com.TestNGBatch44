package tests.day12;

import org.testng.annotations.Test;
import tests.day10.C01_Alerts;
import utilities.TestBase;

public class C01_TestBaseKullanim  {

    @Test
    //projeniz iceisinde herhangi bir classtan obje oluturablr ve obje sayesnde ait oldugu
    //classtaki tum variable ve metodlara access modifier izin verdgi surece ulasablrim
    public void tets01(){
        C01_Alerts obj=new C01_Alerts();
        //eger proje kapsamnda bir classtan obje olsutuurlmasini engellemek isterseniz
        //1-o classn comstructor ini private yapablrz
        //2-class in kendisini abstract yapabl;rz
        //1.method cok tercih edilmez sinirli syida kullanimi vardr
        //2.method u kullanabilirz boylece o classtaki abstract olmayan methodlari override etmek
        //mecburiyeti olmadan kullanabilirz ama obje olusturulmaz


    }


}
