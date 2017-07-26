package com.company;

import java.util.*;

public class Main {

    private static List<String> list = new LinkedList<String>();
    private static GoogleAnalytics googleAnalytics = new GoogleAnalytics();

    public static void main(String[] args) {
//        Invoker invoker = new Invoker(new AddToListCommand(list, "car"), new RemoveFromListCommand(list, "car"));
//
//        list.add("abc");
//        invoker.remove();
//
//        Iterator iter = list.iterator();
//        while (iter.hasNext()) {
//            String entry = (String) iter.next();
//            System.out.println(entry);
//        }

        AnalyticsInvoker analyticsInvoker = new AnalyticsInvoker(new TrackStartupCommand(googleAnalytics, "Application Startup"));
        analyticsInvoker.track();
        analyticsInvoker.setCommand(new TrackTabUsageCommand(googleAnalytics, "20", "30", "40", "10"));
        analyticsInvoker.track();

    }
}
