package VertexPractik;

public class Dog {

    private String name;
    private String poroda;
    private int age;

    {
        var v="Нестатический блок";
        System.out.println(v);
    }

    public Dog(String x, String y, int z) {
        name = x;
        poroda = y;
        age = z;
    }
}
