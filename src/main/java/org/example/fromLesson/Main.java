package org.example.fromLesson;

public class Main {
    public static void main(String[] args) {
        Author1 author = Author1.builder()
                .firstName("Stephen")
                .lastName("King")
                .biography("An American author of horror")
                .build();
        System.out.println(author);
    }
}