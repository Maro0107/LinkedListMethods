import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Adam");
        String p1 = "Ola";
        list.add(p1);
        list.addFirst("Rafal");
        list.addLast("Olek");

        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        System.out.println(list.contains("Olek"));

        list.add("Daniel");
        list.add("Kuba");
        list.add(p1);
        list.add("Ania");
        list.add("Ania");
        list.add("Kuba");
        list.add("Ania");
        list.add(p1);

        System.out.println(list);

        list.removeLastOccurrence("Ania");
        list.removeFirstOccurrence(p1);
        System.out.println(list);

        list.add(1, "Zenon");
        list.set(0,"Piotr");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.indexOf("Daniel"));

        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

        System.out.println("/////////////////////////");

        ListIterator<String> iterator1 = list.listIterator(list.size());
        while(iterator1.hasPrevious()){
            String str1 = iterator1.previous();
            System.out.println(str1);
        }

    }
}

