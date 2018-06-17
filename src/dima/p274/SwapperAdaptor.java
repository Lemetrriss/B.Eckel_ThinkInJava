package dima.p274;

class SwapperAdaptor implements Processor{
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public String process(Object o) {
        return CharacterSwapper.swap(o);
    }
}
