package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
/* compiled from: WorkerFactory.java */
/* renamed from: a8c  reason: default package */
/* loaded from: classes.dex */
public abstract class a8c {
    private static final String a = nx5.f("WorkerFactory");

    /* compiled from: WorkerFactory.java */
    /* renamed from: a8c$a */
    /* loaded from: classes.dex */
    class a extends a8c {
        a() {
        }

        @Override // defpackage.a8c
        public ListenableWorker a(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters) {
            return null;
        }
    }

    @NonNull
    public static a8c c() {
        return new a();
    }

    public abstract ListenableWorker a(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters);

    public final ListenableWorker b(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters) {
        Class cls;
        ListenableWorker a2 = a(context, str, workerParameters);
        if (a2 == null) {
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                nx5 c = nx5.c();
                String str2 = a;
                c.b(str2, "Invalid class: " + str, th);
                cls = null;
            }
            if (cls != null) {
                try {
                    a2 = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    nx5 c2 = nx5.c();
                    String str3 = a;
                    c2.b(str3, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a2 != null && a2.isUsed()) {
            throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
        }
        return a2;
    }
}
