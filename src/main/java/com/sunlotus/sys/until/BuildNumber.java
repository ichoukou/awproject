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
		return ls;
    }
	
	/**
	 * 获取不同的组合（二字现）
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
	 * 获取不同的组合（三字现）（四个数字都没有重复）
	 */
	public static List<String> getNumMuch(String initNum){
		String[] s = initNum.split(",");
		List<String> lsj = new ArrayList<String>();
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				for(int k=0; k<4; k++){
					boolean d = false;
					String buNum = "";
					if(!s[i].equals(s[j])&&!s[i].equals(s[k])&&!s[j].equals(s[k])){
						buNum = s[i]+s[j]+s[k];
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
		}
		return lsj;
	}
	
	/**
	 * 获取不同的组合（三字现）（有一个数字重复）
	 */
	public static List<String> getNumMuch(String initNum, String reNum){
		String[] s = initNum.split(",");
		List<String> lsj = new ArrayList<String>();
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				for(int k=0; k<4; k++){
					boolean d = false;
					String buNum = "";
					if(!s[i].equals(s[j])&&!s[i].equals(s[k])&&!s[j].equals(s[k])){
						buNum = s[i]+s[j]+s[k];
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
		}
		
		List<String> norepNum = new ArrayList<String>();
		for(String str : s){
			boolean isp = true;
			for(String nor : norepNum){
				if(str.equals(nor)){
					isp = false;
					break;
				}
			}
			if(isp){
				norepNum.add(str);
			}
		}
		
		//System.out.println(norepNum+"/"+reNum);
		List<String> lsjs = new ArrayList<String>();
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				boolean d = false;
				String buNum = "";
				if(!s[i].equals(s[j])){
					buNum = s[i]+s[j];
				}
				
				for(String ls : lsjs){
					if(ls.equals(buNum)){
						d = true;
						break;
					}
				}
				if(!d&&!buNum.equals("")){
					if(buNum.indexOf(reNum)>=0){
						String newBuNum = buNum;
						buNum = reNum+""+newBuNum;
						lsjs.add(buNum);
						buNum = newBuNum+""+reNum;
						lsjs.add(buNum);
					}
				}
			}
		}
		
		//System.out.println(lsjs);
		//去重 lsjs
		List<String> newLsjs = new ArrayList<String>();
		for(int i=0; i<lsjs.size(); i++){
			boolean d = true;
			for(int j=0; j<newLsjs.size(); j++){
				if(newLsjs.get(j).equals(lsjs.get(i))){
					d = false;
					break;
				}
			}
			if(d){
				newLsjs.add(lsjs.get(i));
			}
		}
		//System.out.println(newLsjs);	
		//合并
		for(String se:newLsjs){
			lsj.add(se);
		}
		return lsj;
	}
	
	
	/**
	 * 添加重复的（二字现）
	 * @param opNum
	 * @return
	 */
	public static List<String> GetErZiXian(String opNum){
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
	
	public static List<String> GetSanZiXian(String opNum){
		List<String> lst = new ArrayList<String>();
		String nos = opNum.replaceAll(",", "");
		List<String> lstr = checkDifferentNot(nos);
		if(lstr.size()==0){
			lst = getNumMuch(opNum); //没有重复的【已解决】
		}
		if(lstr.size()==1){
			lst = getNumMuch(opNum, lstr.get(0)); //有一个数重复的【已解决】
		}
		if(lstr.size()==2){
			System.out.println(2);
		}
		if(lstr.size()==3){
			System.out.println(3);
		}
		return lst;
	}
	
	/**
	 * 入口
	 * @param args
	 */
	public static void main(String[] args) {
		//二字现全部出现中奖的号码
		//System.out.println(GetErZiXian("0,4,6,2"));
		//三字现全部出现中奖的号码
		System.out.println(GetSanZiXian("6,5,2,5"));
		/**
		 *556 655 552 255 565 525 
		 * 
		 * 其实吧在茫茫人海中能遇到一个自己特别喜欢的人非常非常的难，所以我不想就这样错过你，这不只是上天给我的一次机会，而且也是给你的一次机会，防止你错过我这么温柔、善良、体贴、乐观的男生。哈哈哈
		 * 
		 */
	}
	
}
