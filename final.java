class final
{
    public static String reverse(String str)
    {
        if (str == null || str.equals(""))
            return str;
        String rev = "";
        for (int i = str.length() - 1; i >=0 ; i--)
            rev += str.charAt(i);
 
        return rev;
    }
 
    public static void main (String[] args)
    {
        String str = "Reverse me!";
 
        str = reverse(str);
 
        System.out.println("Reversed string is: " + str);
    }
}
