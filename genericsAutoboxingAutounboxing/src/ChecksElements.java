public class ChecksElements<T> {

    public ChecksElements() {
    }

    /*
       Напишите метод, который принимает два массива одного типа и проверяет,
       содержат ли они одинаковые элементы в одном и том же порядке.
       */
    public boolean takesTwoArraysAndChecksElements(T[] objectOne, T[] objectTwo){
        boolean check = true;
        try {
            for (int a = 0; a < objectOne.length; a++){
                if (!objectOne[a].equals(objectTwo[a])) check = false;
            }
        } catch (RuntimeException e) {
            check = false;
        }
        return !check;
    }

     /*
    Напишите универсальный метод, чтобы обмениваться позициями двух различных элементов в массиве.
    */
    public T[] exchangingPositionsElementsArray(T[] array, int a, int b){
        if (a >= array.length || a < 0 || b >= array.length || b < 0) {
            System.out.println("Неправильные параметры позиций");
            return array;
        }
        T tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
        return array;
    }

    public <T> void printOutArray(T[] array){
        for (int i = 0; i < array.length; i++){
            if (i == array.length - 1) {
                System.out.print(array[i] + "\n");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

}
