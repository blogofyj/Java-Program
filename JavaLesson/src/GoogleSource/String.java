package GoogleSource;
import java.util.*;
import java.util.regex.Pattern;

//public class Demo06String {
//	public static void main(String[] args) {
//		//使用空参构造
//		String str = new String();
//		
//		//使用字符数组创建
//		char[] charArray = {'a', 'b', 'c'};
//		String str2 = new String(charArray);
//		
//		//使用字节数组创建
//		byte[] byteArray = {97, 98, 99};
//		String str3 = new String(byteArray);//字符串的底层就是用的byte数组
//		
//		String str4 = "Hello";//直接创建
//		
//		
//	}
//}

//public final class String implements java.io.Serializable, Comparable<String>, CharSequence{

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private final char[] value;
	private int hash;
	private static final long serialVersionUID = -6849794470754667710L;//序列化id
	
	public String() {
		this.value = "".value;
		
		
	}
	
	public String(char[] value) {
		this.value = Arrays.copyOf(value, value.length);
	}
	
	public String(char[] value, int offset, int count) {
		if (offset < 0) {
			throw new StringIndexOutOfBoundsException(offset);
		}if(count <= 0) {
			if(count < 0) {
				throw new StringIndexOutOfBoundsException(count);
			}if(offset <= value.length) {
				this.value = "".value;
				return;
			}
		}
		if (offset > value.length - count) {
			throw new StringIndexOutOfBoundsException(offset + count);
		}
		this.value = Arrays.copyOfRange(value, offset, offset + count);
		
	}
	
	public boolean isEmpty() {
		return value.length == 0;
	}
	
	public char charAt1(int index) {
		if((index < 0) || (index >= value.length)) {
			throw new StringIndexOutOfBoundsException(index);
		}
		return value[index];
	}
	
	public boolean equals(Object anObject) {
		if(this == anObject) {
			return true;
		}
		if(anObject instanceof String) {
			String anotherString = (String)anObject;
			int n = value.length;
			if(n == anotherString.value.length) {
				char[] v1 = value;
				char[] v2 = anotherString.value;
				int i = 0;
				while(n-- != 0) {
					if(v1[i] != v2[i])
						return false;
					i++;
				}
				return true;
			}
		}
		return false;
	}
	
	public boolean equalsIgnoreCase(String anotherString) {
		return(this == anotherString) ? true : (anotherString != null)
				&&(anotherString.value.length == value.length)
				&& regionMatches(true, 0, anotherString, 0, value.length);
	}
	
	public boolean regionMatches(int toffset, String other, int ooffset, int len) {
		char[] ta = value;
		int to = toffset;
		char[] pa = other.value;
		int po = ooffset;
		
		if((ooffset < 0) || (toffset < 0)
			|| (toffset > (long)value.length - len)
			|| (ooffset > (long)other.value.length - len)){
        	return false;
        }
		while(len-- > 0) {
			if(ta[to++] != pa[po++]) {
				return false;
			}
		}
		return true;
	}
	
	public int compare(String s1, String s2) {
		int n1 = s1.length();
		int n2 = s2.length();
		int min = min(n1, n2);
		for (int i = 0; i < min; i++) {
			char c1 = s1.charAt(i);
			char c2 = s1.charAt(i);
			if (c1 != c2) {
				c1 = Character.toUpperCase(c1);
				c2 = Character.toUpperCase(c2);
				if (c1 != c2) {
					c1 = Character.toLowerCase(c1);
					c2 = Character.toLowerCase(c2);
					if(c1 != c2) {
						return c1 - c2;
					}
				}
			}
		}
		return n1 - n2;
	}
	public int min(int n1, int n2) {
		return n1 >= n2 ? n2 : n1;
	}
	
	
	 public boolean startsWith(String prefix, int toffset) {
	        char ta[] = value;
	        int to = toffset;
	        char pa[] = prefix.value;
	        int po = 0;
	        int pc = prefix.value.length;
	        // Note: toffset might be near -1>>>1.
	        if ((toffset < 0) || (toffset > value.length - pc)) {
	            return false;
	        }
	        while (--pc >= 0) {
	            if (ta[to++] != pa[po++]) {
	                return false;
	            }
	        }
	        return true;
	    }
	 
	 public int hashCode() {
	        int h = hash;
	        if (h == 0 && value.length > 0) {
	            char val[] = value;

	            for (int i = 0; i < value.length; i++) {
	                h = 31 * h + val[i];
	            }
	            hash = h;
	        }
	        return h;
	    }
	 
	 public int indexOf(int ch, int fromIndex) {
	        final int max = value.length;
	        if (fromIndex < 0) {
	            fromIndex = 0;
	        } else if (fromIndex >= max) {
	            // Note: fromIndex might be near -1>>>1.
	            return -1;
	        }

	        if (ch < Character.MIN_SUPPLEMENTARY_CODE_POINT) {
	            // handle most cases here (ch is a BMP code point or a
	            // negative value (invalid code point))
	            final char[] value = this.value;
	            for (int i = fromIndex; i < max; i++) {
	                if (value[i] == ch) {
	                    return i;
	                }
	            }
	            return -1;
	        } else {
	            return indexOfSupplementary(ch, fromIndex);
	        }
	    }
	 
	 public String concat(String str) {
	        int otherLen = str.length();
	        if (otherLen == 0) {
	            return this;
	        }
	        int len = value.length;
	        char buf[] = Arrays.copyOf(value, len + otherLen);
	        str.getChars(buf, len);
	        return new String(buf, true);
	    }
	 
	 public String replace(char oldChar, char newChar) {
	        if (oldChar != newChar) {
	            int len = value.length;
	            int i = -1;
	            char[] val = value; /* avoid getfield opcode */

	            while (++i < len) {
	                if (val[i] == oldChar) {
	                    break;
	                }
	            }
	            if (i < len) {
	                char buf[] = new char[len];
	                for (int j = 0; j < i; j++) {
	                    buf[j] = val[j];
	                }
	                while (i < len) {
	                    char c = val[i];
	                    buf[i] = (c == oldChar) ? newChar : c;
	                    i++;
	                }
	                return new String(buf, true);
	            }
	        }
	        return this;
	    }
	 
	 public boolean matches(String regex) {
	        return Pattern.matches(regex, this);
	    }
	 
	 public String[] split(String regex, int limit) {
	        char ch = 0;
	        if (((regex.value.length == 1 && //判断参数长度是否为1
	             ".$|()[{^?*+\\".indexOf(ch = regex.charAt(0)) == -1) || //判断参数不在特殊符号".$|()[{^?*+\\"中 
	             (regex.length() == 2 && //判断参数长度是否为2
	              regex.charAt(0) == '\\' &&  \\第一位为转义符"\\"
	              (((ch = regex.charAt(1))-'0')|('9'-ch)) < 0 && //第二位不是0-9之间 '0'转换为int为48 '9'转换为int为57 
	              ((ch-'a')|('z'-ch)) < 0 && //判断不在 a-z之间
	              ((ch-'A')|('Z'-ch)) < 0)) && //判断不在A-Z之间
	            (ch < Character.MIN_HIGH_SURROGATE || 
	             ch > Character.MAX_LOW_SURROGATE))  //判断分隔符不在特殊符号中
	        {
	            int off = 0;//当前索引
	            int next = 0;//下一个分割符出现的索引
	            boolean limited = limit > 0;//只分割前limit份还是全部分割,limit=0代表全部分割
	            ArrayList<String> list = new ArrayList<>();//创建一个集合，用于存放切割好的子串
	            while ((next = indexOf(ch, off)) != -1) {//判断是否包含下个分隔符，如果有则进入循环
	                if (!limited || list.size() < limit - 1) {//判断是全部分割或当前分割次数小于总分割次数
	                    list.add(substring(off, next));//切割当前索引到下一个分隔符之间的字符串并添加到list中
	                    off = next + 1; //继续切割下一下子串
	                } else {    // last one
	                    //assert (list.size() == limit - 1);
	                    list.add(substring(off, value.length));//切割当前索引到字符串结尾的子字符串并添加到list
	                    off = value.length;//将当前索引置为字符串长度
	                    break;//结束循环
	                }
	            }
	            // If no match was found, return this
	            if (off == 0) //如果找不到分隔符则返回只有本字符串的数组
	                return new String[]{this};

	            // Add remaining segment
	            if (!limited || list.size() < limit)//如果是全部分割，或者没有达到分割数，则追加最后一项
	                list.add(substring(off, value.length));

	            // Construct result
	            int resultSize = list.size();
	            if (limit == 0) {//移除多余集合项
	                while (resultSize > 0 && list.get(resultSize - 1).length() == 0) {
	                    resultSize--;
	                }
	            }
	            String[] result = new String[resultSize];//创建对应长度数组，因为返回结果为字符串数组
	            return list.subList(0, resultSize).toArray(result);//集合转数组并返回
	        }
	        return Pattern.compile(regex).split(this, limit);//其它情况用正则的切割规则去切割
	    }
}