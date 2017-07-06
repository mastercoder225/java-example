package com.example.java.apache.commons.lang;

import org.apache.commons.lang3.StringUtils;

public class JavaStringUtils {

    public static void main(String[] args) {
        // isEmpty|isNotEmpty
        StringUtils.isEmpty(null);  // true
        StringUtils.isEmpty("");    // true
        StringUtils.isEmpty(" ");   // false
        StringUtils.isEmpty("abc"); // false

        // isBlank|isNotBlank
        StringUtils.isBlank(null);  // true
        StringUtils.isBlank("");    // true
        StringUtils.isBlank(" ");   // true
        StringUtils.isBlank("abc"); // false

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







    }
}
