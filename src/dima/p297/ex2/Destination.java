package dima.p297.ex2;

class Destination {

    Dest getDest(Boolean b) {
        Dest dest = null;
        if (b) {
            class PDest implements Dest {
                private String str;

                private PDest(String str) {
                    this.str = str;
                }

                public String getStr() {
                    return str;
                }
            }
            dest = new PDest("Nikolaev");

        }
        return dest;
    }
}