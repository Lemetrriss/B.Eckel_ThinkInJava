package dima.p274;

class CharacterSwapper {

    static String swap (Object o) {
        char[] c = ((String)o).toCharArray();
        if(c.length%2 == 0) {
            for (int i = 0; i < c.length; i += 2) {
                char a = c[i];
                c[i] = c[i+1];
                c[i+1] = a;
            }
        } else {
            for (int i = 0; i < c.length-1; i+=2) {
                char a = c[i];
                c[i] = c[i+1];
                c[i+1] = a;
            }
        }
        return new String(c);
    }
}
