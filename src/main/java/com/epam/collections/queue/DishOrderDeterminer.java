package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> order = new ArrayList<>();
        List<Integer> dishes = new ArrayList<>();
        int i = 1;
        while(i <= numberOfDishes){
            dishes.add(i);
            i++;
        }
        int num = -1;
        while(order.size() != dishes.size()){
            int count =0;
            while(count<everyDishNumberToEat) {
                num++;
                if(num>dishes.size()-1){
                    num = num -dishes.size();
                }
                if (!order.contains(dishes.get(num))) {
                    count++;
                }
            }
            order.add(dishes.get(num));
        }
        return order;
    }
}
