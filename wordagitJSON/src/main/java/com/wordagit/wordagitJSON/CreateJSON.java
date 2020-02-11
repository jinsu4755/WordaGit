package com.wordagit.wordagitJSON;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject; //create JSON Object

public class CreateJSON {
	public CreateJSON() {
		// 최종 JSON 객체
		JSONObject jsonObject = new JSONObject();
		// person의 JSON정보를 가지는 Array선언
		JSONArray personArray = new JSONArray();
		// JArray에 들어갈 각각하나의 객체 선언
		JSONObject personInfo;
		
		// 정보 채우기
		personInfo = new JSONObject();
		personInfo.put("name", "jinsu");
		personInfo.put("age", "22");
		personInfo.put("nickname", "Antilog");
		// Array 추가
		personArray.add(personInfo);
		
		personInfo = new JSONObject();
		personInfo.put("name", "jinsu2");
		personInfo.put("age", "22");
		personInfo.put("nickname", "Antilog2");
		// Array 추가
		personArray.add(personInfo);
		
		/*
		// 정보 채우기
		personInfo = new JSONObject();
		personInfo.put("name", "jinsu");
		personInfo.put("age", "22");
		personInfo.put("nickname", "Antilog");
		// Array 추가
		personArray.add(personInfo);
		
		* 위와 같은방법으로 본인들 이름 추가
		 */
		
		
		//Kyeul 본인 주석 아래 양식 작성
		
		//haecheol 본인 주석 아래 양식 작성
		personInfo = new JSONObject();
		personInfo.put("name", "haecheol");
		personInfo.put("age", "22");
		personInfo.put("nickname", "hsk");
		// Array 추가
		personArray.add(personInfo);
		
		//eunhak 본인 주석 아래 양식 작성
		personInfo = new JSONObject();
		personInfo.put("name", "eunhak");
		personInfo.put("age", "22");
		personInfo.put("nickname", "IRONHAK");
		// Array 추가
		personArray.add(personInfo);
				
		//jiyeong 본인 주석 아래 양식 작성
		personInfo = new JSONObject();
		personInfo.put("name", "jiyeong");
		personInfo.put("age", "22");
		personInfo.put("nickname", "JIYEONGSTAR");
		// Array 추가
		personArray.add(personInfo);
		
		
		// 전체 객체에 person 배열 추가
		jsonObject.put("wordataTeam", personArray);

		try {
			FileWriter file = new FileWriter("./wordataJson.json");
			file.write(jsonObject.toJSONString());
			file.flush();
			file.close();

			System.out.println("create JSON Object :" + jsonObject);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
