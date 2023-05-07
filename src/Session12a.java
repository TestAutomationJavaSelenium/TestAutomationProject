import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

// string provide methods which used for data comparing
// sequence of character array
//immutable
public class Session12a {


    public static void main(String[] args) {
        Session12a session12a = new Session12a();
        session12a.stringDeclaration();

    }

    public void stringDeclaration() {
        String str = "gaurav chauhan";  //string literal
        System.out.println(str);

        String str1 = new String("gaurav1"); // creating memory first
        System.out.println(str1);

        String str2 = str;
        System.out.println(str2);

        String str3 = "gaurav chauhan";

        String str4 = "Gaurav chauhan";

        boolean flag = false;

        flag = str.equals(str1);
        System.out.println(flag);

        flag = str.equals(str2);  // .equal reference to value
        System.out.println(flag);

        flag = str.equals(str3);
        System.out.println(flag);

        flag = str.equals(str4);
        System.out.println(flag);

        flag = str.equalsIgnoreCase(str4);
        System.out.println(flag);

        // compare reference of String  objects with == operator
        flag = (str == str1);
        System.out.println(" == " + flag);  // == reference address

        flag = (str == str2);
        System.out.println(" == " + flag);

        flag = (str == str3);
        System.out.println(" == " + flag);

        // String methods
        System.out.println(str.compareTo(str1));

        System.out.println("b".compareTo("a"));

        System.out.println("b".concat("at"));
        System.out.println("b" + "at");
        System.out.println("gaurav".substring(2, 4));

        /// string initialising using character Array

        char[] ch = {'g', 'a', 'y', 'i'};
        String str5 = new String(ch);
        System.out.println(str5);

        //
        String str7 = "  gaurav @cha   uhan  ";
        System.out.println(str7.length());
        System.out.println("split " + str7.split("@", 1));
        System.out.println(str7.trim().replace("a", "T"));
        System.out.println(str7.trim().replaceAll("\\s", ""));


//        String str8 = "Mahinder Singh Dhoni";
//        System.out.println(str8.indexOf(" "));
//        System.out.println(str8.lastIndexOf(" "));
//        System.out.println(str8.substring(str8.indexOf(" ") + 1, str8.lastIndexOf(" ")));

        String name = "Mahinder Singh Dhoni";
        String nameSubString = new String();
        for (int i = 0; i <= name.length(); i++) {

            if ((name.charAt(i)) == ' ') {
                nameSubString = name.substring(i + 1, name.length());
                break;
            }
        }
        for (int j = 0; j <= nameSubString.length(); j++) {
            if (nameSubString.charAt(j) == ' ') {
                nameSubString = nameSubString.substring(0, j);
                break;
            }
        }
        System.out.println(nameSubString);


        System.out.println("optimise code testing");
        String name1 = "Manish singh dhoni ";

        for (int i = 0; i < name1.length(); i++) {

            if ((name1.charAt(i)) == (' ')) {
                String newName = name1.substring(i + 1, name1.length());
                System.out.println("");
                for (int j = 0; j < newName.length(); j++) {
                    System.out.print(newName.charAt(j));
                    if ((newName.charAt(j)) == (' ')) {
                        break;
                    }

                }
                break;
            }
        }

        String str9 = "gaurav@chauhan@singh";
        //System.out.println(str9.length());
        String[] str10=str9.split("@");  //String[] str10=str9.split("@",1))
        for(String i:str10){
            System.out.println(i);
        }

          // String str9 = "100$00$12";
//        //System.out.println(str9.length());
//        String[] str10=str9.split("[$]");  //String[] str10=str9.split("@",1))
//        for(String i:str10){
//            System.out.println(i);
        }


//        String str11="Gaurav and manisha are student of Bharat classes";
           String str12=" ";
//        System.out.println(str11.startsWith("g"));
//        System.out.println(str11.endsWith("e"));
//        System.out.println(str11.toUpperCase());
//        System.out.println(str11.toLowerCase());
//        System.out.println(str11.contains("manisha")); // case-sensitive
//        System.out.println(str12.isEmpty());
//        System.out.println(str12.isBlank());
//        int a=10;
//        String str13=String.valueOf(a);
//        System.out.println(str13);
//
//        boolean fla=true;
//        String str14=String.valueOf(fla);
//        System.out.println(str14);
//
//        String str15="india";
//        char[] char1=str15.toCharArray();
//        for(char i:char1){
//            System.out.println(i);
//        }
//        for(int i=char1.length-1;i>=0;i--){  // string reverse
//            System.out.println(char1[i]);
//        }






    }


