package dima.p274;

class ToLower extends Excercise11Main {
    double id;

    public ToLower(double id) {
        this.id = id;
    }

    @Override
    public String process(Object o) {
        return ((String)o).toLowerCase();
    }

    @Override
    public String toString() {
        return "ToLower{" +
                "id=" + id +
                '}';
    }
}