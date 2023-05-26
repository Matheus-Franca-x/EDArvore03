package view;

import model.matheus.libArvoreChar.Arvore;

public class Main {

	public static void main(String[] args) 
	{
		
		char[] vetor = {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'};
		Arvore arvore = new Arvore();
		
		for (char i : vetor)
			arvore.insert(i);
		
		try {
			arvore.remove('F');
			arvore.remove('U');
			arvore.prefixSearch();
			System.out.println();
			arvore.infixSearch();
			System.out.println();
			arvore.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
