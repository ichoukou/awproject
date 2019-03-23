package com.sunlotus.wechat.until;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class HttpRequestUntil {
	private static final String token = "t10e9c565ded1e473k";
	private static final String code = "bjpk10";
	private static final String rows = "1";
	private static final String format = "json";
	//private static final String date = "2018-02-18";
	
	public static void main(String[] args) {
		//String url = "http://thirdwx.qlogo.cn/mmopen/5E8TCGud8aI5kEic1z6y2TPI4ia3l88AhX3IjBcyUJFLK8JOxfvpjatpEO3BFoEUFw3dJbcstf7mPCEPFGXl9bibFrKCN6qAJaK/132";
		//String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wx273ea9b350cea64b&secret=4d9151b5ed5211ebd10948ee36eceee4";
		/*url += "token="+token+"&";
		url += "code="+code+"&";
		url += "rows="+rows+"&";
		url += "format="+format;
		String urlAll = new StringBuffer(url).toString();*/
		//String charset = "UTF-8";
		//String jsonResult = getHttpDate(url, charset);// 得到JSON字符串
		//System.out.println(jsonResult);
		
		//File f = new File("D:/devloment/natapp" + "lixiangqian.jpg");  
       // FileUtils.copyURLToFile("http://thirdwx.qlogo.cn/mmopen/5E8TCGud8aI5kEic1z6y2TPI4ia3l88AhX3IjBcyUJFLK8JOxfvpjatpEO3BFoEUFw3dJbcstf7mPCEPFGXl9bibFrKCN6qAJaK/132", f);
		
		String urlsrc="http://thirdwx.qlogo.cn/mmopen/5E8TCGud8aI5kEic1z6y2TPI4ia3l88AhX3IjBcyUJFLK8JOxfvpjatpEO3BFoEUFw3dJbcstf7mPCEPFGXl9bibFrKCN6qAJaK/132"; //要访问的链接  
		String outPath="D://sss/lixiangqian.jpg";//本地路径  
		try {
			DownLoadPages(urlsrc, outPath);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}  
		
	}

	/**
	 * 
	 * @param urlAll:请求接口
	 * @param charset:字符编码
	 * @return 返回json结果
	 */
	public static String getHttpDate(String urlAll, String charset) {
		BufferedReader reader = null;
		String result = null;
		StringBuffer sbf = new StringBuffer();
		String userAgent = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";// 模拟浏览器
		try {
			URL url = new URL(urlAll);
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			connection.setRequestMethod("GET");
			connection.setReadTimeout(30000);
			connection.setConnectTimeout(30000);
			connection.setRequestProperty("User-agent", userAgent);
			connection.connect();
			InputStream is = connection.getInputStream();
			reader = new BufferedReader(new InputStreamReader(is, charset));
			String strRead = null;
			while ((strRead = reader.readLine()) != null) {
				sbf.append(strRead);
			}
			reader.close();
			result = sbf.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/* 
	下载文件 
	@param urlsrc 网页地址  
	@param outPath 文件输出路径 
	*/  
	@SuppressWarnings({ "resource" })  
	public static void DownLoadPages(String urlsrc, String outpath) throws UnknownHostException{  
		// 输入流   
		InputStream in = null;  
		// 文件输出流  
		FileOutputStream out = null;  
		try{   
			HttpParams httpParams = new BasicHttpParams();  
			HttpConnectionParams.setConnectionTimeout(httpParams,5000); //设置连接超时为5秒  
			HttpClient client = new DefaultHttpClient(httpParams); // 生成一个http客户端发送请求对象  
			HttpGet httpget2 = new HttpGet(urlsrc); //对下载链接get实现下载  
			HttpResponse httpResponse2 = client.execute(httpget2);  
			HttpEntity entity = httpResponse2.getEntity(); // 获取响应里面的内容  
			in = entity.getContent(); // 得到服务气端发回的响应的内容（都在一个流里面）  
			out = new FileOutputStream(new File(outpath));   
			byte[] b = new byte[1024];   
			int len = 0;   
			while((len=in.read(b))!= -1){   
				out.write(b,0,len);   
			}   
			in.close();   
			out.close();  
			httpget2.abort();
		}catch(Exception e){
			e.printStackTrace();  
		}  
	}  
		
}
