package edu.berkeley.aep;

public class Reverse {
    private final String inputString;

    public Reverse(String s) {
        this.inputString = s;
    }

    public String reverseHelper(String inputStr) {
        if (inputStr.length() <= 1) {
            return inputStr;
        } else {
            return reverseHelper(inputStr.substring(1)) + inputStr.charAt(0);
        }
    }

    public Reverse reverse() {
        return new Reverse(reverseHelper(this.inputString));
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof Reverse)) return false;
        return inputString.equals(((Reverse) other).inputString);
    }

    @Override
    public int hashCode() {
        return inputString.hashCode();
    }
}
