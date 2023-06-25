package GoogleSource;
import java.util.*;
import java.util.regex.Pattern;

//public class Demo06String {
//	public static void main(String[] args) {
//		//ʹ�ÿղι���
//		String str = new String();
//		
//		//ʹ���ַ����鴴��
//		char[] charArray = {'a', 'b', 'c'};
//		String str2 = new String(charArray);
//		
//		//ʹ���ֽ����鴴��
//		byte[] byteArray = {97, 98, 99};
//		String str3 = new String(byteArray);//�ַ����ĵײ�����õ�byte����
//		
//		String str4 = "Hello";//ֱ�Ӵ���
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
	private static final long serialVersionUID = -6849794470754667710L;//���л�id
	
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
	        if (((regex.value.length == 1 && //�жϲ��������Ƿ�Ϊ1
	             ".$|()[{^?*+\\".indexOf(ch = regex.charAt(0)) == -1) || //�жϲ��������������".$|()[{^?*+\\"�� 
	             (regex.length() == 2 && //�жϲ��������Ƿ�Ϊ2
	              regex.charAt(0) == '\\' &&  \\��һλΪת���"\\"
	              (((ch = regex.charAt(1))-'0')|('9'-ch)) < 0 && //�ڶ�λ����0-9֮�� '0'ת��ΪintΪ48 '9'ת��ΪintΪ57 
	              ((ch-'a')|('z'-ch)) < 0 && //�жϲ��� a-z֮��
	              ((ch-'A')|('Z'-ch)) < 0)) && //�жϲ���A-Z֮��
	            (ch < Character.MIN_HIGH_SURROGATE || 
	             ch > Character.MAX_LOW_SURROGATE))  //�жϷָ����������������
	        {
	            int off = 0;//��ǰ����
	            int next = 0;//��һ���ָ�����ֵ�����
	            boolean limited = limit > 0;//ֻ�ָ�ǰlimit�ݻ���ȫ���ָ�,limit=0����ȫ���ָ�
	            ArrayList<String> list = new ArrayList<>();//����һ�����ϣ����ڴ���и�õ��Ӵ�
	            while ((next = indexOf(ch, off)) != -1) {//�ж��Ƿ�����¸��ָ���������������ѭ��
	                if (!limited || list.size() < limit - 1) {//�ж���ȫ���ָ��ǰ�ָ����С���ָܷ����
	                    list.add(substring(off, next));//�иǰ��������һ���ָ���֮����ַ�������ӵ�list��
	                    off = next + 1; //�����и���һ���Ӵ�
	                } else {    // last one
	                    //assert (list.size() == limit - 1);
	                    list.add(substring(off, value.length));//�иǰ�������ַ�����β�����ַ�������ӵ�list
	                    off = value.length;//����ǰ������Ϊ�ַ�������
	                    break;//����ѭ��
	                }
	            }
	            // If no match was found, return this
	            if (off == 0) //����Ҳ����ָ����򷵻�ֻ�б��ַ���������
	                return new String[]{this};

	            // Add remaining segment
	            if (!limited || list.size() < limit)//�����ȫ���ָ����û�дﵽ�ָ�������׷�����һ��
	                list.add(substring(off, value.length));

	            // Construct result
	            int resultSize = list.size();
	            if (limit == 0) {//�Ƴ����༯����
	                while (resultSize > 0 && list.get(resultSize - 1).length() == 0) {
	                    resultSize--;
	                }
	            }
	            String[] result = new String[resultSize];//������Ӧ�������飬��Ϊ���ؽ��Ϊ�ַ�������
	            return list.subList(0, resultSize).toArray(result);//����ת���鲢����
	        }
	        return Pattern.compile(regex).split(this, limit);//���������������и����ȥ�и�
	    }
}