package MyShop.Mujinjang.domain.item;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "item")
@Getter
@Setter
@ToString
public class ItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_id")
    private Long id; //상품아이디

    @Column( name = "item_nm",nullable = false, length = 100)
    private String itemName; //상품이름

    @Column(name = "price", nullable = false)
    private int price; //가격

    @Column(nullable = false)
    private int stock; //재고량

    @Lob
    @Column(nullable = false)
    private String itemCategory; //상품 카테고리(ex. 하의, 상의, 외투, 모자, 신발)

    @Enumerated(EnumType.STRING)
    private ItemSellStatus itemSellStatus; //상품판매상태

    private LocalDateTime registrationTime; //등록시간
    private LocalDateTime upTime; //수정시간
}
