package edu.berkeley.aep;

public class ScaledQuantity {
    protected final double value;
    protected final Unit unit;

    public ScaledQuantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        //check if same object
        if(other == this) return true;
        //check if passed in is in same type
        //instanceof returns true if pass in subclass
        if(!(other instanceof ArithmeticQuantity)) return false;

        // this is important part! no if/else parts
        ArithmeticQuantity otherArithmeticQuantity = (ArithmeticQuantity) other;
        return this.unit.convert(this.value) == otherArithmeticQuantity.unit.convert(otherArithmeticQuantity.value);
    }

    @Override
    public int hashCode() {
        return Double.hashCode(value);
    }
}
