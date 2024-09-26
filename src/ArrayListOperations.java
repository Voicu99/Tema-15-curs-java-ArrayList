import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {

    public static void main(String[] args) {
        // 1. Create a new array list, add some colors, and print out the collection.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println("1. Colors ArrayList: " + colors);

        // 2. Iterate through all elements in an array list.
        System.out.println("2. Iterating through the list:");
        for (String color : colors) {
            System.out.println(color);
        }

        // 3. Insert an element into the array list at the first position.
        colors.add(0, "Orange");
        System.out.println("3. After adding at first position: " + colors);

        // 4. Retrieve an element from a given array list.
        String colorAtIndex2 = colors.get(2);
        System.out.println("4. Element at index 2: " + colorAtIndex2);

        // 5. Update specific array element by given element.
        colors.set(1, "Purple");
        System.out.println("5. After updating index 1 with 'Purple': " + colors);

        // 6. Remove the third element from a list.
        colors.remove(3);
        System.out.println("6. After removing the third element: " + colors);

        // 7. Search an element in an array list.
        String searchElement = "Blue";
        boolean containsElement = colors.contains(searchElement);
        System.out.println("7. Is '" + searchElement + "' in the list? " + containsElement);

        // 8. Sort a given array list.
        Collections.sort(colors);
        System.out.println("8. Sorted Colors ArrayList: " + colors);

        // 9. Copy one array list into another.
        ArrayList<String> copiedColors = new ArrayList<>(colors);
        System.out.println("9. Copied ArrayList: " + copiedColors);

        // 10. Shuffle elements in an array list.
        Collections.shuffle(colors);
        System.out.println("10. Shuffled Colors ArrayList: " + colors);

        // 11. Reverse elements in an array list.
        Collections.reverse(colors);
        System.out.println("11. Reversed Colors ArrayList: " + colors);

        // 12. Extract a portion of an array list.
        ArrayList<String> subList = new ArrayList<>(colors.subList(1, 3));
        System.out.println("12. Extracted sublist (index 1 to 2): " + subList);

        // 13. Compare two array lists.
        boolean isEqual = colors.equals(copiedColors);
        System.out.println("13. Are colors and copiedColors equal? " + isEqual);

        // 14. Swap two elements in an array list.
        Collections.swap(colors, 1, 2);
        System.out.println("14. After swapping index 1 and 2: " + colors);

        // 15. Join two array lists.
        ArrayList<String> joinedList = new ArrayList<>(colors);
        joinedList.addAll(copiedColors);
        System.out.println("15. Joined ArrayList: " + joinedList);

        // 16. Clone an array list to another array list.
        ArrayList<String> clonedColors = (ArrayList<String>) colors.clone();
        System.out.println("16. Cloned Colors ArrayList: " + clonedColors);

        // 17. Empty an array list.
        clonedColors.clear();
        System.out.println("17. After emptying clonedColors: " + clonedColors);

        // 18. Test if an array list is empty or not.
        boolean isEmpty = clonedColors.isEmpty();
        System.out.println("18. Is clonedColors empty? " + isEmpty);

        // 19. Trim the capacity of an array list to the current list size.
        colors.trimToSize();
        System.out.println("19. Trimmed Colors ArrayList: " + colors);

        // 20. Increase the size of an array list.
        colors.ensureCapacity(10); // Ensure capacity of at least 10
        colors.add("Pink");
        System.out.println("20. After increasing capacity and adding 'Pink': " + colors);
    }
}
