public class Main {

    public static void main(String[] args) {

        Integer[] intsOne = {1, 2, 3, 4, 5, 6};
        Integer[] intsTwo = {1, 2, 3, 4, 6, 5};
        String[] stringsOne = {"aaa", "bbb", "ccc", "ddd", "eee"};
        String[] stringsTwo = {"aaa", "bbb", "ccc", "ddd"};
        ChecksElements<Integer> checksElementsInteger = new ChecksElements<>();
        ChecksElements<String> checksElementsString = new ChecksElements<>();

        if (checksElementsInteger.takesTwoArraysAndChecksElements(intsOne, intsTwo)) {
            System.out.println("Массивы не одинаковы");
        } else {
            System.out.println("Массивы одинаковы");
        }

        if (checksElementsString.takesTwoArraysAndChecksElements(stringsOne, stringsTwo)) {
            System.out.println("Массивы не одинаковы");
        } else {
            System.out.println("Массивы одинаковы");
        }

        Integer[] integers = checksElementsInteger.exchangingPositionsElementsArray(intsOne, 0, 1);
        checksElementsInteger.printOutArray(integers);

        String[] strings = checksElementsString.exchangingPositionsElementsArray(stringsOne, 0, 3);
        checksElementsString.printOutArray(strings);
    }
}
