// Last updated: 9/23/2025, 11:43:15 PM
class Solution {
    public String sortVowels(String s) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u'){
                arr.add((int)s.charAt(i));
            }
        }
        Collections.sort(arr);
        String a ="";
        int b =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                int  c = arr.get(b);
                
                a+= (char) c;
                b++;
            }
            else{
                a+=s.charAt(i);
            }
        }
        return a;
    }
}