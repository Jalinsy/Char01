public class Char01 {
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = '\t';
		char c3 = '贾';
		char c4 = 97;//说明: 值符类型可以直接存放一个数字
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);//当输出c4的时候，回输出97表示的字符（涉及到编码的概念）
	}
}