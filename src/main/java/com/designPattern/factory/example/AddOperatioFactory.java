package com.designPattern.factory.example;

public class AddOperatioFactory implements OperationFactory {

	@Override
	public Operation getOperation() {
		return new AddOperation();
	}

}
