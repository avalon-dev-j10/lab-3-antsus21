package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Пузырьковая сортировка (англ. bubble sort).
 *
 * <p>Простой алгоритм сортировки. Для понимания и
 * реализации этот алгоритм — простейший, но эффективен он
 * лишь для небольших массивов. Сложность алгоритма: O(n^2).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%BF%D1%83%D0%B7%D1%8B%D1%80%D1%8C%D0%BA%D0%BE%D0%BC">Пузырьковая сортировка</a>
 */
public class BubbleSort implements Sort {

    /*  TODO (Проверка№1 ЛР№3)
            - Перед обращением к массиву следует делать проверку на правильность массива,
            если array = null, возникает ошибка!!!
            - Исправить!
            - Добавить комментарии к полям и методам класса
    */
    
    // Реализация пузырьковой сортировки
    public void sort(int[] array) {                                     
        
            if (array!= null) {                                             
            for (int i = 0; i < array.length - 1; i++)                      
            for (int j = 0; j < array.length-i-1; j++)                      
                if (array[j] > array[j + 1])                                  
                {                    
                int tmp = array[j];                                         
                array[j] = array[j + 1];                                      
                array[j + 1] = tmp;                                           
                }
        }
        /*
         * TODO(Студент): Реализовать метод sort класса BubbleSort
         */
    }
}
