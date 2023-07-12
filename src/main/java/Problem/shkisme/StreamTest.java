package Problem.shkisme;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {

  public static void main(String[] args) {
    List<Dish> menu = new ArrayList<>();

    menu.add(new Dish("A", 600));
    menu.add(new Dish("B", 700));
    menu.add(new Dish("C", 800));
    menu.add(new Dish("D", 100));

    menu.stream()
        .filter(dish -> {
          System.out.println("dish.getCalories() = " + dish.getCalories());
          return dish.getCalories() > 300;
        })
        .limit(3)
        .map(dish -> {
          System.out.println("dish.getName() = " + dish.getName());
          return dish.getName();
        })
        .toList();
  }
}
