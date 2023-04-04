package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Bi sayı girive: ");
		double sayi1=scan.nextDouble();
		System.out.println("Bi dene daha sayı girive:");
		double sayi2=scan.nextDouble();
		System.out.println("işlem seçiniz(+,-,*,/)");
		char islem=scan.next().charAt(0);
		if (islem=='+') {
			System.out.println("sayıların toplamı:"+(sayi1+sayi2));
		} else if(islem=='-'){
			System.out.println("sayıların farkı: "+(sayi1-sayi2));

		}else if(islem=='*') {
			System.out.println("sayıların çarpımı: "+(sayi1*sayi2));
			
		 
		}else if (islem=='/') {
			System.out.println("sayıların bölümü:"+(sayi1/sayi2));
			
		}else {
			System.out.println("beni bak düzgün işlem seç!!");
		} 
		{
			
		}
		
		
		
		
	}

}
