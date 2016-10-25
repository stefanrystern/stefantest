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
		
		nimiEmail.put("Stefan Jaanus Rüstern", "stefan.rystern@gmail.com");
		nimiEmail.put("Marko Anderson", "");
		nimiEmail.put("Pärt-Eo Rannap", "");
		nimiEmail.put("Hedi Haljand", "");
		nimiEmail.put("Erki Lõugas", "");
		nimiEmail.put("Marek Tarraste", "");
		nimiEmail.put("Uwe Kersna", "");
		nimiEmail.put("Roland Paal", "");
		nimiEmail.put("Signe Saar", "");
		
		List<String> from = new ArrayList<>();
		from.add("Stefan Jaanus Rüstern");
		from.add("Marko Anderson");
		from.add("Pärt-Eo Rannap");
		from.add("Hedi Haljand");
		from.add("Erki Lõugas");
		from.add("Marek Tarraste");
		from.add("Uwe Kersna");
		from.add("Roland Paal");
		from.add("Signe Saar");
		
		List<String> to = new ArrayList<>();
		to.add("Stefan Jaanus Rüstern");
		to.add("Marko Anderson");
		to.add("Pärt-Eo Rannap");
		to.add("Hedi Haljand");
		to.add("Erki Lõugas");
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
