package lesson7;

import javax.xml.namespace.QName;

public class Cat {

    private String name;
    private boolean hungry;
    private int appetite;

    public Cat(String name) {
        appetite = (int) (1 + Math.random() * 50);
        hungry = true;
        this.name = name;
    }

    public void eat(Plate plate) {
        if (hungry) {
            if (plate.getFood() >= appetite) {
                hungry = false;
                plate.consumeFood(appetite);
                System.out.println("Кот " + name + " съел " + appetite + " " + " единиц еды, теперь он сыт !");
            } else {
                System.out.println("Я не наелся! Еды мало !");
                System.out.println("Хозяин, добавь ещё еды !");
            }
        } else {
            System.out.println("Не кории меня, я уже сыт");
        }


    }
}
