//leetcode 49

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        char arr[][] = new char[strs.length][];

        for(int i = 0; i < strs.length; i++) {

            arr[i] = strs[i].toCharArray();

            Arrays.sort(arr[i]);
        }

        List<List<String>> rstr = new ArrayList<>();

        for(int i = 0; i < strs.length; i++) {

            if(arr[i] == null) continue;

            char temp[] = arr[i];

            List<String> larr = new ArrayList<>();

            for(int j = i; j < strs.length; j++) {

                if(arr[j] == null) continue;

                if(Arrays.equals(temp, arr[j])) {

                    larr.add(strs[j]);

                    arr[j] = null;
                }
            }

            rstr.add(larr);
        }

        return rstr;
    }
}
