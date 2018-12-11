package com.studio.dictionaries;

import java.util.*;

public class ProjectDict {
    private HashMap<String,Set<String>> theProjectDict;
    public ProjectDict (){
        theProjectDict = new HashMap();

        Set<String> br1 = new HashSet();
        br1.add("br1a");
        br1.add("br1b");
        theProjectDict.put("proj1", br1);
        br1.clear();

        Set<String> br2 = new HashSet();
        br2.add("br2a");
        br2.add("br2b");
        theProjectDict.put("proj2", br2);
    }
    public String getBranches(String proj){
/*
        for( Map.Entry<String, String> m : theProjectDict.entrySet()) {
            System.out.println(m.getValue());
        }
*/
        System.out.println("getBranches = " + theProjectDict );
        System.out.println("getBranches = " + theProjectDict.containsKey("proj1") );
        System.out.println("getBranches = " + theProjectDict.get(proj) );
        return "ok";
    }

}
