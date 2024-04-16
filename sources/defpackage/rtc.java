package defpackage;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
@TargetApi(24)
/* renamed from: rtc  reason: default package */
/* loaded from: classes2.dex */
public final class rtc {
    private static final Method b = e();
    private static final Method c = d();
    private final JobScheduler a;

    private rtc(JobScheduler jobScheduler) {
        this.a = jobScheduler;
    }

    private static int a() {
        Method method = c;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, new Object[0]);
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
        }
        return 0;
    }

    private final int b(JobInfo jobInfo, String str, int i, String str2) {
        Method method = b;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(this.a, jobInfo, str, Integer.valueOf(i), str2);
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.e(str2, "error calling scheduleAsPackage", e);
            }
        }
        return this.a.schedule(jobInfo);
    }

    public static int c(Context context, JobInfo jobInfo, String str, String str2) {
        int checkSelfPermission;
        JobScheduler jobScheduler = (JobScheduler) hh8.i((JobScheduler) context.getSystemService("jobscheduler"));
        if (b != null) {
            checkSelfPermission = context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS");
            if (checkSelfPermission == 0) {
                return new rtc(jobScheduler).b(jobInfo, str, a(), str2);
            }
        }
        return jobScheduler.schedule(jobInfo);
    }

    private static Method d() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No myUserId method available");
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    private static Method e() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                    return null;
                }
                return null;
            }
        }
        return null;
    }
}
