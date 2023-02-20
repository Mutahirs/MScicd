package CreditCardMS;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/CreditCard")
public class CreditCardController {

    static Logger logger= LogManager.getLogger(MicroserviceApplication.class);

    @Autowired
    CreditCardService creditCardService;
    @Autowired
    private CreditCardRepository creditCardRepository;

    //Create Operation
    @PostMapping("/addCreditCard")
    public CreditCardMS addAccount(@RequestBody @Valid CreditCardMS creditCardMS)
    {

        return creditCardService.save(creditCardMS);
    }

    // Read operation
    @GetMapping("/getCreditCardsList")
    public List<CreditCardMS> getCreditCardlist() {

            logger.error("Displaying credit card list");


        return creditCardService.getCreditCardList();

    }



    @GetMapping(value = "/getCard/{id}")
    public Optional<CreditCardMS> getCreditCardDetailsById(@PathVariable int id){
        logger.fatal("Displaying credit card by id " +id);

        return creditCardService.getCreditCardById(id);

    }
    @GetMapping(value ="/getCC/{accountNumber}" )
    public CreditCardMS getCreditCardByAcc(@PathVariable("accountNumber")int accountNumber){
        logger.info("Displaying credit card by accNum " +accountNumber);
        return creditCardService.getCreditCardByacc(accountNumber);
    }


    // Delete operation
    @DeleteMapping("deleteCreditCard/{id}")
    public String deleteCreditCard(@PathVariable("id")
                                      int id)
    {
        creditCardService.deleteCreditCard(id);

        return "Delete Credit-Card Successfully";
    }
}