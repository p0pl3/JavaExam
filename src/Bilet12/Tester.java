package Bilet12;

public class Tester {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        list.add(2);
        list.printList();
        list.insert(0,3);
        list.printList();
    }
}
