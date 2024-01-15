package org.example.fromLesson;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(exclude = {"biography"})
public class Author2 {
    private String firstName;
    private String lastName;
    private String biography;
}
