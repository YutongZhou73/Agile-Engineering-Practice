package edu.berkeley.aep;

// Understands relationship between length units
public class Convertor {

    private final double value;

    public Convertor(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object other) {
        //check if same object
        if(other == this) return true;
        //check if passed in is in same type
        //instanceof returns true if pass in subclass
        if(!(other instanceof Convertor)) return false;
        return Double.compare(((Convertor) other).value,this.value) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(value);
    }

    public Convertor inchToFoot() {
        return new Convertor(this.value/12);
    }

    public Convertor footToInch() {
        return new Convertor(this.value*12);
    }

    public Convertor footToYard() {
        return new Convertor(this.value/3);
    }

    public Convertor yardToFoot() {
        return new Convertor(this.value*3);
    }

    public Convertor yardToMile() {
        return new Convertor(this.value/1760);
    }

    public Convertor mileToYard() {
        return new Convertor(this.value*1760);
    }
}
