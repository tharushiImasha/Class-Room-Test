package lk.ijse.gdse68.classroomtest1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Chicken")
@Taste
public class ChickenRoll implements Food{

    @Override
    public void eat() {
        System.out.println("Chicken roll eat");
    }
}
