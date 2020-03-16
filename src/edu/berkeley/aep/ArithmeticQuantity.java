package edu.berkeley.aep;

//Understand an amount in a given unit / measurement type
public class ArithmeticQuantity extends ScaledQuantity {

    public ArithmeticQuantity(double value, Unit unit){
        super(value, unit);
    }

    public ArithmeticQuantity add(ArithmeticQuantity otherArithmeticQuantity) throws IllegalArgumentException {
        //same unit type
        if(this.unit.ifSameUnitType(otherArithmeticQuantity.unit)){
            double sum = this.unit.convert(this.value)+ otherArithmeticQuantity.unit.convert(otherArithmeticQuantity.value);
            Unit baseUnit;
            if(this.unit.ifUnitLength())
                baseUnit = Unit.INCH;
            else
                baseUnit = Unit.TEASPOON;

            return new ArithmeticQuantity(sum,baseUnit);
        }else{
            //throw exceptions
            throw new IllegalArgumentException("Unit Type Unmatched!");
        }

    }
}
