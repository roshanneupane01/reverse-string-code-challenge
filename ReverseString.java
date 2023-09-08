class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("hello World"));
    }

    private static String reverseString(String word) {

        String resultString = "";
        for(int i = word.length()-1; i>=0; i--){
            resultString += word.charAt(i);
        }

        return resultString;
    }
}