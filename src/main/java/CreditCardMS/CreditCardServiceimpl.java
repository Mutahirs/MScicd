package CreditCardMS;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CreditCardServiceimpl implements CreditCardService {
    CreditCardMS creditCardMS=new CreditCardMS();
    List<CreditCardMS> acc ;
    static Logger logger= LogManager.getLogger(MicroserviceApplication.class);

    @Autowired
    private CreditCardRepository creditCardRepository;

    @Override
    public CreditCardMS save(CreditCardMS creditCardMS) {

        return creditCardRepository.save(creditCardMS);
    }

    @Override
    public List<CreditCardMS> getCreditCardList() {

        return creditCardRepository.findAll();
    }

    public Optional<CreditCardMS> getCreditCardById(int id){
        return creditCardRepository.findById(id);

    }

    @Override
    public CreditCardMS getCreditCardByacc(int accountNumber) {

        for (CreditCardMS cardMS : creditCardRepository.findAll()) {
        if(cardMS.getAccountNumber()==accountNumber){
           return cardMS;
          }
        }
        return null;
    }


    @Override
    public void deleteCreditCard(int id) {
        creditCardRepository.deleteById(id);
    }
    }

