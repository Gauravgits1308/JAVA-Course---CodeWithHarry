public class CWH_14_StringMethods {
    public static void main(String[] args) {
        String name = "Gaurav Gupta" ;
        System.out.println("The length of 'name' string is : "+name.length()) ;
        System.out.println("The 'name' in lowercase : "+name.toLowerCase());
        System.out.println("The 'name' in lowercase : "+name.toUpperCase());
        System.out.println("The trimmed 'name' string is : "+name.trim()); // trims extra leading spaces 
        System.out.println("The substring of name from index 7 : "+name.substring(7)); // returns the string characters starting from passed index value
        System.out.println("The substring of name from index 7 : "+name.substring(7,10)); // returns the string characters starting from passed index value and also here we pass en index but endindex is not included in the returned array
        System.out.println("Replace N with F : "+name.replace('G', 'F'));// Replaces character
        System.out.println("Replace N with F : "+name.replace("G","How")); // Replaces String
        System.out.println("name String starts with D : "+name.startsWith("D"));
        System.out.println("name String ends with D : "+name.endsWith("D"));
        System.out.println("Character at index 2 :"+name.charAt(2));
        System.out.println("The index of up is : "+name.indexOf("up")); // returns first occurence
        System.out.println("The index of up is : "+name.indexOf("up",5)); // returns first occurence, starting checking the string from index 5, ignore the ocurrence before it.
        System.out.println("The lastindex of up is : "+name.lastIndexOf("up")); // returns last occurence
        System.out.println("The index of up is : "+name.lastIndexOf("up",5)); // returns last occurence, starting checking the string from index 5 to index 0, ignore the ocurrence after it.
        System.out.println("Is the name equals to : "+name.equals("Gaurav Gupta")); // This comparison is case-sensitivity ...
        System.out.println("Is the name equals to : "+name.equalsIgnoreCase("Gaurav gupta")); // This comparison is not case-sensitivity ...
        
        // Escape Sequence
        System.out.println("My name is \"Gaurav\" ");
    }
}
/*
Escape Sequence	Meaning	Example
\n	New line	Moves text to the next line
\t	Tab space	Adds a tab space
\b	Backspace	Deletes the previous character
\r	Carriage return	Moves cursor to start of line
\f	Form feed	Page break
\"	Double quote	Prints " inside string
\'	Single quote	Prints ' inside string
\\	Backslash	Prints \
*/ 