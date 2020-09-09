package lesson1.dz03;

public class Main {

    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        for (int i = 0; i < 5; i++)
            appleBox1.addFruit(new Apple());

        for (int i = 0; i < 3; i++)
            appleBox2.addFruit(new Apple());

        for (int i = 0; i < 2; i++)
            orangeBox1.addFruit(new Orange());

        for (int i = 0; i < 5; i++)
            orangeBox2.addFruit(new Orange());

        System.out.println("Фруктов в коробках:");
        System.out.println("Коробка с яблоками 1:    " + appleBox1.getSize() + " шт.");
        System.out.println("Коробка с яблоками 2:    " + appleBox2.getSize() + " шт.");
        System.out.println("Коробка с апельсинами 1: " + orangeBox1.getSize() + " шт.");
        System.out.println("Коробка с апельсинами 2: " + orangeBox2.getSize() + " шт.\n-------------------------------------------\n");


        System.out.println("сравниваем коробку1 с яблоками (" + appleBox1.getSize() + " шт.) весом " + appleBox1.getWeight()
                + " и коробку2 с яблоками (" + appleBox2.getSize() + " шт.) весом " + appleBox2.getWeight()
                + "\nКоробки по весу равны ? - " + appleBox1.compare(appleBox2) + "\n------------------------------------------\n");

        System.out.println("сравниваем коробку1 с яблоками (" + appleBox1.getSize() + " шт.) весом " + appleBox1.getWeight()
                + " и коробку1 с апельсинами (" + orangeBox1.getSize() + " шт.) весом " + orangeBox1.getWeight()
                + "\nКоробки по весу равны ? - " + appleBox1.compare(orangeBox1) + "\n------------------------------------------\n");

        System.out.println("сравниваем коробку1 с яблоками (" + appleBox1.getSize() + " шт.) весом " + appleBox1.getWeight()
                + " и коробку2 с апельсинами (" + orangeBox2.getSize() + " шт.) весом " + orangeBox2.getWeight()
                + "\nКоробки по весу равны ? - " + appleBox1.compare(orangeBox2) + "\n------------------------------------------\n");

        System.out.println("сравниваем коробку2 с яблоками (" + appleBox2.getSize() + " шт.) весом " + appleBox2.getWeight()
                + " и коробку1 с апельсинами (" + orangeBox1.getSize() + " шт.) весом " + orangeBox1.getWeight()
                + "\nКоробки по весу равны ? - " + appleBox2.compare(orangeBox1) + "\n------------------------------------------\n");

        System.out.println("сравниваем коробку2 с яблоками (" + appleBox2.getSize() + " шт.) весом " + appleBox2.getWeight()
                + " и коробку2 с апельсинами (" + orangeBox2.getSize() + " шт.) весом " + orangeBox2.getWeight()
                + "\nКоробки по весу равны ? - " + appleBox1.compare(orangeBox2) + "\n------------------------------------------\n");

        System.out.println("пересыпаем из коробки с яблоками2 в коробку с яблоками1");
        System.out.println("пересыпаем из коробки с апельсинами1 в коробку с апельсинами2\n");

        appleBox1.transferFrom(appleBox2);
        orangeBox2.transferFrom(orangeBox1);

        System.out.println("Фруктов в коробках:");
        System.out.println("Коробка с яблоками 1:    " + appleBox1.getSize() + " шт.");
        System.out.println("Коробка с яблоками 2:    " + appleBox2.getSize() + " шт.");
        System.out.println("Коробка с апельсинами 1: " + orangeBox1.getSize() + " шт.");
        System.out.println("Коробка с апельсинами 2: " + orangeBox2.getSize() + " шт.\n-------------------------------------------\n");
    }
}
