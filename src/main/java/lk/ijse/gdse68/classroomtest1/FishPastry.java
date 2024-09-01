package lk.ijse.gdse68.classroomtest1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FishPastry implements Food{
    @Override
    public void eat() {
        System.out.println("Fish pastry");
    }
}
