package com.studio.util;

import java.util.HashSet;
import java.util.Iterator;

public class StringSet extends HashSet<String> {
    public String toString(String start, String sep, String end){
        String outStr = "";
        Iterator<String> elmIter = this.iterator();
        Boolean firstElm = true;
        while ( elmIter.hasNext() ){
            if ( firstElm ) outStr = outStr.concat(start);
            else outStr = outStr + sep;

            outStr = outStr.concat(elmIter.next());
            firstElm = false;
        }
        return outStr + end;
    }
}
