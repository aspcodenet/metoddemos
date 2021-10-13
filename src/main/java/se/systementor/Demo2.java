package se.systementor;

import java.util.ArrayList;

public class Demo2 {
    

    public void run(){

        ArrayList<String> allaNamn = new ArrayList<>();
        allaNamn.add("Stefan");
        allaNamn.add("Josefine");
        allaNamn.add("Oliver1");


        int minChars = Integer.parseInt(System.console().readLine());
        ArrayList<String> filtered = filterWithMoreCharsThan(allaNamn, minChars);

        //ArrayList<String> filtered = filterWithOrMoreChars(allaNamn, 12);
        for(String s : filtered){
            System.out.println(s);
        }
    }

    public ArrayList<String> filterWithMoreCharsThan(ArrayList<String> input, 
                int minChars){
        ArrayList<String> result = new ArrayList<String>();
        for( String s : input){
            if(s.length() >= minChars){
                result.add(s);
            }
        }
        return result;
    }
}
