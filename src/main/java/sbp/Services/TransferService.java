package sbp.Services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sbp.model.Account;
import sbp.repositorys.AccountRepository;

@Service
public class TransferService {
 
  private final AccountRepository accountRepository;
 
  public TransferService(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }
 

  @Transactional                                     
  public void transferMoney(long idSender, 
                            long idReceiver, 
                            BigDecimal amount) {
    Account sender =                                 
      accountRepository.findAccountById(idSender);   
    Account receiver =                               
      accountRepository.findAccountById(idReceiver); 
 
    BigDecimal senderNewAmount =                     
      sender.getAmount().subtract(amount);           
    BigDecimal receiverNewAmount =                   
      receiver.getAmount().add(amount);              

    accountRepository                                
    .changeAmount(idSender, senderNewAmount);       

   accountRepository                                
    .changeAmount(idReceiver, receiverNewAmount);   
   
  // throw new RuntimeException("Oh no! something went wrong!");
   
 }

	public List<Account> getAllAmounts(){
	    return accountRepository.findAllAccounts();

	
}
	



}

