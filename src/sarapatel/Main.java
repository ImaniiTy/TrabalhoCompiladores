package sarapatel;

import sarapatel.parser.*;
import sarapatel.lexer.*;
import sarapatel.node.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			String arquivo = "teste/parte2.projeto.srptl";

			Lexer lexer = new Lexer(
					new PushbackReader(
							new FileReader(arquivo), 1024));

			Parser p = new Parser(lexer);

			Start tree = p.parse();
			// Imprime árvore na saída padrão
			// tree.apply(new ASTPrinter());
			// Imprime árvore em interface gráfica
			tree.apply(new ASTDisplay());
			// Token token;
			// while(!((token = lexer.next()) instanceof EOF)) {
			// System.out.println(token.getClass());
			// System.out.println(" ( "+token.toString()+")");
			// }
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}