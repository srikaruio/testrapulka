/**
 * UC2 - Render OOPS as Banner using Print Statements
 * 
 * Goal: Display "OOPS" in a large banner made from spaces and * characters.
 * 
 * Key Concepts:
 *   1. ASCII Art             - Visual representation using characters
 *   2. String Manipulation   - Constructing strings to form patterns
 *   3. Operator Overloading  - Using + operator for string concatenation
 *   4. Multiple Print Stmts  - Sequential System.out.println() calls
 * 
 * Requirements:
 *   - Each character: 7 lines tall, 9 characters wide
 *   - Characters separated by 2 spaces
 *   - Uses only * and space characters
 *   - Uses string concatenation (+) to build each line
 */
public class OopsAsciiArt {

    public static void main(String[] args) {

        // -------------------------------------------------------
        // Define each letter as 7 individual line strings (9 chars wide)
        // -------------------------------------------------------

        // Letter: O
        String O1 = " ******* ";
        String O2 = "*       *";
        String O3 = "*       *";
        String O4 = "*       *";
        String O5 = "*       *";
        String O6 = "*       *";
        String O7 = " ******* ";

        // Letter: P
        String P1 = "******** ";
        String P2 = "*       *";
        String P3 = "*       *";
        String P4 = "******** ";
        String P5 = "*        ";
        String P6 = "*        ";
        String P7 = "*        ";

        // Letter: S
        String S1 = " ******* ";
        String S2 = "*       *";
        String S3 = "*        ";
        String S4 = " ******* ";
        String S5 = "        *";
        String S6 = "*       *";
        String S7 = " ******* ";

        // Separator between letters
        String gap = "  ";

        // -------------------------------------------------------
        // Print the OOPS Banner - Line by Line using concatenation
        // -------------------------------------------------------
        System.out.println(O1 + gap + O1 + gap + P1 + gap + S1);
        System.out.println(O2 + gap + O2 + gap + P2 + gap + S2);
        System.out.println(O3 + gap + O3 + gap + P3 + gap + S3);
        System.out.println(O4 + gap + O4 + gap + P4 + gap + S4);
        System.out.println(O5 + gap + O5 + gap + P5 + gap + S5);
        System.out.println(O6 + gap + O6 + gap + P6 + gap + S6);
        System.out.println(O7 + gap + O7 + gap + P7 + gap + S7);
    }
}
