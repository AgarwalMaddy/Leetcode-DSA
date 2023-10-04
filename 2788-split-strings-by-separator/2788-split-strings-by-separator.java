class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        String separate = "\\" + separator;
        ArrayList<String> result = new ArrayList<>();
        for(String s : words){
            String[] temp = s.split(separate);
            for(String i : temp){
                if(i.length() != 0){
                    result.add(i);
                }
            }
        }

        return result;
    }
}