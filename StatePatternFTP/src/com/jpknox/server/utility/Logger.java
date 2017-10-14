package com.jpknox.server.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by JoaoPaulo on 14-Oct-17.
 */
public class Logger {

    public static int log(String text) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date) + ":\t" + text);
        return 0;
    }
}
