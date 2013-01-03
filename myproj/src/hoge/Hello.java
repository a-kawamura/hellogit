package hoge;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;



/**
 * @author NEC-PCuser
 * TODO コメント書く
 */
public class Hello {
 // FIXME pending
	/**
	 * @
	 */
	
	
	String str;


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new String().toString();
		
		try {
			String str = new String(Messages.getString("Hello.0")); //$NON-NLS-1$

			Iterable<String> a = new ArrayList<>();

			System.out.println(str);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}
	
	
	/**
	 * @
	 * @return
	 */
	public int length() {
		return str.length();
	}

	/**
	 * @return
	 */
	public boolean isEmpty() {
		return str.isEmpty();
	}

	public char charAt(int index) {
		return str.charAt(index);
	}

	public int codePointAt(int index) {
		return str.codePointAt(index);
	}

	public int codePointBefore(int index) {
		return str.codePointBefore(index);
	}

	public int codePointCount(int beginIndex, int endIndex) {
		return str.codePointCount(beginIndex, endIndex);
	}

	public int offsetByCodePoints(int index, int codePointOffset) {
		return str.offsetByCodePoints(index, codePointOffset);
	}

	public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
		str.getChars(srcBegin, srcEnd, dst, dstBegin);
	}

	public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
		str.getBytes(srcBegin, srcEnd, dst, dstBegin);
	}

	public byte[] getBytes(String charsetName)
			throws UnsupportedEncodingException {
		return str.getBytes(charsetName);
	}

	public byte[] getBytes(Charset charset) {
		return str.getBytes(charset);
	}

	public byte[] getBytes() {
		return str.getBytes();
	}

	public boolean contentEquals(StringBuffer sb) {
		return str.contentEquals(sb);
	}

	public boolean contentEquals(CharSequence cs) {
		return str.contentEquals(cs);
	}

	public boolean equalsIgnoreCase(String anotherString) {
		return str.equalsIgnoreCase(anotherString);
	}

	public int compareTo(String anotherString) {
		return str.compareTo(anotherString);
	}

	public int compareToIgnoreCase(String str) {
		return str.compareToIgnoreCase(str);
	}

	public boolean regionMatches(int toffset, String other, int ooffset, int len) {
		return str.regionMatches(toffset, other, ooffset, len);
	}

	public boolean regionMatches(boolean ignoreCase, int toffset, String other,
			int ooffset, int len) {
		return str.regionMatches(ignoreCase, toffset, other, ooffset, len);
	}

	public boolean startsWith(String prefix, int toffset) {
		return str.startsWith(prefix, toffset);
	}

	public boolean startsWith(String prefix) {
		return str.startsWith(prefix);
	}

	public boolean endsWith(String suffix) {
		return str.endsWith(suffix);
	}

	public int indexOf(int ch) {
		return str.indexOf(ch);
	}

	public int indexOf(int ch, int fromIndex) {
		return str.indexOf(ch, fromIndex);
	}

	public int lastIndexOf(int ch) {
		return str.lastIndexOf(ch);
	}

	public int lastIndexOf(int ch, int fromIndex) {
		return str.lastIndexOf(ch, fromIndex);
	}

	public int indexOf(String str) {
		return str.indexOf(str);
	}

	public int indexOf(String str, int fromIndex) {
		return str.indexOf(str, fromIndex);
	}

	public int lastIndexOf(String str) {
		return str.lastIndexOf(str);
	}

	public int lastIndexOf(String str, int fromIndex) {
		return str.lastIndexOf(str, fromIndex);
	}

	public String substring(int beginIndex) {
		return str.substring(beginIndex);
	}

	public String substring(int beginIndex, int endIndex) {
		return str.substring(beginIndex, endIndex);
	}

	public CharSequence subSequence(int beginIndex, int endIndex) {
		return str.subSequence(beginIndex, endIndex);
	}

	public String concat(String str) {
		return str.concat(str);
	}

	public String replace(char oldChar, char newChar) {
		return str.replace(oldChar, newChar);
	}

	public boolean matches(String regex) {
		return str.matches(regex);
	}

	public boolean contains(CharSequence s) {
		return str.contains(s);
	}

	public String replaceFirst(String regex, String replacement) {
		return str.replaceFirst(regex, replacement);
	}

	public String replaceAll(String regex, String replacement) {
		return str.replaceAll(regex, replacement);
	}

	public String replace(CharSequence target, CharSequence replacement) {
		return str.replace(target, replacement);
	}

	public String[] split(String regex, int limit) {
		return str.split(regex, limit);
	}

	public String[] split(String regex) {
		return str.split(regex);
	}

	public String toLowerCase(Locale locale) {
		return str.toLowerCase(locale);
	}

	public String toLowerCase() {
		return str.toLowerCase();
	}

	public String toUpperCase(Locale locale) {
		return str.toUpperCase(locale);
	}

	public String toUpperCase() {
		return str.toUpperCase();
	}

	public String trim() {
		return str.trim();
	}

	public char[] toCharArray() {
		return str.toCharArray();
	}

	public String intern() {
		return str.intern();
	}

	
	@Override
	public int hashCode() {
		// TODO 自動生成されたメソッド・スタブ
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO 自動生成されたメソッド・スタブ
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO 自動生成されたメソッド・スタブ
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO 自動生成されたメソッド・スタブ
		super.finalize();
	}

	@Override
	public  String toString() {
		return Messages.getString("Hello.1"); //$NON-NLS-1$
	}
}
