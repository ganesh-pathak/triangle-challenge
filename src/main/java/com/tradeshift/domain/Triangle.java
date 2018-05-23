package com.tradeshift.domain;

import static com.tradeshift.domain.TriangleType.*;

public class Triangle {

    private final double firstSide;
    private final double secondSide;
    private final double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        validate(firstSide, secondSide, thirdSide);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    private void validate(double firstSide, double secondSide, double thirdSide) {
        boolean isValid = ((firstSide + secondSide) > thirdSide) && ((secondSide + thirdSide) > firstSide) && ((firstSide + thirdSide) > secondSide);
        if (!isValid) {
            throw new IllegalArgumentException("Invalid inputs to form triangle.");
        }
    }

    public TriangleType getType() {
        if ((firstSide == secondSide) && (secondSide == thirdSide)) {
            return EQUILATERAL;
        } else if ((firstSide == secondSide) || (secondSide == thirdSide) || (firstSide == thirdSide)) {
            return ISOSCELES;
        }
        return SCALENE;
    }
}
