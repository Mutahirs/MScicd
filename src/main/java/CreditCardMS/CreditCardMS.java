package CreditCardMS;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@Entity
@Table(name="creditcardms")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class CreditCardMS {
    @Id
    int id;
    @Column(name = "account_number")
    int accountNumber;

    @Column(name = "customer_id")
    String customerId;
    @Column(name = "card_Number")
    long cardNumber;
    String validity;

    int cvv;

    @Column(name = "card_holder_name")
    String cardHolderName;
    String status;
}
