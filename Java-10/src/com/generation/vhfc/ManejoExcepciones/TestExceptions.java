package com.generation.vhfc.ManejoExcepciones;

public class TestExceptions {

	public static void main(String[] args) {
		//crear objeto
		try {
			Division d = new Division (4,2);
			d.visualizarD();
		} catch (OpExceptions e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("continua...");
		
	}

}
