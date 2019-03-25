package com.sunlotus.sys.until;

import java.util.ArrayList;
import java.util.List;

import com.jfinal.plugin.activerecord.Record;

public class BuildNumber {

	
	/**
	 * 生成四字定和四字现全部号码
	 */
	public static String BuileNumberFunc(){
		StringBuffer sfb = new StringBuffer();
		sfb.append("{");
		for(int i=0; i<1000; i++){
			if(i<10){
				sfb.append("\"00"+i+"\":\"00"+i+"\",");
			}
			if(10<=i&&i<100){
				sfb.append("\"0"+i+"\":\"0"+i+"\",");
			}
			if(100<=i&&i<1000){
				sfb.append("\""+i+"\":\""+i+"\",");
			}
			/*if(1000<=i&&i<10000){
				sfb.append("\""+i+"\":\""+i+"\",");
			}*/
		}
		String sfbs = sfb.toString();
		sfbs = sfbs.substring(0,sfbs.length()-1);
		sfbs+="}";
		return sfbs;
	} 
	
	/**
	 * 三字定
	 * @return
	 */
	public static String SanZiDingFunc(List<Record> ls){
		List<String> lss = new ArrayList<String>();
		StringBuffer sfb = new StringBuffer();
		sfb.append("{");
		for(Record rec : ls){
			String number = rec.getStr("number");
			number = number.substring(3,4);
			//String firs = number.substring(0,1);
			//String firs = number.substring(1,2);
			//String secs = number.substring(2,3);
			//String x = number.substring(3,4);
			String xsan = "XXX"+number;
			boolean bl = false;
			for(String s : lss){
				if(s.equals(xsan)){
					bl = true;
					break;
				}
			}
			if(!bl){
				lss.add(xsan);
				sfb.append("\""+xsan+"\":\""+xsan+"\",");
				System.out.println(xsan);
			}
		}
		String sfbs = sfb.toString();
		sfbs = sfbs.substring(0,sfbs.length()-1);
		sfbs+="}";
		return sfbs;
	}
	
	/**
	 * 判断字符重复的数
	 * @param iniString
	 * @return
	 */
	public static List<String> checkDifferentNot(String iniString) {
		List<String> ls = new ArrayList<String>();
		for(int i = 0;i<iniString.length();i++){
			char c = iniString.charAt(i);
		    if(iniString.lastIndexOf(c) != i){
		    	ls.add(c+"");
		    }
		}
		//System.out.println(ls);
		return ls;
    }
	
	/**
	 * 获取不重复的
	 */
	public static List<String> getNoRepetNum(String initNum){
		String[] s = initNum.split(",");
		List<String> lsj = new ArrayList<String>();
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				boolean d = false;
				String buNum = "";
				if(!s[i].equals(s[j])){
					buNum = s[i]+s[j];
				}
				
				for(String ls : lsj){
					if(ls.equals(buNum)){
						d = true;
						break;
					}
				}
				if(!d&&!buNum.equals("")){
					lsj.add(buNum);
				}
			}
		}
		return lsj;
	}
	
	/**
	 * 添加重复的
	 * @param opNum
	 * @return
	 */
	public static List<String> AddRepetNum(String opNum){
		String nos = opNum.replaceAll(",", "");
		List<String> lstr = checkDifferentNot(nos);
		List<String> lst = getNoRepetNum(opNum);
		if(lstr.size()==1){
			lst.add(lstr.get(0)+lstr.get(0));
		}
		if(lstr.size()==2){
			List<String> lsd = new ArrayList<String>();
			for(String st : lstr){
				boolean isyes = false;
				for(String ss : lsd){
					if(ss.equals(st)){
						isyes = true;
						break;
					}
				}
				if(!isyes){
					lsd.add(st);
				}
			}
			if(lsd.size()==2){
				lst.add(lstr.get(0)+lstr.get(0));
				lst.add(lstr.get(1)+lstr.get(1));
			}
			if(lsd.size()==1){
				lst.add(lstr.get(0)+lstr.get(0));
			}
		}
		if(lstr.size()==3){
			lst.add(lstr.get(0)+lstr.get(0));
		}
		return lst;
	}
	
	/**
	 * 入口
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(AddRepetNum("0,4,6,2"));
	}
	
}
