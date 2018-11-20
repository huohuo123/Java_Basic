package com.java.study.decorator;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 20:20 2018/9/17
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmojiUtil {

	public static boolean findEmoji(String content) {
		Pattern pattern = Pattern.compile("[^\\u0000-\\uFFFF]");
		Matcher matcher = pattern.matcher(content);
		if (matcher.find()) {
			return true;
		} else {
			return false;
		}
	}



}

