class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> firstMap = new HashMap<>();
        if (s.length() != t.length())
            return false;
        for (char ch : s.toCharArray()) {
            firstMap.put(ch, firstMap.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            int count = firstMap.getOrDefault(ch, 0);
            if (count == 0)
                return false;

            firstMap.put(ch, count - 1);
        }

        return true;
    }
}
