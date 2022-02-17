import java.io.File;

public class Z3 {

    public static File[] podktalogi(String sciezka)
    {
        File[] wyniki = {};
      
        try
        {
            File zrodlo = new File(sciezka);
            wyniki = zrodlo.listFiles(File::isDirectory);
        }

        catch (Exception e)
        {
            System.exit(0);
        }

        finally 
        {
            System.out.println(sciezka);
        }

        return wyniki;
    }

    public static void main(String[] args) {

        File[] test = podktalogi("C:\\csfdsd");
        if(test != null) {
            for (File i : test)
                System.out.println(i);
        }
    }
}
