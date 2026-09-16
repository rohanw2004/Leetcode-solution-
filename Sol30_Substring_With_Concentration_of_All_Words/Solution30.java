import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int n = s.length();
        int wordLen = words[0].length();
        int sentenceDesireLen = wordLen * words.length;

        List<Integer> list = new ArrayList<>();
        HashMap<String, int[]> map = new HashMap<>();

        for (String word : words) {
            map.putIfAbsent(word, new int[] {0, 0});
            map.get(word)[0]++;
        }

        for (int i = 0; i < wordLen; i++) {
            int left = i, right = i;

            while (right <= n - wordLen &&
                   left <= n - sentenceDesireLen) {

                String word = s.substring(right, right + wordLen);

                if (map.containsKey(word)) {
                    int[] freq = map.get(word);

                    while (freq[0] == freq[1]) {
                        String prevWord =
                            s.substring(left, left + wordLen);

                        map.get(prevWord)[1]--;
                        left += wordLen;
                    }

                    freq[1]++;
                } else {
                    while (left != right) {
                        String prevWord =
                            s.substring(left, left + wordLen);

                        map.get(prevWord)[1]--;
                        left += wordLen;
                    }

                    left += wordLen;
                }

                right += wordLen;

                if (right - left == sentenceDesireLen) {
                    list.add(left);
                }
            }

            while (left != right) {
                String prevWord =
                    s.substring(left, left + wordLen);

                map.get(prevWord)[1]--;
                left += wordLen;
            }
        }

        Collections.sort(list);
        return list;
    }


    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println("Example 1:");
        String s1 = "barfoothefoobarman";
        String[] words1 = {"foo", "bar"};

        System.out.println("Input: " + s1 +
                           " " + Arrays.toString(words1));
        System.out.println("Output: " +
                           solution.findSubstring(s1, words1));


        System.out.println("\nExample 2:");
        String s2 = "wordgoodgoodgoodbestword";
        String[] words2 = {"word", "good", "best", "word"};

        System.out.println("Input: " + s2 +
                           " " + Arrays.toString(words2));
        System.out.println("Output: " +
                           solution.findSubstring(s2, words2));


        System.out.println("\nExample 3:");
        String s3 = "barfoofoobarthefoobarman";
        String[] words3 = {"bar", "foo", "the"};

        System.out.println("Input: " + s3 +
                           " " + Arrays.toString(words3));
        System.out.println("Output: " +
                           solution.findSubstring(s3, words3));
    }
}