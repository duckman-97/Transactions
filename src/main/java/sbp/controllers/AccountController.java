package sbp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sbp.Services.TransferService;
import sbp.dto.TransfetRequest;
import sbp.model.Account;

@RestController
public class AccountController{
	
	
	private final TransferService  transferService;
	
	
	public AccountController(
			TransferService  transferService
			) {
		this.transferService = transferService;
		
	}
	
	@PostMapping("/transfer")
	public void transferMoney(
			@RequestBody TransfetRequest request
			) {
		
		transferService.transferMoney(
				request.getSendAccountId(), 
				request.getReviceAccountId(),
				request.getAmount() );
	}
	
	@GetMapping("/accounts")
	
	public List<Account> getAllAccounts(){
		return transferService.getAllAmounts();
	}
	
	

}
