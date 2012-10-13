class Exercise6 {
    static Number rms(Number[] numbers) {
        double mean=0;
        for(Number num : numbers) {
            mean += num.doubleValue() * num.doubleValue();
        }
        double result = Math.sqrt(mean/numbers.length);
        if(result%1==0) return (int)result;
        else return (double)result;
    }

    public static void main(String[] args) {
        Integer[] iVec = {2};
        System.out.println(rms(iVec));
        Double[] dVec = {0.5,0.25,0.123};
        System.out.println(rms(dVec));
        Rational[] rVec = {new Rational(1,2), new Rational(1,4), new Rational(1,8)};
        System.out.println(rms(rVec));
    }
}