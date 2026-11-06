class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String strTemp = String.valueOf(ch);
            res.computeIfAbsent(strTemp, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(res.values());
    }
}
