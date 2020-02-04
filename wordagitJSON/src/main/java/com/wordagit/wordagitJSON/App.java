package com.wordagit.wordagitJSON;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	boolean run = true;
    	Scanner sc = new Scanner(System.in);
    	while(run) {
    		System.out.println("**실행기**\n" + "1.json 생성 \n" + "2.json 파싱\n"+"3.종료\n");
        	System.out.print("선택 입력:");
    		int num = sc.nextInt();
        	
        	if(num == 1) {
        		new CreateJSON();
        		Thread.sleep(1000);
        	} else if (num == 2) {
        		new JSON_parse();
        		Thread.sleep(1000);
			} else {
				run = false;
				System.out.println("종료합니다.");
				Thread.sleep(1000);
			}
    	}
    }
}
