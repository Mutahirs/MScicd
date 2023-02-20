package CreditCardMS;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CreditCardService {

     CreditCardMS save(CreditCardMS creditCardMS);

    List<CreditCardMS> getCreditCardList();

    //CreditCardMS updateAccount(CreditCardMS creditCardMS, int id);

    void deleteCreditCard(int id);

    Optional<CreditCardMS> getCreditCardById(int id);
    CreditCardMS getCreditCardByacc(int accountNumber);


}

