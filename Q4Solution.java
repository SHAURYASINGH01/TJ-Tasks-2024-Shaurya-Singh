public class Q4 {
    public static int compress(char[] chars) {
        //write your code here
        int writeIndex = 0;
        for (int readIndex = 0; readIndex < chars.length; readIndex++) {
            char currentChar = chars[readIndex];
            int count = 0;
            while (readIndex < chars.length && chars[readIndex] == currentChar) {
                  count++;
                  readIndex++;
            }
            chars[writeIndex++] = currentChar;
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (int i = 0; i < countStr.length(); i++) {
                    chars[writeIndex++] = countStr.charAt(i);
                }
            }
        }
        return writeIndex;
    }
  
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newSize = compress(chars);
        System.out.println("New length: " + newSize);
        for (int i = 0; i < newSize; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();
    }
}
