package lk.ijse.gdse68.classroomtest1;

import org.springframework.stereotype.Component;

@Component
public class FishBun implements Food{
    @Override
    public void eat() {
        System.out.println("Fish Bun");
    }
}
