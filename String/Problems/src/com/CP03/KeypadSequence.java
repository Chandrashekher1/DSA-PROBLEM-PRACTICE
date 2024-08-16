package com.CP03;

//https://www.geeksforgeeks.org/problems/convert-a-sentence-into-its-equivalent-mobile-numeric-keypad-sequence0547/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

public class KeypadSequence {
    static String printSequence(String S)
    {

        StringBuilder st = new StringBuilder();
        String[] str = {"2","22","222",
                        "3","33","333",
                        "4","44","444",
                        "5","55","555",
                        "6","66","666",
                        "7","77","777","7777",
                        "8","88","888",
                        "9","99","999","9999",
                        "0"
        };

        for (int i =0; i< S.length() ;i++){
            char ch = S.charAt(i);

            if(ch == 'A'){
                st.append(str[0]);
            }
            if(ch == 'B'){
                st.append(str[1]);
            }
            if(ch == 'C'){
                st.append(str[2]);
            }
            if(ch == 'D'){
                st.append(str[3]);
            }
            if(ch == 'E'){
                st.append(str[4]);
            }
            if(ch == 'F'){
                st.append(str[5]);
            }
            if(ch == 'G'){
                st.append(str[6]);
            }
            if(ch == 'H'){
                st.append(str[8]);
            }
            if(ch == 'I'){
                st.append(str[9]);
            }
            if(ch == 'J'){
                st.append(str[10]);
            }
            if(ch == 'K'){
                st.append(str[11]);
            }


        }
        return new String(st);
    }

    public static void main(String[] args) {
        String S = "GFG";
        System.out.println(printSequence(S));
    }
}
