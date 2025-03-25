package dailyTasks;

public class Task016_StringBuffer_functions {
    public static void main(String[] args) {
        //1. Creating a StringBuffer
        StringBuffer buffer = new StringBuffer("Rajesh");
        System.out.println(buffer);

        //2. append(String s): Adds text at the end
        buffer.append(" C S");
        System.out.println(buffer);

        //3. insert(int index, String s): Inserts text at a given position
        buffer.insert(5, "java");
        System.out.println(buffer);

        //4. replace(int start, int end, String s): Replaces a substring
        buffer.replace(0, 3, "replace");
        System.out.println(buffer);

        //5. delete(int start, int end): Deletes a substring
        buffer.delete(0, 1);
        System.out.println(buffer);

        //6.reverse(): Reverses the string
        buffer.reverse();
        System.out.println(buffer);

        //7. capacity(): Returns the capacity of the buffer
        buffer.capacity();
        System.out.println(buffer);

        /* 8. ensureCapacity(int minCapacity): Ensures a minimum capacity */
        buffer.ensureCapacity(3);
        System.out.println(buffer);

        /* 9. charAt(int index): Returns a character at a specified index */
        System.out.println(buffer.charAt(1));

        //10. setCharAt(int index, char ch): Changes a character at a position
        buffer.setCharAt(1, 'a');

        //11. length(): Returns the length of the buffer
        System.out.println(buffer.length());

        //12. substring(int start): Extracts a substring
        System.out.println(buffer.substring(3));

        //13.substring(int start, int end): Extracts a substring within a range
        System.out.println(buffer.substring(1, 2));

        //14. toString(): Converts StringBuffer to String
        System.out.println(buffer.toString());

        //15. trimToSize(): Reduces capacity to fit the current content
        buffer.trimToSize();

    }
}
