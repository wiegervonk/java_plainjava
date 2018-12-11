package com.studio.dictionaries;

import java.util.HashMap;
import java.util.HashSet;

public class RepoDict extends HashMap<String,RepoStruct> {
    public RepoDict ( String repo ) {
        this.put ( repo, null );
    }
    public void repoAddBranch ( String branch ) {

    }
}

class RepoStruct extends HashSet<String> {

}
