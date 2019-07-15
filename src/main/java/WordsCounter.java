public class WordsCounter {
    static String[] array = {
            "tôi thấy hoa vàng trên cỏ xanh",
            " hôm nay tôi thấy hoa vàng",
            "hoa vàng trên cỏ xanh, hoa vàng trên cỏ xanh"
    };
    static final int NOT_FOUND = 0;

    public static int count(String searchText) {
        int countSum = NOT_FOUND;

        for (int index = 0; index < array.length; index++) {
            countSum += countMatch(searchText, array[index]);
        }

        return countSum;
    }

    public static int countMatch(String inputText, String sourceText) {
        String searchText = wordTrim(inputText);
        final int SEARCH_TEXT_LENGTH = searchText.length();
        final int STOP_INDEX = sourceText.length() - SEARCH_TEXT_LENGTH + 1;

        if (sourceText.length() < SEARCH_TEXT_LENGTH) {
            return NOT_FOUND;
        }

        int count = NOT_FOUND;
        for (int firstIndex = 0 ; firstIndex < STOP_INDEX; firstIndex++) {
            int lastIndex = firstIndex + SEARCH_TEXT_LENGTH;
            String subText = sourceText.substring(firstIndex, lastIndex);
            if (searchText.equals(subText)) count++;
        }
        return count;
    }

    public static String wordTrim(String word) {
        word = word.trim();
        String newWord = "";
        int spaceChar = 0;
        for (int i = 0 ; i < word.length(); i++) {
            if (word.charAt(i) == ' ' && spaceChar < 1) {
                newWord += word.charAt(i);
                spaceChar++;
            } else if (word.charAt(i) != ' ') {
                newWord += word.charAt(i);
            }
        }
        return newWord;
    }
}
