package org.example.fromLesson;

import lombok.Builder;
import lombok.ToString;

//С помощью Lombok можем также создать Builder для класса, то есть использовать
//паттерн проектирования "строитель", но более просто, чем мы делали это раньше
@Builder
@ToString(exclude = {"biography"})
public class Author1 {
    private String firstName;
    private String lastName;
    private String biography;
}
