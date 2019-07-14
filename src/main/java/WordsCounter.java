public class WordsCounter {
    static String[] array = {
            "tôi thấy hoa vàng trên cỏ xanh",
            " hôm nay tôi thấy hoa vàng",
            "hoa vàng trên cỏ xanh, hoa vàng trên cỏ xanh"
    };

    public static int count(String searchText) {
        final int NOT_FOUND = 0;
        final int SEARCH_TEXT_LENGTH = searchText.length();

        int count = NOT_FOUND;

        for (int index = 0; index < array.length; index++) {
            final String currentText = array[index];
            final int STOP_INDEX = currentText.length() - SEARCH_TEXT_LENGTH + 1;

            if (currentText.length() < SEARCH_TEXT_LENGTH) {
                return NOT_FOUND;
            }
            for (int firstIndex = 0 ; firstIndex < STOP_INDEX; firstIndex++) {
                int lastIndex = firstIndex + SEARCH_TEXT_LENGTH;
                String subText = currentText.substring(firstIndex, lastIndex);
                if (searchText.equals(subText)) count++;
            }
        }

        return count;
    }
}
