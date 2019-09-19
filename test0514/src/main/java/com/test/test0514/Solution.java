package com.test.test0514;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution {
	  public String replaceSpace(StringBuffer str) {
		  String[] s = str.toString().split(" ");
		  StringBuffer res = new StringBuffer(" ");
		  for(int i = 0;i < s.length;i ++){
			  res.append(s[i]);
			  if(i == s.length-1){break;}
			  res.append("%20");
		  }
		  
		  return res.toString();
	  }
}