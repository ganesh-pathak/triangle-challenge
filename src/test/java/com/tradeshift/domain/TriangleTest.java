package com.tradeshift.domain;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class TriangleTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void shouldTestEquilateralTriangleWhenAllSidesAreSame() {
        // given
        Triangle triangle = new Triangle(7, 7, 7);
        // when
        TriangleType type = triangle.getType();
        // then
        assertThat(type).isEqualTo(TriangleType.EQUILATERAL);
    }

    @Test
    public void shouldThrowErrorMessageWhenAllSidesAreZero() {
        // then
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage(is("Invalid inputs to form triangle."));
        // when
        Triangle triangle = new Triangle(0, 0, 0);
    }

    @Test
    public void shouldThrowErrorMessageWhenAllSidesAreLessThanZero() {
        // then
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage(is("Invalid inputs to form triangle."));
        // when
        Triangle triangle = new Triangle(-3, -5, -9);
    }

    @Test
    public void shouldTestIsoscelesTriangleWhenFirstTwoSidesAreSame() {
        // given
        Triangle triangle = new Triangle(3, 3, 5);
        // when
        TriangleType type = triangle.getType();
        // then
        assertThat(type).isEqualTo(TriangleType.ISOSCELES);
    }

    @Test
    public void shouldTestIsoscelesTriangleWhenLastTwoSidesAreSame() {
        // given
        Triangle triangle = new Triangle(5, 3, 3);
        // when
        TriangleType type = triangle.getType();
        // then
        assertThat(type).isEqualTo(TriangleType.ISOSCELES);
    }

    @Test
    public void shouldTestScaleneTriangleWhenAllSidesAreDifferent() {
        // given
        Triangle triangle = new Triangle(3, 4, 5);
        // when
        TriangleType type = triangle.getType();
        // then
        assertThat(type).isEqualTo(TriangleType.SCALENE);
    }

    @Test
    public void shouldThrowErrorMessageWhenSumOfFirstTwoSidesIsNotGreaterThanThird() {
        // then
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage(is("Invalid inputs to form triangle."));
        // when
        Triangle triangle = new Triangle(2, 3, 6);
    }

    @Test
    public void shouldThrowErrorMessageWhenSumOfSecondAndThirdIsNotGreaterThanFirst() {
        // then
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage(is("Invalid inputs to form triangle."));
        // when
        Triangle triangle = new Triangle(10, 5, 2);
    }

    @Test
    public void shouldThrowErrorMessageWhenSumOfFirstAndThirdIsNotGreaterThanSecond() {
        // then
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage(is("Invalid inputs to form triangle."));
        // when
        Triangle triangle = new Triangle(1, 4, 3);
    }

}