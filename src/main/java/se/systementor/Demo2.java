package se.systementor;

import java.util.ArrayList;

public class Demo2 {
    
    public void run(){
        ArrayList<String> allaNamn = new ArrayList<>();
        allaNamn.add("Stefan");
        allaNamn.add("Josefine");
        allaNamn.add("Oliver1");

        ArrayList<String> filtered = filterWithSevenOrMoreChars(allaNamn);
        for(String s : filtered){
            System.out.println(s);
        }
    }

    public ArrayList<String> filterWithSevenOrMoreChars(ArrayList<String> input){
        ArrayList<String> result = new ArrayList<String>();
        for( String s : input){
            if(s.length() >= 7){
                result.add(s);
            }
        }
        return result;
    }
}
