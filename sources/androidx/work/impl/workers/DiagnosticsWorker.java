package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.a;
import im.threads.ui.fragments.ChatFragment;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    private static final String a = nx5.f("DiagnosticsWrkr");

    public DiagnosticsWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @NonNull
    private static String a(@NonNull WorkSpec workSpec, String str, Integer num, @NonNull String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", workSpec.a, workSpec.c, num, workSpec.b.name(), str, str2);
    }

    @NonNull
    private static String c(@NonNull l7c l7cVar, @NonNull v7c v7cVar, @NonNull i4b i4bVar, @NonNull List<WorkSpec> list) {
        String str;
        Integer num;
        StringBuilder sb = new StringBuilder();
        if (Build.VERSION.SDK_INT >= 23) {
            str = "Job Id";
        } else {
            str = "Alarm Id";
        }
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", str));
        for (WorkSpec workSpec : list) {
            SystemIdInfo a2 = i4bVar.a(workSpec.a);
            if (a2 != null) {
                num = Integer.valueOf(a2.b);
            } else {
                num = null;
            }
            sb.append(a(workSpec, TextUtils.join(",", l7cVar.b(workSpec.a)), num, TextUtils.join(",", v7cVar.a(workSpec.a))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    @NonNull
    public ListenableWorker.a doWork() {
        WorkDatabase t = j7c.p(getApplicationContext()).t();
        a M = t.M();
        l7c K = t.K();
        v7c N = t.N();
        i4b J = t.J();
        List<WorkSpec> b = M.b(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<WorkSpec> p = M.p();
        List<WorkSpec> j = M.j(ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY);
        if (b != null && !b.isEmpty()) {
            nx5 c = nx5.c();
            String str = a;
            c.d(str, "Recently completed work:\n\n", new Throwable[0]);
            nx5.c().d(str, c(K, N, J, b), new Throwable[0]);
        }
        if (p != null && !p.isEmpty()) {
            nx5 c2 = nx5.c();
            String str2 = a;
            c2.d(str2, "Running work:\n\n", new Throwable[0]);
            nx5.c().d(str2, c(K, N, J, p), new Throwable[0]);
        }
        if (j != null && !j.isEmpty()) {
            nx5 c3 = nx5.c();
            String str3 = a;
            c3.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            nx5.c().d(str3, c(K, N, J, j), new Throwable[0]);
        }
        return ListenableWorker.a.c();
    }
}
