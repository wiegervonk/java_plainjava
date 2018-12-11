import java.util.logging.Logger;
import com.java_plainjava.readcsvfile.*;
import com.studio.dictionaries.ProjectDict;
import com.studio.dictionaries.RepoDict;

public class Main {
    static String mijnNaam;
    public static void main(String[] args) {
        Logger l = Logger.getLogger(Main.class.getName());
        Vakkenpakket mijnPakket = new Vakkenpakket("wieger");
        System.out.println("Hello World1!");
        mijnNaam = mijnPakket.getNaam();
        Logger l2 = Logger.getLogger(Vakkenpakket.class.getName());
        System.out.println("Hello World2!" + mijnNaam);

/*
        ProjectDict myProjectDict = new ProjectDict();
        String s = myProjectDict.getBranches("proj1");
*/

        RepoDict myRepoDict = new RepoDict("repo1");
//        myRepoDict.put ( "repo2" );
//        myRepoDict.put ( "repo2", {"br2a","br2b"});
        System.out.println("myRepoDict = " + myRepoDict );

        try {
            new ReadCSVFile("c:\\temp\\samplecsvfile.csv");
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}


class Vakkenpakket {
    private String naam;
    public Vakkenpakket(String eNaam) {
        this.naam = eNaam;
    }

    public String getNaam() {
        return naam;
    }
}