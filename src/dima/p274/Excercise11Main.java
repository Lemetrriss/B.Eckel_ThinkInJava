package dima.p274;

abstract class Excercise11Main implements Processor{
    @Override
    public String name() {
        return "Class used is " + this;
    }

    public static void main(String[] args) {
        String str = "Hello my dear friend, my name is Dmitry!?";
        Apply.process(new ToUpper(1.0), str);
        Apply.process(new ToLower(2.0), str);
        Apply.process(new StrSplit(3.0), str);
    }
}
