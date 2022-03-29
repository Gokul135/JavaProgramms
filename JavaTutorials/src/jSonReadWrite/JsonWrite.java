package jSonReadWrite;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

    JSONObject jsonobject=new JSONObject();
   
     jsonobject.put("Name", "Gokul");
     jsonobject.put("Age", 25);
     
     JSONArray array=new JSONArray();
     array.add("magical smile");
     array.add("magnetic eyes");
     
     jsonobject.put("Student details", array);
     
     FileWriter fileWriter=new FileWriter("Studentdetails.json");
     fileWriter.write(jsonobject.toJSONString());
     fileWriter.close();
     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
