class AddComplexNumbers {
    double real;
    double image;

    AddComplexNumbers(double real, double image) {
        this.real = real;
        this.image = image;
    }

    void addition(AddComplexNumbers c1) {
        System.out.println("Resulting Complex number : " + (real + c1.real) + "+" + (image + c1.image) + "i");
    }
}

public class Complexmodify {
    public static void main(String[] str) {

        AddComplexNumbers c1 = new AddComplexNumbers(4, 1);
        AddComplexNumbers c2 = new AddComplexNumbers(5, 1);

        c2.addition(c1);

    }
}