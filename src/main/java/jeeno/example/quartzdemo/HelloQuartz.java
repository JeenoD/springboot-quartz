package jeeno.example.quartzdemo;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;

import java.util.Date;

/**
 * @author 杜家浩
 * @version 0.0.1
 * @since 2019/8/1 17:30
 */
@DisallowConcurrentExecution
public class HelloQuartz implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        JobDetail detail = jobExecutionContext.getJobDetail();
        String name = detail.getJobDataMap().getString("name");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("my job name is  " + name + " at " + new Date());
    }
}
