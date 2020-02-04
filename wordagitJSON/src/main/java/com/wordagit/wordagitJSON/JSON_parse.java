package com.wordagit.wordagitJSON;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSON_parse {
	public JSON_parse() {
		//파싱 객체 생성
		JSONParser parser = new JSONParser();
		
		try {
			//json 파일을 읽어 Object로 파싱
			Object obj = parser.parse(new FileReader("./wordataJson.json"));
			
			JSONObject jsonObject = (JSONObject) obj;
			
			//wordataList 객체에 json에 리스트로 저장된 wordataTeam을 파싱
			JSONArray wordataArray = (JSONArray) jsonObject.get("wordataTeam");
			
			//for문으로 파싱결과
			for(int i =0; i< wordataArray.size();i++) {
				JSONObject wordataObject = (JSONObject) wordataArray.get(i);
				System.out.println("name: "+ wordataObject.get("name"));
				System.out.println("age: "+ wordataObject.get("age"));
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
