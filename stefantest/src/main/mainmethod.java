package main;

import java.io.FileNotFoundException;
import java.io.IOException;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import mailing.MailHelper;

public class mainmethod {

	public static void main(String[] args) throws FileNotFoundException, IOException {		
		
		HashMap<String,String> nimiEmail = new HashMap<String,String>();
		
		nimiEmail.put("Stefan Jaanus R�stern", "stefan.rystern@gmail.com");
		nimiEmail.put("Marko Anderson", "");
		nimiEmail.put("P�rt-Eo Rannap", "");
		nimiEmail.put("Hedi Haljand", "");
		nimiEmail.put("Erki L�ugas", "");
		nimiEmail.put("Marek Tarraste", "");
		nimiEmail.put("Uwe Kersna", "");
		nimiEmail.put("Roland Paal", "");
		nimiEmail.put("Signe Saar", "");
		
		List<String> from = new ArrayList<>();
		from.add("Stefan Jaanus R�stern");
		from.add("Marko Anderson");
		from.add("P�rt-Eo Rannap");
		from.add("Hedi Haljand");
		from.add("Erki L�ugas");
		from.add("Marek Tarraste");
		from.add("Uwe Kersna");
		from.add("Roland Paal");
		from.add("Signe Saar");
		
		List<String> to = new ArrayList<>();
		to.add("Stefan Jaanus R�stern");
		to.add("Marko Anderson");
		to.add("P�rt-Eo Rannap");
		to.add("Hedi Haljand");
		to.add("Erki L�ugas");
		to.add("Marek Tarraste");
		to.add("Uwe Kersna");
		to.add("Roland Paal");
		to.add("Signe Saar");
		Collections.shuffle(to);
		
		while(!kontroll(from,to)){
			Collections.shuffle(to);
		}
		
		for(int i = 0; i<from.size();i++){
			System.out.println(from.get(i)+" teeb kingi "+to.get(i));
		}
		
//		MailHelper mh = new MailHelper();
//		mh.sendMail("", "", "", "");

	}
	
	private static boolean kontroll(List<String> one,List<String> other){
		for(int i = 0; i<one.size();i++){
			if(one.get(i).equals(other.get(i))){
				return false;
			}
		}
		return true;
	}

}
