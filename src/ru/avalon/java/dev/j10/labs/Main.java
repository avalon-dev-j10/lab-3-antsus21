package ru.avalon.java.dev.j10.labs;
//import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.*;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];
        FibonacciInitializer fib = new FibonacciInitializer();
        fib.initialize(array);
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        
        System.out.print ("Массив с последовательностью Фибоначчи: \n");    // вывел, 
        for (int i = 0;  i < array.length; i++) {                           // чтобы  
        System.out.print(array[i] + " ");}                                  // проверить
        System.out.println();                                               // правильность

        int sum = 0;
        for (int a = 0; a < array.length; a++){
            sum += array[a];
        }
        System.out.println("Сумма элементов массива с последовательностью Фибоначчи = " + sum);
        System.out.println("----------------------------------------------------------------------------------------------------");
        
        //--------------------------------------------------------------------------------------------------------------------------
        
        RandomInitializer rnd = new RandomInitializer(-50, 50);
        rnd.initialize(array);
        
        int[] bubbleArr = new int[20];
	rnd.initialize(bubbleArr); 
        
        System.out.println("Массив случайных чисел для сортировки пузырьком: ");
        
        for ( int j=0; j<bubbleArr.length; j++)
            System.out.print (bubbleArr[j] + " ");
        

	BubbleSort bubble = new BubbleSort();
	bubble.sort(bubbleArr);
        
        System.out.println("\nСортировка пузырьком: ");
	for (int c: bubbleArr){
	System.out.print(c + " ");
	}
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        
        
        
        //----------------------------------------------------------------------------------------------------------------------------
        
        int[] selectArr = new int[20];
	rnd.initialize(selectArr); 
        
        System.out.println("Массив случайных чисел для сортировки выбором: ");
        
        for ( int j=0; j<selectArr.length; j++)
            System.out.print (selectArr[j] + " ");
        

	SelectionSort select = new SelectionSort();
	select.sort(selectArr);
        
        System.out.println("\nСортировка выбором: ");
	for (int c: selectArr){
	System.out.print(c + " ");
	}
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        
        //----------------------------------------------------------------------------------------------------------------------------
        
        int[] shellArr = new int[20];
	rnd.initialize(shellArr); 
        
        System.out.println("Массив случайных чисел для сортировки выбором: ");
        
        for ( int j=0; j<shellArr.length; j++)
            System.out.print (shellArr[j] + " ");
        

	ShellSort shell = new ShellSort();
	shell.sort(shellArr);
        
        System.out.println("\nСортировка выбором: ");
	for (int c: shellArr){
	System.out.print(c + " ");
	}
        System.out.println("\n----------------------------------------------------------------------------------------------------");

	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */     
    }
}
