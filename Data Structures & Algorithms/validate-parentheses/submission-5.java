class Solution {
    public boolean isValid(String s) {
        
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()", "");   // remove innermost pairs one by one
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }

        return s.isEmpty();            // if nothing left, all matched
    }
}