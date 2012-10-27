class Pair<T,U> {
    private T p1;
    private U p2;

    Pair() { }

    Pair(T p1, U p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return p1 + " " + p2;
    }
}