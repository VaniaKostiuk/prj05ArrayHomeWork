package prj05ArrayHomeWork;

import java.util.Arrays;

public class ProgramArray {

	public static void main(String[] args) {
		/*Определить класс Массив. Создать методы сортировки: 
		 * 
		 * Пузырьковая сортировка (Bubble-sort)
		 * Сортировка Вставками (Insertion-sort)
		 * Метод Хоара - Быстрая сортировка(Quick-sort)
		 */

		int [] arr = {5,2,6,4,1,3} ;
		Arrays.sort(arr);
		for(int i = 0; i <  arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("");
		//Bubble-sort
		int [] arr1 = {5,2,6,4,1,3} ;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i+1; j < arr1.length; j++) {
				if (arr1[i]>arr1[j]) {
		             int min = arr1[i];
		             arr1[i] = arr1[j];
		             arr1[j] = min;
				}
			}
		}
		for(int i = 0; i <  arr1.length; i++) {
			System.out.print(arr1[i] + "  ");
		}
		
	}

}
