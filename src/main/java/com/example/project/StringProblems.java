package com.example.project;
public class StringProblems{
    //empty constructor
    public StringProblems(){}


    // Given a string, return true if it ends in "ly".
    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
    public boolean endsLy(String x)
    {
        if (x.length() == 1)
        {
            return false;
        }
        int startidx = x.length() - 2;
        if (x.substring(startidx).equals("ly"))
        {
            return true;
        }
        return false;
    }


    // Given two strings, append them together (known as "concatenation") 
    // and return the result. However, if the concatenation creates a double-char, 
    // then omit one of the chars, so "abc" and "cat" yields "abcat".
    // conCat("abc", "cat") → "abcat"
    // conCat("dog", "cat") → "dogcat"
    // conCat("abc", "") → "abc"
    public String conCat(String s1, String s2)
    {
        String newString;
        if (s1.equals("") || s2.equals(""))
        {
            return s1 + s2;
        }
        if (s1.substring(s1.length()-1).equals(s2.substring(0,1)))
        {
            s2 = s2.substring(1);
        }
        newString = s1 + s2;
        return newString;
    }

    // Given a string, return a version without the first 2 chars. 
    // Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
    // The string may be any length. Harder than it looks.
    // deFront("Hello") → "llo"
    // deFront("java") → "va"
    // deFront("away") → "aay"
    // deFront("aapple") -> "apple"
    // deFront("abeep") -> "abeep"
    public String deFront(String s1){
        String x = s1;
        if ((s1.substring(0, 1).equals("a")) == false)
        {
            x = s1.substring(1);
            if ((x.substring(0, 1).equals("b")) == false)
            {
                x = x.substring(1);
            }

        }
        else if ((s1.substring(1,2).equals("b")) == false)
        {
            x = s1.substring(0,1) + s1.substring(2);
        }

        return x;
    }

    
    // Given a string, if the first or last chars are 'x', 
    // return the string without those 'x' chars, and otherwise 
    // return the string unchanged.
    // withoutX("xHix") → "Hi"
    // withoutX("xHi") → "Hi"
    // withoutX("Hxix") → "Hxi"
    public String withoutX(String s1)
    {
        if (s1.substring(0,1).equals("x"))
        {
            s1 = s1.substring(1);
        }
        if (s1.substring(s1.length()-1).equals("x"))
        {
            s1 = s1.substring(0, s1.length()-1);
        }
        return s1;
    }

    // Given a string str, if the string starts with "f" return "Fizz".
    //  If the string ends with "b" return "Buzz". If both the "f" and "b" 
    //  conditions are true, return "FizzBuzz". In all other cases, return the 
    //  string unchanged. (See also: FizzBuzz Code)
    // fizzString("fig") → "Fizz"
    // fizzString("dib") → "Buzz"
    // fizzString("fib") → "FizzBuzz"
    public String fizzString(String s1)
    {
        if (s1.substring(0,1).equals("f") && s1.substring(s1.length()-1).equals("b"))
        {
            s1 = "FizzBuzz";
        }
        else if (s1.substring(0,1).equals("f"))
        {
            s1 = "Fizz";
        }
        else if (s1.substring(s1.length()-1).equals("b"))
        {
            s1 = "Buzz";
        }
        return s1;
    }

    // Given an int n, return the string form of the number followed 
    // by "!". So the int 6 yields "6!". Except if the number is 
    // divisible by 3 use "Fizz" instead of the number, and if the 
    // number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
    //  Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3.
    //   What will the remainder be when one number divides evenly into another? 
    // fizzString2(1) → "1!"
    // fizzString2(2) → "2!"
    // fizzString2(3) → "Fizz!"
    public String fizzString2(int x)
    {
        if (x % 3 == 0 && x % 5 == 0)
        {
            return "FizzBuzz!";
        }
        else if (x % 3 == 0)
        {
            return "Fizz!";
        }
        else if (x % 5 == 0)
        {
            return "Buzz!";
        }
        return (String)(x + "!");
    }
}