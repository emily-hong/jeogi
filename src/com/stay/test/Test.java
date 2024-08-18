package com.stay.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.stay.dao.ReserveDao;

public class Test {
	public static Scanner sc = new Scanner(System.in);
	public static ReserveDao dao = ReserveDao.getInstance();
	
	public static void main(String[] args) throws SQLException {

		// test
		// 조회 (기본 id순)
//		dao.find("서울특별시").forEach(System.out::println);

		// 조회 : 필터 여러개 선택한 경우 (무료주차, 반려견동반, 사우나/찜질방, 픽업가능)
//	    ArrayList<String> list = new ArrayList<String>();
//		list.add("무료 주차");
//		list.add("반려견동반");
//		list.add("사우나/찜질방");
//		list.add("픽업가능");
//		dao.findByfilter("서울특별시", list).forEach(System.out::println);
		
		
		/////////////////////////
		/*
		String loginId = "";
		// 초기화면
		while(true) {
			// 로그인 
			while(true) {
				// 로그인 서비스 종료
				
				// 메인메뉴
				while(true) {}
			}
		}
		*/
		
		// test
		// 조회 -> 지역 선택 (서울, 경기도, 인천)
		while(true) {
			System.out.println("\n======== 메인 메뉴 ========");
			System.out.println("[1]예약하기  [2]지역선택   [3]마이페이지   [0]종료");
			
			int menu = sc.nextInt();
			System.out.println();
			
			switch(menu) {
			case 1:
				break;
			case 2:
				// 지역선택
				selectLocation();
				
				break;
			case 3:
				// 마이페이지
				break;
				
			case 0:
				break;
			default:
				System.out.println("유효하지않은 번호입니다. 다시 입력해주세요.");

			}	
		}
	}
	
	// 지역선택 
	static void selectLocation() throws SQLException {
		ArrayList<String> optionList = new ArrayList<>();
		// 지역선택 
		System.out.println("\n======== 지역 선택 메뉴 ========");
		System.out.println("[1]서울특별시   [2]강원도   [3]부산   [0]메인돌아가기");
		System.out.print("번호를 입력하세요 : ");
		int num = sc.nextInt();

		String location = ""; 
		if(num != 0) {
			if(num == 1) location = "서울특별시";
			else if(num == 2 ) location = "강원도";
			else if(num == 3) location="부산";
			
			// 옵션선택
			optionList = search(location);
			// 정렬선택
			sortList(location, optionList);
		}
	}

	// 1. 옵션선택기능
	// 1. 옵션선택 : [1]무료주차, [2]반려견동반, [3]사우나/찜질방, [4]픽업가능 [5]옵션선택완료
	static ArrayList<String> search(String location) {
		ArrayList<String> optionList = new ArrayList<>();
		String optionName = "";
		
		boolean keepGoing = true;
		
		while(keepGoing) {
			System.out.println("\n======== 필터 옵션을 선택하세요 ========");
			System.out.println("[1]무료 주차\n" + "[2]반려견동반\n" + "[3]사우나/찜질방\n" + "[4]픽업가능\n" + "[5]선택완료");		
			System.out.println("번호를 입력하세요 : ");
			int optionNum = sc.nextInt();
			if(optionNum == 1) optionName = "무료 주차";
			else if (optionNum == 2) optionName = "반려견동반";
			else if (optionNum == 3) optionName = "사우나/찜질방";
			else if (optionNum == 4) optionName = "픽업가능";
			
			
			switch(optionNum) {
			case 1:
				if(optionList.contains(optionName)) {
					System.out.println("이미 선택한 옵션입니다.");
				} else {
					optionList.add(optionName);
					System.out.println(optionList);
					
				}
				break;
			case 2: 
				if(optionList.contains(optionName)) {
					System.out.println("이미 선택한 옵션입니다.");
				} else {
					optionList.add(optionName);
					System.out.println(optionList);
				}
				break;
			case 3: 
				if(optionList.contains(optionName)) {
					System.out.println("이미 선택한 옵션입니다.");
				} else {
					optionList.add(optionName);
					System.out.println(optionList);
				}
				break;
			case 4: 
				if(optionList.contains(optionName)) {
					System.out.println("이미 선택한 옵션입니다.");
				} else {
					optionList.add(optionName);	
					System.out.println(optionList);
				}
				break;
			case 5:
				keepGoing = false;
			default: 
				System.out.println("유효하지않은 번호입니다. 다시 입력해주세요.");
			}
		}
		return optionList;
	}
	
	// 2. 정렬기능
	// 정렬 : [1]평점높은순, [2]리뷰많은순, [3]낮은가격순
	static void sortList(String location, ArrayList<String> list) throws SQLException {


		boolean keepGoing = true;
		
		while(keepGoing) {
			String sortOption = "";
			System.out.println("\n======== 정렬 옵션을 선택하세요 ========");
			System.out.println("[1] 평점높은순\n" + "[2]리뷰많은순\n" + "[3]낮은가격순\n" + "[0] 메인으로 돌아가기");
			System.out.println("번호를 입력하세요 : ");
			int optionNum = sc.nextInt();
			
			switch(optionNum) {
			case 1:
				// 평점높은순 조회
				dao.findByfilter(location, list, sortOption).forEach(System.out::println);
				break;
			case 2:
				// 리뷰많은순 조회 
				dao.findByfilter(location, list, sortOption).forEach(System.out::println);
				break;
			case 3:
				// 낮은가격순 조회
				dao.findByfilter(location, list, sortOption).forEach(System.out::println);
				break;
			case 0:
				keepGoing = false;
				return;
			default:
				System.out.println("유효하지 않은 번호입니다. 다시 입력해주세요.");
			}
		}
	}
	
}


