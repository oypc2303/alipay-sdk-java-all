package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WaybillInvoiceIstd;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.invoice.istdwaybill.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-20 11:38:59
 */
public class AlipayCommerceLogisticsInvoiceIstdwaybillCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8315119884299684432L;

	/** 
	 * 开票金额
	 */
	@ApiField("invoice_fee")
	private String invoiceFee;

	/** 
	 * 开票的整体结果，0：处理中 1：已开票  2：开票失败
	 */
	@ApiField("status")
	private Long status;

	/** 
	 * 即时配送运单列表
	 */
	@ApiListField("waybill_invoices")
	@ApiField("waybill_invoice_istd")
	private List<WaybillInvoiceIstd> waybillInvoices;

	public void setInvoiceFee(String invoiceFee) {
		this.invoiceFee = invoiceFee;
	}
	public String getInvoiceFee( ) {
		return this.invoiceFee;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

	public void setWaybillInvoices(List<WaybillInvoiceIstd> waybillInvoices) {
		this.waybillInvoices = waybillInvoices;
	}
	public List<WaybillInvoiceIstd> getWaybillInvoices( ) {
		return this.waybillInvoices;
	}

}
