package defpackage;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import androidx.annotation.NonNull;
import defpackage.c22;
import defpackage.j12;
import defpackage.mwa;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CrashlyticsController.java */
/* renamed from: y02  reason: default package */
/* loaded from: classes2.dex */
public class y02 {
    static final FilenameFilter t = new FilenameFilter() { // from class: x02
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean K;
            K = y02.K(file, str);
            return K;
        }
    };
    private final Context a;
    private final ok2 b;
    private final b12 c;
    private final mub d;
    private final w02 e;
    private final gt4 f;
    private final hu3 g;
    private final yn h;
    private final sw5 i;
    private final c12 j;
    private final sc k;
    private final v02 l;
    private final bfa m;
    private c22 n;
    private gga o = null;
    final a7b<Boolean> p = new a7b<>();
    final a7b<Boolean> q = new a7b<>();
    final a7b<Void> r = new a7b<>();
    final AtomicBoolean s = new AtomicBoolean(false);

    /* compiled from: CrashlyticsController.java */
    /* renamed from: y02$a */
    /* loaded from: classes2.dex */
    class a implements c22.a {
        a() {
        }

        @Override // defpackage.c22.a
        public void a(@NonNull gga ggaVar, @NonNull Thread thread, @NonNull Throwable th) {
            y02.this.H(ggaVar, thread, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: y02$b */
    /* loaded from: classes2.dex */
    public class b implements Callable<y6b<Void>> {
        final /* synthetic */ long a;
        final /* synthetic */ Throwable b;
        final /* synthetic */ Thread c;
        final /* synthetic */ gga d;
        final /* synthetic */ boolean e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CrashlyticsController.java */
        /* renamed from: y02$b$a */
        /* loaded from: classes2.dex */
        public class a implements r1b<vfa, Void> {
            final /* synthetic */ Executor a;
            final /* synthetic */ String b;

            a(Executor executor, String str) {
                this.a = executor;
                this.b = str;
            }

            @Override // defpackage.r1b
            @NonNull
            /* renamed from: b */
            public y6b<Void> a(vfa vfaVar) throws Exception {
                String str = null;
                if (vfaVar == null) {
                    rx5.f().k("Received null app settings, cannot send reports at crash time.");
                    return o7b.e(null);
                }
                y6b[] y6bVarArr = new y6b[2];
                y6bVarArr[0] = y02.this.N();
                bfa bfaVar = y02.this.m;
                Executor executor = this.a;
                if (b.this.e) {
                    str = this.b;
                }
                y6bVarArr[1] = bfaVar.y(executor, str);
                return o7b.g(y6bVarArr);
            }
        }

        b(long j, Throwable th, Thread thread, gga ggaVar, boolean z) {
            this.a = j;
            this.b = th;
            this.c = thread;
            this.d = ggaVar;
            this.e = z;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public y6b<Void> call() throws Exception {
            long F = y02.F(this.a);
            String B = y02.this.B();
            if (B == null) {
                rx5.f().d("Tried to write a fatal exception while no session was open.");
                return o7b.e(null);
            }
            y02.this.c.a();
            y02.this.m.t(this.b, this.c, B, F);
            y02.this.w(this.a);
            y02.this.t(this.d);
            y02.this.v(new al0(y02.this.f).toString(), Boolean.valueOf(this.e));
            if (!y02.this.b.d()) {
                return o7b.e(null);
            }
            Executor c = y02.this.e.c();
            return this.d.a().s(c, new a(c, B));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: y02$c */
    /* loaded from: classes2.dex */
    public class c implements r1b<Void, Boolean> {
        c() {
        }

        @Override // defpackage.r1b
        @NonNull
        /* renamed from: b */
        public y6b<Boolean> a(Void r1) throws Exception {
            return o7b.e(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: y02$d */
    /* loaded from: classes2.dex */
    public class d implements r1b<Boolean, Void> {
        final /* synthetic */ y6b a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CrashlyticsController.java */
        /* renamed from: y02$d$a */
        /* loaded from: classes2.dex */
        public class a implements Callable<y6b<Void>> {
            final /* synthetic */ Boolean a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CrashlyticsController.java */
            /* renamed from: y02$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public class C0747a implements r1b<vfa, Void> {
                final /* synthetic */ Executor a;

                C0747a(Executor executor) {
                    this.a = executor;
                }

                @Override // defpackage.r1b
                @NonNull
                /* renamed from: b */
                public y6b<Void> a(vfa vfaVar) throws Exception {
                    if (vfaVar != null) {
                        y02.this.N();
                        y02.this.m.x(this.a);
                        y02.this.r.e(null);
                        return o7b.e(null);
                    }
                    rx5.f().k("Received null app settings at app startup. Cannot send cached reports");
                    return o7b.e(null);
                }
            }

            a(Boolean bool) {
                this.a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public y6b<Void> call() throws Exception {
                if (!this.a.booleanValue()) {
                    rx5.f().i("Deleting cached crash reports...");
                    y02.r(y02.this.L());
                    y02.this.m.w();
                    y02.this.r.e(null);
                    return o7b.e(null);
                }
                rx5.f().b("Sending cached crash reports...");
                y02.this.b.c(this.a.booleanValue());
                Executor c = y02.this.e.c();
                return d.this.a.s(c, new C0747a(c));
            }
        }

        d(y6b y6bVar) {
            this.a = y6bVar;
        }

        @Override // defpackage.r1b
        @NonNull
        /* renamed from: b */
        public y6b<Void> a(Boolean bool) throws Exception {
            return y02.this.e.i(new a(bool));
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* renamed from: y02$e */
    /* loaded from: classes2.dex */
    class e implements Callable<Void> {
        final /* synthetic */ long a;
        final /* synthetic */ String b;

        e(long j, String str) {
            this.a = j;
            this.b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            if (!y02.this.J()) {
                y02.this.i.g(this.a, this.b);
                return null;
            }
            return null;
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* renamed from: y02$f */
    /* loaded from: classes2.dex */
    class f implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ Throwable b;
        final /* synthetic */ Thread c;

        f(long j, Throwable th, Thread thread) {
            this.a = j;
            this.b = th;
            this.c = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!y02.this.J()) {
                long F = y02.F(this.a);
                String B = y02.this.B();
                if (B == null) {
                    rx5.f().k("Tried to write a non-fatal exception while no session was open.");
                } else {
                    y02.this.m.u(this.b, this.c, B, F);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: y02$g */
    /* loaded from: classes2.dex */
    public class g implements Callable<Void> {
        final /* synthetic */ String a;

        g(String str) {
            this.a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            y02.this.v(this.a, Boolean.FALSE);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: y02$h */
    /* loaded from: classes2.dex */
    public class h implements Callable<Void> {
        final /* synthetic */ long a;

        h(long j) {
            this.a = j;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.a);
            y02.this.k.a("_ae", bundle);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y02(Context context, w02 w02Var, gt4 gt4Var, ok2 ok2Var, hu3 hu3Var, b12 b12Var, yn ynVar, mub mubVar, sw5 sw5Var, bfa bfaVar, c12 c12Var, sc scVar, v02 v02Var) {
        this.a = context;
        this.e = w02Var;
        this.f = gt4Var;
        this.b = ok2Var;
        this.g = hu3Var;
        this.c = b12Var;
        this.h = ynVar;
        this.d = mubVar;
        this.i = sw5Var;
        this.j = c12Var;
        this.k = scVar;
        this.l = v02Var;
        this.m = bfaVar;
    }

    private static boolean A() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String B() {
        SortedSet<String> p = this.m.p();
        if (!p.isEmpty()) {
            return p.first();
        }
        return null;
    }

    private static long C() {
        return F(System.currentTimeMillis());
    }

    @NonNull
    static List<mu6> D(ou6 ou6Var, String str, hu3 hu3Var, byte[] bArr) {
        File o = hu3Var.o(str, "user-data");
        File o2 = hu3Var.o(str, "keys");
        File o3 = hu3Var.o(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ok0("logs_file", "logs", bArr));
        arrayList.add(new xs3("crash_meta_file", "metadata", ou6Var.d()));
        arrayList.add(new xs3("session_meta_file", "session", ou6Var.g()));
        arrayList.add(new xs3("app_meta_file", "app", ou6Var.e()));
        arrayList.add(new xs3("device_meta_file", "device", ou6Var.a()));
        arrayList.add(new xs3("os_meta_file", "os", ou6Var.f()));
        arrayList.add(P(ou6Var));
        arrayList.add(new xs3("user_meta_file", "user", o));
        arrayList.add(new xs3("keys_file", "keys", o2));
        arrayList.add(new xs3("rollouts_file", "rollouts", o3));
        return arrayList;
    }

    private InputStream E(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            rx5.f().k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream == null) {
            rx5.f().g("No version control information found");
            return null;
        }
        return resourceAsStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long F(long j) {
        return j / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean K(File file, String str) {
        return str.startsWith(".ae");
    }

    private y6b<Void> M(long j) {
        if (A()) {
            rx5.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return o7b.e(null);
        }
        rx5.f().b("Logging app exception event to Firebase Analytics");
        return o7b.c(new ScheduledThreadPoolExecutor(1), new h(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public y6b<Void> N() {
        ArrayList arrayList = new ArrayList();
        for (File file : L()) {
            try {
                arrayList.add(M(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                rx5 f2 = rx5.f();
                f2.k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return o7b.f(arrayList);
    }

    private static boolean O(String str, File file, j12.a aVar) {
        if (file == null || !file.exists()) {
            rx5 f2 = rx5.f();
            f2.k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            rx5 f3 = rx5.f();
            f3.g("No Tombstones data found for session " + str);
        }
        if ((file == null || !file.exists()) && aVar == null) {
            return true;
        }
        return false;
    }

    private static mu6 P(ou6 ou6Var) {
        File c2 = ou6Var.c();
        if (c2 != null && c2.exists()) {
            return new xs3("minidump_file", "minidump", c2);
        }
        return new ok0("minidump_file", "minidump", new byte[]{0});
    }

    private static byte[] R(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private y6b<Boolean> W() {
        if (this.b.d()) {
            rx5.f().b("Automatic data collection is enabled. Allowing upload.");
            this.p.e(Boolean.FALSE);
            return o7b.e(Boolean.TRUE);
        }
        rx5.f().b("Automatic data collection is disabled.");
        rx5.f().i("Notifying that unsent reports are available.");
        this.p.e(Boolean.TRUE);
        y6b<TContinuationResult> r = this.b.h().r(new c());
        rx5.f().b("Waiting for send/deleteUnsentReports to be called.");
        return gvb.n(r, this.q.a());
    }

    private void X(String str) {
        List<ApplicationExitInfo> historicalProcessExitReasons;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.m.v(str, historicalProcessExitReasons, new sw5(this.g, str), mub.j(str, this.g, this.e));
                return;
            }
            rx5 f2 = rx5.f();
            f2.i("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        rx5 f3 = rx5.f();
        f3.i("ANR feature enabled, but device is API " + i);
    }

    private static mwa.a o(gt4 gt4Var, yn ynVar) {
        return mwa.a.b(gt4Var.f(), ynVar.f, ynVar.g, gt4Var.a().c(), pz2.a(ynVar.d).i(), ynVar.h);
    }

    private static mwa.b p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return mwa.b.c(ek1.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), ek1.b(context), statFs.getBlockCount() * statFs.getBlockSize(), ek1.w(), ek1.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static mwa.c q() {
        return mwa.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, ek1.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void u(boolean z, gga ggaVar) {
        String str;
        ArrayList arrayList = new ArrayList(this.m.p());
        if (arrayList.size() <= z) {
            rx5.f().i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z ? 1 : 0);
        if (ggaVar.b().b.b) {
            X(str2);
        } else {
            rx5.f().i("ANR feature disabled.");
        }
        if (this.j.c(str2)) {
            y(str2);
        }
        if (z != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.l.e(null);
            str = null;
        }
        this.m.k(C(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str, Boolean bool) {
        long C = C();
        rx5 f2 = rx5.f();
        f2.b("Opening a new session with ID " + str);
        this.j.d(str, String.format(Locale.US, "Crashlytics Android SDK/%s", a12.i()), C, mwa.b(o(this.f, this.h), q(), p(this.a)));
        if (bool.booleanValue() && str != null) {
            this.d.n(str);
        }
        this.i.e(str);
        this.l.e(str);
        this.m.q(str, C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(long j) {
        try {
            hu3 hu3Var = this.g;
            if (!hu3Var.e(".ae" + j).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e2) {
            rx5.f().l("Could not create app exception marker file.", e2);
        }
    }

    private void y(String str) {
        rx5 f2 = rx5.f();
        f2.i("Finalizing native report for session " + str);
        ou6 a2 = this.j.a(str);
        File c2 = a2.c();
        j12.a b2 = a2.b();
        if (O(str, c2, b2)) {
            rx5.f().k("No native core present");
            return;
        }
        long lastModified = c2.lastModified();
        sw5 sw5Var = new sw5(this.g, str);
        File i = this.g.i(str);
        if (!i.isDirectory()) {
            rx5.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        w(lastModified);
        List<mu6> D = D(a2, str, this.g, sw5Var.b());
        nu6.b(i, D);
        rx5.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.m.j(str, D, b2);
        sw5Var.a();
    }

    String G() throws IOException {
        InputStream E = E("META-INF/version-control-info.textproto");
        if (E == null) {
            return null;
        }
        rx5.f().b("Read version control info");
        return Base64.encodeToString(R(E), 0);
    }

    void H(@NonNull gga ggaVar, @NonNull Thread thread, @NonNull Throwable th) {
        I(ggaVar, thread, th, false);
    }

    synchronized void I(@NonNull gga ggaVar, @NonNull Thread thread, @NonNull Throwable th, boolean z) {
        rx5 f2 = rx5.f();
        f2.b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            gvb.f(this.e.i(new b(System.currentTimeMillis(), th, thread, ggaVar, z)));
        } catch (TimeoutException unused) {
            rx5.f().d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e2) {
            rx5.f().e("Error handling uncaught exception", e2);
        }
    }

    boolean J() {
        c22 c22Var = this.n;
        if (c22Var != null && c22Var.a()) {
            return true;
        }
        return false;
    }

    List<File> L() {
        return this.g.f(t);
    }

    void Q(String str) {
        this.e.h(new g(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S() {
        try {
            String G = G();
            if (G != null) {
                U("com.crashlytics.version-control-info", G);
                rx5.f().g("Saved version control info");
            }
        } catch (IOException e2) {
            rx5.f().l("Unable to save version control info", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(String str, String str2) {
        try {
            this.d.l(str, str2);
        } catch (IllegalArgumentException e2) {
            Context context = this.a;
            if (context != null && ek1.u(context)) {
                throw e2;
            }
            rx5.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void U(String str, String str2) {
        try {
            this.d.m(str, str2);
        } catch (IllegalArgumentException e2) {
            Context context = this.a;
            if (context != null && ek1.u(context)) {
                throw e2;
            }
            rx5.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"TaskMainThread"})
    public y6b<Void> V(y6b<vfa> y6bVar) {
        if (!this.m.n()) {
            rx5.f().i("No crash reports are available to be sent.");
            this.p.e(Boolean.FALSE);
            return o7b.e(null);
        }
        rx5.f().i("Crash reports are available to be sent.");
        return W().r(new d(y6bVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(@NonNull Thread thread, @NonNull Throwable th) {
        this.e.g(new f(System.currentTimeMillis(), th, thread));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(long j, String str) {
        this.e.h(new e(j, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s() {
        if (!this.c.c()) {
            String B = B();
            if (B != null && this.j.c(B)) {
                return true;
            }
            return false;
        }
        rx5.f().i("Found previous crash marker.");
        this.c.d();
        return true;
    }

    void t(gga ggaVar) {
        u(false, ggaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, gga ggaVar) {
        this.o = ggaVar;
        Q(str);
        c22 c22Var = new c22(new a(), ggaVar, uncaughtExceptionHandler, this.j);
        this.n = c22Var;
        Thread.setDefaultUncaughtExceptionHandler(c22Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z(gga ggaVar) {
        this.e.b();
        if (J()) {
            rx5.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        rx5.f().i("Finalizing previously open sessions.");
        try {
            u(true, ggaVar);
            rx5.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e2) {
            rx5.f().e("Unable to finalize previously open sessions.", e2);
            return false;
        }
    }
}
