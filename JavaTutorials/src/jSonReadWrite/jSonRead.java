package jSonReadWrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jSonRead {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		JSONParser jsonparser=new JSONParser();
		
		FileReader filereader=new FileReader("Studentdetails.json");
		
	Object parsedobject=	jsonparser.parse(filereader);
		
	JSONObject jsonobject=(JSONObject) parsedobject;  //type costing
	
	String name=(String) jsonobject.get("Name");
		
    Long	age=(Long) jsonobject.get("Age");
    
              JSONArray      array=  (JSONArray) jsonobject.get("Student details");
  
              Iterator iterator=array.iterator();
              
              System.out.println("Name is :"+ name);
              System.out.println("Age is :"+age);
	while(iterator.hasNext()) {
		System.out.println("Studentdetails.jason:"+iterator.next());
	}
              
              
		
		
		
		
		
		
		
	}

}
