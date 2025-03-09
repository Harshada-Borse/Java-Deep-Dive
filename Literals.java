public class Literals {
    public static void main(String[] args) {
        int a = 101; // Decimal
        int b = 0010; // Octal starts with 0
        int c = 0xFace; // Hexadecimal starts with 0x
        int d = 0b1111; // Binary starts with 0b
        char e = 'A'; // Single character
        e++;
        int g = e + 1;

        int f = 0b1010_1010; // Underscores are allowed in literals
        System.out.println(e);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
    }
}

/*
 * In Java, literals are the source code representation of fixed values. They
 * are represented directly in the code without requiring computation. Here are
 * the types of literals available in Java:
 * 
 * 1. **Integer Literals**:
 * - Decimal (base 10): e.g., `101`
 * - Octal (base 8, starts with `0`): e.g., `010`
 * - Hexadecimal (base 16, starts with `0x` or `0X`): e.g., `0xFace`
 * - Binary (base 2, starts with `0b` or `0B`): e.g., `0b1111`
 * 
 * 2. **Floating-Point Literals**:
 * - e.g., `3.14`, `2.0`, `1e-9`
 * 
 * 3. **Character Literals**:
 * - Single characters enclosed in single quotes: e.g., `'A'`, `'1'`, `'\n'`
 * 
 * 4. **String Literals**:
 * - Sequence of characters enclosed in double quotes: e.g., `"Hello, World!"`
 * 
 * 5. **Boolean Literals**:
 * - `true` and `false`
 * 
 * 6. **Null Literal**:
 * - `null`
 * 
 * 7. **Underscores in Numeric Literals**:
 * - e.g., `1_000_000`, `0b1010_1010`
 * 
 * These literals can be used directly in your Java code to represent constant
 * values. They are used to assign values to variables, pass as arguments to
 * methods, and more.
 */