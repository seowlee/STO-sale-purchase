package com.sto.sale.backstosale.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionDto {
	private Long transactionId;
	private Long goodsId;
	private Long userId;
	private Integer transactionCnt;
	private Integer transactionStat;
	private Date transactionDt;

	public void cancle_transaction(CancellationSaleDto cancellationSaleDto) {
		this.transactionId = cancellationSaleDto.getGoodsId() + 100000;
		this.transactionStat = 1;
		this.transactionDt = new Date();
	}
}
