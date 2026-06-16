public class Process_String_With_Special_Operations {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '*') {
                if (sb.length() != 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } 
            else if (ch == '#') {
                sb.append(sb);
            } 
            else if (ch == '%') {
                sb.reverse();
            } 
            else if (ch >= 'a' && ch <= 'z') {
                sb.append(ch);
            }
        }
        return sb.toString();
        // Time Complexity: O(n), where n is the length of the input string. We iterate through the string once.
        // Space Complexity: O(n), where n is the length of the input string. In
    }
}
