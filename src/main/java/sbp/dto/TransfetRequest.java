package sbp.dto;

import java.math.BigDecimal;

public class TransfetRequest {
	private long sendAccountId;
	private long reviceAccountId;
	private BigDecimal amount;
	public long getSendAccountId() {
		return sendAccountId;
	}
	public void setSendAccountId(long sendAccountId) {
		this.sendAccountId = sendAccountId;
	}
	public long getReviceAccountId() {
		return reviceAccountId;
	}
	public void setReviceAccountId(long reviceAccountId) {
		this.reviceAccountId = reviceAccountId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	

}
