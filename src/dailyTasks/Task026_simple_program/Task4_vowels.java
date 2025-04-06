package dailyTasks.Task026_simple_program;

//Check if a Character is a Vowel or Consonant.
public class Task4_vowels {
    public static void main(String[] args) {
        String input = "Check if a Character is a Vowel or Consonant.";
        int vowels = 0, consonant = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 's') {
                System.out.println("Vowels - " + ch);
                vowels++;
            } else {
                System.out.println("Consonant - " + ch);
                consonant++;
            }
        }
        System.out.println("Number of vowels - " + vowels);
        System.out.println("Number of consonant - " + consonant);
    }
}
