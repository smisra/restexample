package com.investorinc.springboot.springboot.models.errorsandexceptions;

public class InvestorNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public InvestorNotFoundException(String exception)
	{
		super(exception);
	}
}
