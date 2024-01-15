package org.example.Zadacha_28_6_1;

import lombok.*;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode(exclude = {"sum", "itemCount"})
public class Order {
    @NonNull
    private String innerNumber;
    @NonNull
    private String salesNumber;
    private Double sum;
    private Integer itemCount;


}
