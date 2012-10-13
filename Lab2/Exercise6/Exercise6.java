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
        Double[] dVec = {4.0,5.3};
        System.out.println(rms(dVec));
        Rational[] rVec = {new Rational(1,2)};
        System.out.println(rms(rVec));
    }
}