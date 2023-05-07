import java.util.regex.*;

public class RegexClass{
    public static void main(String args[]){
        System.out.println(Pattern.matches("...s","ssas"));//fourth char is s
        System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)
        System.out.println(Pattern.matches(".s","mst"));//true second
        System.out.println(Pattern.matches(".s","Bharat"));//false
        System.out.println(Pattern.matches(".//s"," bhar at")); //space
        System.out.println(Pattern.matches("abc","abc"));
        System.out.println(Pattern.matches("abc","abcbhatrat"));//false
        System.out.println(Pattern.matches("[abc]","c"));//true
        System.out.println(Pattern.matches("[abc]","b"));//true
        System.out.println(Pattern.matches("[abc]","a"));//true
        System.out.println(Pattern.matches("[abc]","ba"));//false
        System.out.println(Pattern.matches("[abc]","abc"));//false
       // ==============================================================//
        System.out.println(Pattern.matches("[abc]+","b"));
        System.out.println(Pattern.matches("[abc]+","a"));
        System.out.println(Pattern.matches("[abc]+","b"));
        System.out.println(Pattern.matches("[abc]+","ab"));
        System.out.println(Pattern.matches("[abc]+","bc"));
        System.out.println(Pattern.matches("[abc]+","ba"));
        System.out.println(Pattern.matches("[abc]+","abc"));
        System.out.println(Pattern.matches("[abc]+","abcc"));
        System.out.println(Pattern.matches("[abc]+","aaaaaaaaaabbbbaabbbbcccccc"));
        System.out.println(Pattern.matches("[abc]+",""));//false
        System.out.println(Pattern.matches("[abc]+","ate"));//false
        System.out.println(Pattern.matches("[abc]+","abcjdjdjdjlaslkss"));//false
        //==============================================================//
        System.out.println(Pattern.matches("[abc]+","abc"));//true
        System.out.println(Pattern.matches("[abc]+","a"));//true
        System.out.println(Pattern.matches("[abc]+","b"));//true
        System.out.println(Pattern.matches("[abc]+","c"));//true
        System.out.println(Pattern.matches("[abc]+","ab"));//true
        System.out.println(Pattern.matches("[abc]+","bc"));//true
        System.out.println(Pattern.matches("[abc]+","ba"));//true
        System.out.println(Pattern.matches("[abc]+","aa"));//true
        System.out.println(Pattern.matches("[abc]+","aaaa"));//true
        System.out.println(Pattern.matches("[abc]+","aba"));//true
        System.out.println(Pattern.matches("[abc]+","abaaabbcbcbbcbcbcbbccbcbcbcbcbc"));//true
        System.out.println(Pattern.matches("[abc]+","abcd"));//false
        System.out.println(Pattern.matches("[abc]+","tewst"));//true
        System.out.println(Pattern.matches("[abc]*","abcjdjdjdjlaslkss"));//false
        //==============================================================//
        System.out.println(Pattern.matches("[^abc]*","test"));//true
        System.out.println(Pattern.matches("[^abc]*"," "));//true
        System.out.println(Pattern.matches("[^abc]*",""));//true
        System.out.println(Pattern.matches("[^abc]*","76678"));//true
        System.out.println(Pattern.matches("[^abc]*","@#$%%^&*(("));//true
        System.out.println(Pattern.matches("[^abc]*","trts1212%^%"));//true
        System.out.println(Pattern.matches("[^abc]*","a"));//false
        System.out.println(Pattern.matches("[^abc]*","b"));//false
        System.out.println(Pattern.matches("[^abc]*","c"));//false
        System.out.println(Pattern.matches("[^abc]*","ab"));//false
        System.out.println(Pattern.matches("[^abc]*","ac"));//false
        System.out.println(Pattern.matches("[^abc]*","bc"));//false
        System.out.println(Pattern.matches("[^abc]*","abc"));//false
        //==============================================================//
        System.out.println(Pattern.matches("[a-zA-Z]*","abc"));//true
        System.out.println(Pattern.matches("[a-zA-Z]*","jgsdfkjsdkfjsdhfaassafagshjskdluiwywrwrewebzbznxmkx"));//true
        System.out.println(Pattern.matches("[a-zA-Z]*","a"));//true
        System.out.println(Pattern.matches("[a-zA-Z]*","b"));//true
        System.out.println(Pattern.matches("[a-zA-Z]*","z"));//true
        System.out.println(Pattern.matches("[a-zA-Z]*","A"));//true
        System.out.println(Pattern.matches("[a-zA-Z]*","B"));//true
        System.out.println(Pattern.matches("[a-zA-Z]*","Z"));//true
        System.out.println(Pattern.matches("[a-zA-Z]*","0"));//false
        System.out.println(Pattern.matches("[a-zA-Z]*","9"));//false
        System.out.println(Pattern.matches("[a-zA-Z]*","&%$#"));//false
        System.out.println(Pattern.matches("[a-zA-Z]*","8766"));//false
        System.out.println(Pattern.matches("[a-zA-Z]*","B36817"));//false
        System.out.println(Pattern.matches("[a-zA-Z]*","Z!@#$%^&"));//false
        //==============================================================//
        System.out.println(Pattern.matches("[a-z&&[^bc]]*","ad"));//a through z, except for b and c //
        System.out.println(Pattern.matches("[a-z&&[^bc]]*","desdhshdhshlkakajhbxvxcznm"));//true
        System.out.println(Pattern.matches("[a-z&&[^bc]]*","da"));//true
        System.out.println(Pattern.matches("[a-z&&[^bc]]*","ab"));//true
        System.out.println(Pattern.matches("[a-z&&[^bc]]*","ab"));//false
        System.out.println(Pattern.matches("[a-z&&[^bc]]*","ac"));//false
        System.out.println(Pattern.matches("[a-z&&[^bc]]*","bc"));//falsse
        System.out.println(Pattern.matches("[a-z&&[^bc]]*","bz"));//false
        System.out.println(Pattern.matches("[a-z&&[^bc]]*","cl78788"));//false
        //==============================================================//
        System.out.println(Pattern.matches("[a-z&&[^e-g]]*","ad"));//a through z, except for e to g //true
        System.out.println(Pattern.matches("[a-z&&[^e-g]]*","adgdnmnb"));//false
        System.out.println(Pattern.matches("[a-z&&[^e-g]]*","ef"));//false
        System.out.println(Pattern.matches("[a-z&&[^e-g]]*","efghatatag"));//false
        //==============================================================//
        //   \\d---    Any digits, short of [0-9]
        System.out.println(Pattern.matches("\\d", "0"));//true
        System.out.println(Pattern.matches("\\d", "1"));//true
        System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)
        System.out.println(Pattern.matches("\\d*", "4443"));//true (Due to *-digit  comes more than once)
        System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)
        //==============================================================//
        //   \\D---    Any digits, short of [^0-9]
        System.out.println(Pattern.matches("\\D", "bharat"));//false
        System.out.println(Pattern.matches("\\D", "bhart"));//false (becuase support  single unit)
        System.out.println(Pattern.matches("\\D*", "bharat"));//true
        System.out.println(Pattern.matches("\\D", "bharat*&(&&)(#@@!$$"));//false
        System.out.println(Pattern.matches("\\D", "0"));//false
        System.out.println(Pattern.matches("\\D", "1"));//false
        System.out.println(Pattern.matches("\\D", "4443"));//false
        System.out.println(Pattern.matches("\\D*", "4443"));//false
        System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)
        //==============================================================//
        // \s  Any whitespace character, short for [\t\n\x0B\f\r]
        System.out.println(Pattern.matches("\\s", " "));//true
        System.out.println(Pattern.matches("\\s", "bhart  "));//false
        System.out.println(Pattern.matches("\\s", "   bharat"));//false
        System.out.println(Pattern.matches("\\s", "           "));//false
        System.out.println(Pattern.matches("\\s*", "           "));//true
        //==============================================================//
        // \S  Any non-whitespace character, short for [^\s]
        System.out.println(Pattern.matches("\\S", " "));//false
        System.out.println(Pattern.matches("\\S", "bhart  "));//false
        System.out.println(Pattern.matches("\\S", "   bharat"));//false
        System.out.println(Pattern.matches("\\S", "           "));//false
        System.out.println(Pattern.matches("\\S*", "           "));//false
        System.out.println(Pattern.matches("\\S*", "bbharat"));//true
        //==============================================================//
        //\w   Any word character, short for [a-zA-Z_0-9]
        System.out.println(Pattern.matches("\\w", " "));//false
        System.out.println(Pattern.matches("\\w", "bhart  "));//false
        System.out.println(Pattern.matches("\\w", "   bharat"));//false
        System.out.println(Pattern.matches("\\w", "           "));//false
        System.out.println(Pattern.matches("\\w*", "           "));//false
        System.out.println(Pattern.matches("\\w*", "bbharat"));//true
        System.out.println(Pattern.matches("\\w*", "bbharat67"));//true
        System.out.println(Pattern.matches("\\w*", "687877"));//true
        System.out.println(Pattern.matches("\\w*", "!@#$%%^&*(())_+|}{"));//false
        //==============================================================//

        String passwordFilledValue="Bha337";
        System.out.println(Pattern.matches("[a-zA-Z_0-9]{6}", passwordFilledValue));

        System.out.println(Pattern.matches("[a-zA-Z_0-9]{6}", "bharat"));//true
        System.out.println(Pattern.matches("[a-zA-Z_0-9]{6}", "Test67"));//true
        System.out.println(Pattern.matches("[a-zA-Z_0-9]{6}", "687877"));//true
        System.out.println(Pattern.matches("[a-zA-Z_0-9]{6}", "1234567"));//false
        System.out.println(Pattern.matches("[a-zA-Z_0-9]{6}", ""));//false
        System.out.println(Pattern.matches("[a-zA-Z_0-9]{6}", "Test67989"));//false
        System.out.println(Pattern.matches("[a-zA-Z_0-9]{6}", "687877&*(*"));//false

    }

}