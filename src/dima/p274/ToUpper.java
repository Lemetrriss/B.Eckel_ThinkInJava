package dima.p274;

class ToUpper extends Excercise11Main {

    double id;

    public ToUpper(double id) {
        this.id = id;
    }

    @Override
    public String process(Object o) {
        return ((String)o).toUpperCase();
    }

    @Override
    public String toString() {
        return "ToUpper{" +
                "id=" + id +
                '}';
    }
}
