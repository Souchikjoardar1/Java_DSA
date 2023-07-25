class String_prac 
{
    public static void main(String s[])
    {
        String str="Java1";
        String str1="Kava";
        if (str==str1)
        System.out.println("points to the same location");
        else
        System.out.println("points to a different location");
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(0,3)); //extract a part of string 
        System.out.println(str.replace('J','k'));// replace old char to new
        System.out.println(str.charAt(2));//display the char present at particular index
        System.out.println(str.toLowerCase());
        System.out.println(str.replace('a','l'));
        System.out.println(str.concat(str1));
        System.out.println(str.startsWith("ja"));//checks whether the string starts with the specified string or not
        System.out.println(str.endsWith("a"));//check whether the string ends with the specified string or not  
        System.out.println(str.indexOf("a"));//returns the index of a particular char inside a string 
        System.out.println(str.indexOf("a",1));//it returns -1 if the specified string is not found
        System.out.println(str.lastIndexOf("a"));//scans from right to left
        System.out.println(str.matches("\\d"));
    }
}