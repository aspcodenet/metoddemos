package se.systementor;

public class Demo1 {

    public String toTitleCase(String input){
        String result = "";
        boolean firstLetter = true;
        boolean lastLetterWasSpace = false;
        
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(firstLetter || lastLetterWasSpace){
                result = result + Character.toUpperCase(ch);
            }
            else
                result = result + Character.toLowerCase(ch);

            if(ch == ' ')    
                lastLetterWasSpace = true;
            else
                lastLetterWasSpace = false;
            firstLetter = false;
        }
        return result;

    }

     public void run(){
        while(true){
            System.out.println("Enter a name or EXIT to exit");
            String input = System.console().readLine();

            if(input.equalsIgnoreCase("exit"))
                break;    
            String result = toTitleCase(input);
            System.out.println(result);
        
            
        }
    }
}
