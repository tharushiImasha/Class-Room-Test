package lk.ijse.gdse68.classroomtest1.Boy;

import jakarta.annotation.PostConstruct;
import lk.ijse.gdse68.classroomtest1.Food;
import lk.ijse.gdse68.classroomtest1.Taste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Kashul {
    @Qualifier("Chicken")
    private final Food food;

    @Autowired
    public Kashul(Food food) {
        this.food = food;
    }

    @Taste
    @PostConstruct
    public void init(){
        food.eat();
    }
}
