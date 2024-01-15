package org.example.fromLesson;

import lombok.*;

//@Getter
//@Setter
//можно создать конструктор без аргументов с помощью аннотации @NoArgsConstructor и также
//указать модификатор доступа
//@NoArgsConstructor(access = AccessLevel.PRIVATE)

//чтобы создать конструктор со всеми полями в качестве аргументов, нужно пометить класс
//аннотацией @AllArgsConstructor

//В случае, если необходимо иметь не все поля в конструкторе, можно использовать
//аннотацию @RequiredArgsConstructor
//Поля, которые нужно включить в конструкторы, должны иметь модификатор final или аннотацию
//@NonNull
//@AllArgsConstructor
@RequiredArgsConstructor
public class Author {
    //можно указать Getter/Setter только для конкретного поля и даже изменить модификатор доступа
//    @Setter(AccessLevel.PROTECTED)
    @NonNull
    private String firstName;
    private final String lastName;
    private String biography;

}
