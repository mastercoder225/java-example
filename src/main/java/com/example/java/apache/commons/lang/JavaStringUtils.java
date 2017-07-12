package com.example.java.apache.commons.lang;

import org.apache.commons.lang3.StringUtils;

public class JavaStringUtils {

    public static void main(String[] args) {
        // isEmpty|isNotEmpty|isBlank|isNotBlank
        StringUtils.isEmpty( null); // true
        StringUtils.isEmpty(   ""); // true
        StringUtils.isEmpty("   "); // false
        StringUtils.isEmpty("abc"); // false

        StringUtils.isNotEmpty( null); // false
        StringUtils.isNotEmpty(   ""); // false
        StringUtils.isNotEmpty("   "); // true
        StringUtils.isNotEmpty("abc"); // true

        StringUtils.isBlank( null); // true
        StringUtils.isBlank(   ""); // true
        StringUtils.isBlank("   "); // true
        StringUtils.isBlank("abc"); // false

        StringUtils.isNotBlank( null); // false
        StringUtils.isNotBlank(   ""); // false
        StringUtils.isNotBlank("   "); // false
        StringUtils.isNotBlank("abc"); // true

        // trim|trimToEmpty|trimToNull
        StringUtils.trim(null);    // null
        StringUtils.trim("");      // ""
        StringUtils.trim(" ");     // ""
        StringUtils.trim(" abc "); // "abc"

        StringUtils.trimToEmpty(null);    // ""
        StringUtils.trimToEmpty("");      // ""
        StringUtils.trimToEmpty(" ");     // ""
        StringUtils.trimToEmpty(" abc "); // "abc"

        StringUtils.trimToNull(null);    // null
        StringUtils.trimToNull("");      // null
        StringUtils.trimToNull(" ");     // null
        StringUtils.trimToNull(" abc "); // "abc"

        // strip|stripToEmpty|stripToNull|stripStart|stripEnd
        StringUtils.strip(null);    // null
        StringUtils.strip("");      // ""
        StringUtils.strip(" ");     // ""
        StringUtils.strip(" abc "); // "abc"

        StringUtils.stripToEmpty(null);    // ""
        StringUtils.stripToEmpty("");      // ""
        StringUtils.stripToEmpty(" ");     // ""
        StringUtils.stripToEmpty(" abc "); // "abc"

        StringUtils.stripToNull(null);    // null
        StringUtils.stripToNull("");      // null
        StringUtils.stripToNull(" ");     // null
        StringUtils.stripToNull(" abc "); // "abc"

        StringUtils.strip(null, "anything"); // null
        StringUtils.strip("", "anything");   // ""
        StringUtils.strip(" ", "anything");  // ""
        StringUtils.strip(" abc ", null);    // "abc"
        StringUtils.strip("yxabcz", "xyz");  // "abc"

        StringUtils.stripStart(null, "anything"); // null
        StringUtils.stripStart("", "anything"); // ""


        // equals|equalsIgnoreCase
        StringUtils.equals(null, null);   // true
        StringUtils.equals(null, "abc");  // false
        StringUtils.equals("abc", null);  // false
        StringUtils.equals("abc", "abc"); // true
        StringUtils.equals("abc", "ABC"); // false

        StringUtils.equalsIgnoreCase(null, null);   // true
        StringUtils.equalsIgnoreCase(null, "abc");  // false
        StringUtils.equalsIgnoreCase("abc", null);  // false
        StringUtils.equalsIgnoreCase("abc", "abc"); // true
        StringUtils.equalsIgnoreCase("abc", "ABC"); // true



        // substring
        StringUtils.substring( null,  0); // null
        StringUtils.substring(   "",  0); // ""
        StringUtils.substring("abc",  0); // "abc"
        StringUtils.substring("abc",  2); // "c"
        StringUtils.substring("abc",  4); // ""
        StringUtils.substring("abc", -2); // "bc"
        StringUtils.substring("abc", -4); // "abc"

        StringUtils.substring( null,  0,  0); // null
        StringUtils.substring(   "",  0,  0); // ""
        StringUtils.substring("abc",  0,  2); // "ab"
        StringUtils.substring("abc",  2,  0); // ""
        StringUtils.substring("abc",  2,  4); // "c"
        StringUtils.substring("abc",  4,  6); // ""
        StringUtils.substring("abc",  2,  2); // ""
        StringUtils.substring("abc", -2, -1); // "b"
        StringUtils.substring("abc", -4,  2); // "ab"

        // left|right|mid
        StringUtils.left( null,  0); // null
        StringUtils.left("***", -1); // ""
        StringUtils.left(   "",  0); // ""
        StringUtils.left("abc",  0); // ""
        StringUtils.left("abc",  2); // "ab"
        StringUtils.left("abc",  4); // "abc"

        StringUtils.right( null,  0); // null
        StringUtils.right("***", -1); // ""
        StringUtils.right(   "",  0); // ""
        StringUtils.right("abc",  0); // ""
        StringUtils.right("abc",  2); // "bc"
        StringUtils.right("abc",  4); // "abc"

        StringUtils.mid(null, 0, 0); // null
        StringUtils.mid("***", 0, -1); // ""
        StringUtils.mid("", 0, 0); // ""

        // leftPad|rightPad|center|repeat



















        // upperCase|lowerCase|swapCase|capitalize|uncapitalize
        StringUtils.upperCase( null); // null
        StringUtils.upperCase(   ""); // ""
        StringUtils.upperCase("aBc"); // "ABC"

        StringUtils.lowerCase( null); // null
        StringUtils.lowerCase(   ""); // ""
        StringUtils.lowerCase("aBc"); // "abc"

        StringUtils.swapCase( null); // null
        StringUtils.swapCase(   ""); // ""
        StringUtils.swapCase("aBc"); // "AbC"

        StringUtils.capitalize( null); // null
        StringUtils.capitalize(   ""); // ""
        StringUtils.capitalize("cat"); // "Cat"

        StringUtils.uncapitalize( null); // null
        StringUtils.uncapitalize(   ""); // ""
        StringUtils.uncapitalize("Cat"); // "cat"




























    }
}
