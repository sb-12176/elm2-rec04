public class Recitation4 {

    /**
     * Returns a string generated from word by duplicating
     * each letter in the string based on the character's position. Digits
     * are duplicated by the value of their digit. Any other character
     * considered non-alphanumeric will result in all characters being
     * appended to the result, up to but not including the non-alphanumeric
     * character.
     *
     * @param word a string that is to be exploded
     * @return a string generated from word by duplicating
     *        each letter in the string based on the character's position. Digits
     *        are duplicated by the value of their digit. Any other character
     *        considered non-alphanumeric will result in all characters being
     *        appended to the result, up to but not including the non-alphanumeric
     *        character
     */
    public static String explode(String word){
        StringBuilder sb = new StringBuilder();
        //Boolean isLetter = false;
        //Boolean isDigit = false;
        int count = 0;
        int wordLength = word.length();
        //int index = 0;

        for (int index = 0; index < wordLength; index++){
            char ch = word.charAt(index);
            ////Set the boolean variables//
            /*if (Character.isLetter(ch)){
                isLetter = true;
            }
            else if (Character.isDigit(ch)){
                isDigit = true;
            }
             */
            ////Do the appending///////////
            if (Character.isDigit(ch)){
                for (int count2 = 0; count2 < Character.getNumericValue(ch); count2+=1){
                //while (count2 < (int)ch){
                    sb.append(ch);
                }
            }
            else if (Character.isLetter(ch)){
                for (int count3 = 0; count3 <= word.indexOf(ch); count3++){
                    sb.append(ch);
                }
            }
            else {
                for (int count4 = 0; count4 < word.indexOf(ch); count4++){
                    sb.append(word.charAt(count4));
                }
            }

        }

        return sb.toString();
    }
}
/*
1. Assume we have a variable called count
2. Assume we have a variable called word
3. Assume we have a variable called sb
4. Start with the first character
5. If the character is a digit, then
    duplicate the character based on its value.
6. Else if the character is an alphabet(letter), then
    duplicate the character based on its index(position in the string word)
7. Else (character is not a letter AND character is not a digit) then
    append the string word up to but not including the character
8. If there is a character, go to 4.
9. Done
*/
