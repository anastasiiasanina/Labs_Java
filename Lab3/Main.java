import java.util.Scanner;

//C3 = 2
//C17 = 14

public class Main {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string:");
        String text = input.nextLine();
		String[] words = text.split(" ");
		String finalRes = "";
		
		for(int i = 0; i < words.length; i++) {
			String firstLetter = String.valueOf(words[i].charAt(0)).toLowerCase();
			String[] splited = words[i].split("");
			String resWord = "";
			
			for(int j = 0; j < splited.length; j++) {
				if(j == 0) resWord += splited[0];
			    if(!splited[j].toLowerCase().equals(firstLetter)) resWord += splited[j]; 
			  }
			finalRes += resWord + " ";

		}
		
        System.out.println("Changed string: " + finalRes);
    }
}
