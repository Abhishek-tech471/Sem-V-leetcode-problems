// Last updated: 9/15/2025, 11:22:47 PM
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int c=0;
        HashSet<Character> myHashSet = new HashSet<>();
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)==' '){
                c++;
                for(int j=0; j<brokenLetters.length();j++){
                    if(myHashSet.contains(brokenLetters.charAt(j))){
                        c--;
                        break;
                    }
                }

                myHashSet.clear();

            }
            else{
                myHashSet.add(text.charAt(i));
            }
        }
        c++;
        for(int j=0; j<brokenLetters.length();j++){
            if(myHashSet.contains(brokenLetters.charAt(j))){
                c--;
                break;
            }
                }
        return c;
    }
}