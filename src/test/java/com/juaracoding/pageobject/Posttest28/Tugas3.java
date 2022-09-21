package com.juaracoding.pageobject.Posttest28;

public class Tugas3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] tag1= {"SOAL3/2112/AB00000","0011 OD:0001234500","CDE5432100 SOAL003"," ABCDE12345 XAS SK","ILL TEST ESSAY .DT"};
		String [] tag2= {"SOAL3/2111/BC00001","1100 OD:0003452100","EFG2451300 SOALOO3"," EFGHI25134 XAS SK","ILL TEST ESSAY .DT"};
		String [] tag3= {"SOAL3/2110/DE21003","1010 OD:0001524300","HIJ2145300 SOALOO3"," JKLMNS2431 XAS SK","ILL TEST ESSAY .DT"};
		
		String Tag1="202112SOAL3";
		String Tag2="202111SOAL3";
		String Tag3="202110SOAL3";
		
		System.out.println(Tag1);
		System.out.println(tag1[2]+tag1[3]+tag1[4]+tag1[0]+tag1[1]);
		System.out.println(Tag2);
		System.out.println(tag2[2]+tag2[3]+tag2[4]+tag2[0]+tag2[1]);
		System.out.println(Tag3);
		System.out.println(tag3[2]+tag3[3]+tag3[4]+tag3[0]+tag3[1]);
		}
}
