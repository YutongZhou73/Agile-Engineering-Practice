package edu.berkeley.aep;

public class Chance {
    public static final int CERTAINTY = 1;
    private final double probability;

    public Chance(double probability) {
        this.probability = probability;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof Chance)) return false;
        return Double.compare(((Chance) other).probability, this.probability) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(probability);
    }

    public Chance not() {
        return new Chance(CERTAINTY - this.probability);
    }

    public Chance and(Chance other) {
        return new Chance(this.probability * other.probability);
    }

//    public edu.berkeley.aep.Chance or(edu.berkeley.aep.Chance other) {
//        return new edu.berkeley.aep.Chance((this.probability + other.probability) - this.probability * other.probability);
//    }

    // P(A II B) = !(!P(A) && !P(B))
    public Chance or(Chance other) {
        var notThis = this.not();
        var notOther = other.not();
        return (notThis.and(notOther)).not();
    }
}
