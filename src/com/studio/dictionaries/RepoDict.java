package com.studio.dictionaries;

import java.util.HashMap;
import java.util.HashSet;

public class RepoDict extends HashMap<String,RepoStruct> {
//    static repoDict
    public RepoDict ( String repo ) {
        RepoStruct empty = new RepoStruct();
        this.put ( repo, empty );
    }
    public void RepoAddBranch ( String repo, String branch ) {
        if ( this.containsKey(repo) ) {
            this.get(repo).add(branch);
        }
    }
}

class RepoStruct extends HashSet<String> {

}
