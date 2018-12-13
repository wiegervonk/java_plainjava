import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Logger;
import com.java_plainjava.readcsvfile.*;
import com.studio.dictionaries.ProjectDict;
import com.studio.dictionaries.RepoDict;

/* dit was toegevoeggd door Npp, 2e keer */

public class Main {
    static private String mijnNaam;
    public static void main(String[] args) {
//      Voorbeeld voor verwerken van vakkenpakket
        Logger l = Logger.getLogger(Main.class.getName());
        Vakkenpakket mijnPakket = new Vakkenpakket("wieger");
        System.out.println("Hello World1!");
        mijnNaam = mijnPakket.getNaam();
        Logger l2 = Logger.getLogger(Vakkenpakket.class.getName());
        System.out.println("Hello World2!" + mijnNaam);

//      Voorbeeld voor verwerken van Structuren
        RepoDict myRepoDict = new RepoDict();
        myRepoDict.addRepo("voorbeeld", "met description");
        String r = "repo-abc", b = "br-abc";
        myRepoDict.addRepoBranch( "repo1", "br1a" );
        myRepoDict.addRepoBranch( "repo1", "br1b" );
        myRepoDict.addRepoBranch( "repo-xyz", "br-xyz1b" );
        myRepoDict.addRepoBranch( r, b );
        r = b = "nieuwe waarde";
        System.out.println ("myRepoDict = " + myRepoDict.toString() );

//        do the serialization
        try {
            String filepath = "RepoDict.ser";
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(myRepoDict);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in " + filepath);
        } catch (IOException i) {
            i.printStackTrace();
        }
//        ProjectDict myProjectDict = new ProjectDict();
//        String s = myProjectDict.getBranches("proj1");

//        Voorbeeld voor verwerken van csv file
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