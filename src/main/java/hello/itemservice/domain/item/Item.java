package hello.itemservice.domain.item;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
public class Item {

    private Long id;

    // @NotNull(groups = UpdateCheck.class)        // 수정 요구사항 추가
    private String itemName;

    // @NotNull(groups = {SaveCheck.class, UpdateCheck.class})
    // @Range(max=100000, min=100, groups = {SaveCheck.class, UpdateCheck.class})
    private Integer price;

    // @NotNull(groups = {SaveCheck.class, UpdateCheck.class})
    // @Max(value = 9999, groups = {SaveCheck.class})
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}