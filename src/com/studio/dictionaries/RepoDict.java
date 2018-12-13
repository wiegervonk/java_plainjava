package com.studio.dictionaries;

import com.studio.util.Logging;
import com.studio.util.StringSet;

import java.util.HashMap;
import java.util.logging.Level;

public class RepoDict implements java.io.Serializable {
    public static HashMap<String,RepoStruct> repoDict;


    public RepoDict ( ) {
        repoDict = new HashMap<String,RepoStruct>();
    }
    public void addRepo (String repo, String desc) {
        repoDict.put ( repo, new RepoStruct(desc) );
    }
    public void addRepoBranch ( String repo, String branch ) {
        if ( !repoDict.containsKey(repo) ) {
            repoDict.put ( repo, new RepoStruct("") );
            Logging.WriteLog (Level.CONFIG, "addRepoBranch: class = " + RepoDict.class);
        }
        repoDict.get(repo).branchSet.add(branch);
    }
    public String toString(){
        String outStr = "";
        boolean firstRepo = true;
        for ( String key: repoDict.keySet() ) {
            if ( ! firstRepo ) outStr = outStr + ";";
            outStr = outStr.concat("{repo=" + key);
            RepoStruct value = repoDict.get(key);
            String desc = value.description;
            if (desc.length() > 0) outStr = outStr.concat("(desc='" + desc + "')");
            outStr = outStr + value.branchSet.toString(",branches=(", ",",")" );
            outStr = outStr.concat("}");
            firstRepo = false;
        }
        return outStr;
    }
}

class RepoStruct{
    public String description;
    public StringSet branchSet;
    public StringSet moduleSet;
    RepoStruct ( String desc ){
        description = desc;
        branchSet = new StringSet();
    }
}
