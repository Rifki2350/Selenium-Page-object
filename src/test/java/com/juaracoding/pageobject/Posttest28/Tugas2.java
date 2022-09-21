package com.juaracoding.pageobject.Posttest28;

public class Tugas2 {
	public static void main(String[] args) {
        int intloop = 0;
        int c = 10;
        int b = 0;
        for(int a= 0;a<=5;a++) {
            intloop++;
            System.out.println("");
            if(intloop <=0) {
            }
            else {
                for (int i = b ;i<=c;i++) {
                        if( i%2==0) {
                        System.out.print("_");
                        }
                        else {
                            System.out.print(i);
                        }
                }
            }
        if( c==5 && b==5 ){
        }
        else {
            c--;
            b++;
        }
        }
	}
}
