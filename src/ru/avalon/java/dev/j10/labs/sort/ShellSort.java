package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Сортировка Шелла (англ. Shell sort).
 *
 * <p>Алгоритм сортировки, являющийся усовершенствованным
 * вариантом сортировки вставками. Идея метода Шелла состоит
 * в сравнении элементов, стоящих не только рядом, но и на
 * определённом расстоянии друг от друга. Иными словами —
 * это сортировка вставками с предварительными «грубыми»
 * проходами. Аналогичный метод усовершенствования
 * пузырьковой сортировки называется сортировка расчёской.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%A8%D0%B5%D0%BB%D0%BB%D0%B0">Сортировка Шелла</a>
 */
public class ShellSort implements Sort {

    /**
     * {@inheritDoc}
     */
    public void sort(int[] array) {
        
        if (array != null || array.length > 0){    // проверка
        int tmp;               // инициализация переменных 
        int h = 0;             // tmp и h
        
        /*  TODO (Проверка№1 ЛР№3)
            - Перед обращением к массиву следует делать проверку на правильность массива,
            если array = null, возникает ошибка!!!
            - Исправить!
            - Добавить комментарии к полям и методам класса
        */
        // Реализация сортировки Шелла
            while (h <= array.length/3)                     
                h = 3*h +1;                                 
            for (int k = h; k > 0; k = (k-1)/3) {           
                for (int i = k; i < array.length; i++){     
                    tmp = array[i];                         
                    int j;                                  
                    for ( j = i; j >=k; j = j-k){           
                        if (tmp < array[j-k])               
                            array[j] = array [j - k];       
                        else 
                            break;}
                
                    array[j] = tmp;
                  
                }
            }
        }
        /*
         * TODO(Студент): Реализовать метод sort класса ShellSort
         */
    }
}
