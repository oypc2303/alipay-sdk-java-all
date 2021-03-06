package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.LargeInfiniteCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.service.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-07 19:52:33
 */
public class AlipayTradeServiceAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4875312618135197244L;

	/** 
	 * 无限付产品账户卡信息
	 */
	@ApiField("large_infinite_card_info")
	private LargeInfiniteCardInfo largeInfiniteCardInfo;

	public void setLargeInfiniteCardInfo(LargeInfiniteCardInfo largeInfiniteCardInfo) {
		this.largeInfiniteCardInfo = largeInfiniteCardInfo;
	}
	public LargeInfiniteCardInfo getLargeInfiniteCardInfo( ) {
		return this.largeInfiniteCardInfo;
	}

}
