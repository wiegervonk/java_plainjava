package com.studio.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {
    private static final Logger LOG = Logger.getLogger("plainjava-logging");
    public static void WriteLog (Level lvl, String s){
        LOG.log (lvl, s);
    }
}
