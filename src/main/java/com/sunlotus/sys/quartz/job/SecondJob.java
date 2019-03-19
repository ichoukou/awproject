package com.sunlotus.sys.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.sunlotus.common.model.TaskConfig;

public class SecondJob implements Job{

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("读秒中...");
		TaskConfig st = TaskConfig.dao.findById(1);
		if(st.getInt("second")>0){//这个大于0才会倒数，如果不大于0就不倒数
			if(st.getInt("second")<=st.getInt("closetime")){
				if(st.getStr("fenpan").equals("0")){
					st.set("close", "2");
				}else{
					st.set("close", "0");
				}
			}else{
				if(st.getStr("fenpan").equals("0")){
					st.set("close", "2");
				}else{
					st.set("close", "1");
				}
			}
			st.set("second", st.getInt("second")-1);
			st.update();
		}
	}
	
}
