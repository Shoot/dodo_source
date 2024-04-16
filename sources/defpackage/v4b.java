package defpackage;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.WorkSpec;
import defpackage.du1;
/* compiled from: SystemJobInfoConverter.java */
/* renamed from: v4b  reason: default package */
/* loaded from: classes.dex */
class v4b {
    private static final String b = nx5.f("SystemJobInfoConverter");
    private final ComponentName a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemJobInfoConverter.java */
    /* renamed from: v4b$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ow6.values().length];
            a = iArr;
            try {
                iArr[ow6.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ow6.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ow6.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ow6.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ow6.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v4b(@NonNull Context context) {
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(du1.a aVar) {
        boolean b2 = aVar.b();
        u4b.a();
        return t4b.a(aVar.a(), b2 ? 1 : 0);
    }

    static int c(ow6 ow6Var) {
        int i = a.a[ow6Var.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            if (i == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        nx5.c().a(b, String.format("API version too low. Cannot convert network type value %s", ow6Var), new Throwable[0]);
        return 1;
    }

    static void d(@NonNull JobInfo.Builder builder, @NonNull ow6 ow6Var) {
        if (Build.VERSION.SDK_INT >= 30 && ow6Var == ow6.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            builder.setRequiredNetworkType(c(ow6Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JobInfo a(WorkSpec workSpec, int i) {
        boolean z;
        int i2;
        or1 or1Var = workSpec.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", workSpec.a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", workSpec.d());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.a).setRequiresCharging(or1Var.g()).setRequiresDeviceIdle(or1Var.h()).setExtras(persistableBundle);
        d(extras, or1Var.b());
        boolean z2 = false;
        if (!or1Var.h()) {
            if (workSpec.l == f60.LINEAR) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            extras.setBackoffCriteria(workSpec.m, i2);
        }
        long max = Math.max(workSpec.a() - System.currentTimeMillis(), 0L);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!workSpec.q) {
            extras.setImportantWhileForeground(true);
        }
        if (i3 >= 24 && or1Var.e()) {
            for (du1.a aVar : or1Var.a().b()) {
                extras.addTriggerContentUri(b(aVar));
            }
            extras.setTriggerContentUpdateDelay(or1Var.c());
            extras.setTriggerContentMaxDelay(or1Var.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(or1Var.f());
            extras.setRequiresStorageNotLow(or1Var.i());
        }
        if (workSpec.k > 0) {
            z = true;
        } else {
            z = false;
        }
        if (max > 0) {
            z2 = true;
        }
        if (gh0.c() && workSpec.q && !z && !z2) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
