package hello;

public class StringUtilMain {

	public static void main(String[] args) {
		StringUtil stringUtil = new  StringUtil();
		
		String texte = "bonjour le monde";
		
		// compte le nombre de caract�res autres que espace
		System.out.println(stringUtil.countCharacters(texte)); // 14
		
		/*// compte le nombre de mots (les mots sont s�par�s par des espaces)
		stringUtil.countWords(texte); // 3
		
		// retourne true si palindrome, false sinon
		stringUtil.isPalindrome(texte); // false
		stringUtil.isPalindrome("radar"); // true
		
		// retourne true si anagramme, false sinon
		stringUtil.isAnagramme("romain", "manoir"); // true
		// v2 avec des phrases s�par�es par des espace
		stringUtil.isAnagramme("Pablo Picasso", "Pascal Obispo"); // true
		
*/
	}

}
