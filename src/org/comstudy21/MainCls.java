package org.comstudy21;

import java.util.HashMap;
	import java.util.Scanner;

public class MainCls {
	static final int INPUT = 1;
	static final int OUTPUT = 2;
	static final int FINISH = 3;
	static HashMap<Integer, Controller> map = new HashMap<Integer, Controller>();
	static {
		map.put(INPUT, new Input());
		map.put(OUTPUT, new Output());
		map.put(FINISH, new Finish());
	}
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("메누 입력(1~3)>> ");
		int no = scan.nextInt();
		
		Controller ctrl = map.get(no);
		String msg = ctrl.action();
		System.out.println("결과 : " + msg);
		
		if(msg.equals("종료기능")) System.exit(0);
		
		main(null);
	}
}
