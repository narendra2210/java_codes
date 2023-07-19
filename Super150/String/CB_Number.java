public class CB_Number {
    public static void main(String[] args) {

        String str = "81615";
        System.out.println(PrintSubtring(str));

    }

    public static int PrintSubtring(String str) {
        int count = 0;
        boolean[] visited = new boolean[str.length()];
        for (int len = 1; len <= str.length(); len++) {
            for (int si = 0; si <= str.length() - len; si++) {
                int ei = si + len;
                String s = str.substring(si, ei);// CB Number
                // Integer.parseInt(s);// string to Integer
                // Long.parseLong(s);// String to long
                if (iscbnumber(Long.parseLong(s)) == true && isvistied(visited, si, ei - 1) == false) {
                    // visited marked
                    for (int i = si; i <= ei - 1; i++) {
                        visited[i] = true;

                    }
                    count++;
                }

            }

        }

        return count;

    }

    
}
