package lesson_10.task3;

import java.util.Objects;

public class Fraction implements IFraction {

    public Fraction(int numerator, int denomerator) {
        if(denomerator == 0){
            System.out.println("Знаменатель не может быть равен 0. Тогда знаменатель будет равен 1");
            this.numerator = numerator;
            this.denomerator = 1;
            return;
        }
        this.numerator = numerator;
        this.denomerator = denomerator;
    }

    private int numerator;
    private int denomerator;

    @Override
    public void setNumerator(int value) {
        this.numerator = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return getNumerator() == fraction.getNumerator() && getDenomerator() == fraction.getDenomerator();
    }

    @Override
    public String toString() {
        return String.format("Простая дробь с числителем %d и знаменателем %d",
                numerator, denomerator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumerator(), getDenomerator());
    }

    @Override
    public int getNumerator() {
        return numerator;
    }

    @Override
    public void setDenomerator(int value) {
        this.denomerator = value;
    }

    @Override
    public int getDenomerator() {
        return denomerator;
    }
}
