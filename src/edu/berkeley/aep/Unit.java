package edu.berkeley.aep;

//understand how to convert between different units
public enum Unit {
    INCH(1,0, UnitType.LENGTH),
    FOOT(12,0, UnitType.LENGTH),
    YARD(36,0,UnitType.LENGTH),
    MILE(1760*36,0,UnitType.LENGTH),
    TEASPOON(1,0,UnitType.VOLUME),
    TABLESPOON(3,0,UnitType.VOLUME),
    OZ(6,0,UnitType.VOLUME),
    CUP(48,0,UnitType.VOLUME),
    CELSIUS(9,-32,UnitType.TEMPERATURE),
    FAHRENHEIT(5,0,UnitType.TEMPERATURE)
    ;

    private final double conversionFactor;
    private final UnitType unitType;
    private final int offset;

    Unit(int conversionFactor, int offset, UnitType unitType){
        this.conversionFactor = conversionFactor;
        this.offset = offset;
        this.unitType = unitType;

    }

    public double convert(double value){
        if(this.unitType == UnitType.TEMPERATURE){
            if(this == Unit.CELSIUS){
                return (value*9)/5+32;
            }else{
                return value;
            }
        }
        return value*this.conversionFactor;
    }

    public boolean ifSameUnitType(Unit otherUnit){
        return this.unitType.equals(otherUnit.unitType);
    }

    public boolean ifUnitLength(){
        return this.unitType == unitType.LENGTH;
    }

    private enum UnitType{
        LENGTH, VOLUME, TEMPERATURE;
    }
}
