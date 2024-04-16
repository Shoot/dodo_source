package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import defpackage.j12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: CrashlyticsReportDataCapture.java */
/* renamed from: k12  reason: default package */
/* loaded from: classes2.dex */
public class k12 {
    private static final Map<String, Integer> g;
    static final String h;
    private final Context a;
    private final gt4 b;
    private final yn c;
    private final hta d;
    private final gga e;
    private final pk8 f = pk8.a;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        h = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.6.2");
    }

    public k12(Context context, gt4 gt4Var, yn ynVar, hta htaVar, gga ggaVar) {
        this.a = context;
        this.b = gt4Var;
        this.c = ynVar;
        this.d = htaVar;
        this.e = ggaVar;
    }

    private j12.e.d.a.c A(j12.a aVar) {
        return this.f.a(aVar.e(), aVar.d(), aVar.c());
    }

    private j12.a a(j12.a aVar) {
        List<j12.a.AbstractC0373a> list;
        if (this.e.b().b.c && this.c.c.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (lh0 lh0Var : this.c.c) {
                arrayList.add(j12.a.AbstractC0373a.a().d(lh0Var.c()).b(lh0Var.a()).c(lh0Var.b()).a());
            }
            list = Collections.unmodifiableList(arrayList);
        } else {
            list = null;
        }
        return j12.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(list).a();
    }

    private j12.b b() {
        return j12.b().k("18.6.2").g(this.c.a).h(this.b.a().c()).f(this.b.a().d()).d(this.c.f).e(this.c.g).j(4);
    }

    private static long f(long j) {
        if (j <= 0) {
            return 0L;
        }
        return j;
    }

    private static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private j12.e.d.a.b.AbstractC0377a h() {
        return j12.e.d.a.b.AbstractC0377a.a().b(0L).d(0L).c(this.c.e).e(this.c.b).a();
    }

    private List<j12.e.d.a.b.AbstractC0377a> i() {
        return Collections.singletonList(h());
    }

    private j12.e.d.a j(int i, j12.a aVar) {
        boolean z;
        if (aVar.c() != 100) {
            z = true;
        } else {
            z = false;
        }
        return j12.e.d.a.a().c(Boolean.valueOf(z)).d(A(aVar)).h(i).f(o(aVar)).a();
    }

    private j12.e.d.a k(int i, cnb cnbVar, Thread thread, int i2, int i3, boolean z) {
        Boolean bool;
        boolean z2;
        j12.e.d.a.c e = this.f.e(this.a);
        if (e.b() > 0) {
            if (e.b() != 100) {
                z2 = true;
            } else {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
        } else {
            bool = null;
        }
        return j12.e.d.a.a().c(bool).d(e).b(this.f.d(this.a)).h(i).f(p(cnbVar, thread, i2, i3, z)).a();
    }

    private j12.e.d.c l(int i) {
        Double d;
        ba0 a = ba0.a(this.a);
        Float b = a.b();
        if (b != null) {
            d = Double.valueOf(b.doubleValue());
        } else {
            d = null;
        }
        int c = a.c();
        boolean n = ek1.n(this.a);
        long f = f(ek1.b(this.a) - ek1.a(this.a));
        return j12.e.d.c.a().b(d).c(c).f(n).e(i).g(f).d(ek1.c(Environment.getDataDirectory().getPath())).a();
    }

    private j12.e.d.a.b.c m(cnb cnbVar, int i, int i2) {
        return n(cnbVar, i, i2, 0);
    }

    private j12.e.d.a.b.c n(cnb cnbVar, int i, int i2, int i3) {
        String str = cnbVar.b;
        String str2 = cnbVar.a;
        StackTraceElement[] stackTraceElementArr = cnbVar.c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        cnb cnbVar2 = cnbVar.d;
        if (i3 >= i2) {
            cnb cnbVar3 = cnbVar2;
            while (cnbVar3 != null) {
                cnbVar3 = cnbVar3.d;
                i4++;
            }
        }
        j12.e.d.a.b.c.AbstractC0380a d = j12.e.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i)).d(i4);
        if (cnbVar2 != null && i4 == 0) {
            d.b(n(cnbVar2, i, i2, i3 + 1));
        }
        return d.a();
    }

    private j12.e.d.a.b o(j12.a aVar) {
        return j12.e.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    private j12.e.d.a.b p(cnb cnbVar, Thread thread, int i, int i2, boolean z) {
        return j12.e.d.a.b.a().f(z(cnbVar, thread, i, z)).d(m(cnbVar, i, i2)).e(w()).c(i()).a();
    }

    private j12.e.d.a.b.AbstractC0383e.AbstractC0385b q(StackTraceElement stackTraceElement, j12.e.d.a.b.AbstractC0383e.AbstractC0385b.AbstractC0386a abstractC0386a) {
        long j;
        long j2 = 0;
        if (stackTraceElement.isNativeMethod()) {
            j = Math.max(stackTraceElement.getLineNumber(), 0L);
        } else {
            j = 0;
        }
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j2 = stackTraceElement.getLineNumber();
        }
        return abstractC0386a.e(j).f(str).b(fileName).d(j2).a();
    }

    private List<j12.e.d.a.b.AbstractC0383e.AbstractC0385b> r(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, j12.e.d.a.b.AbstractC0383e.AbstractC0385b.a().c(i)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private j12.e.a s() {
        return j12.e.a.a().e(this.b.f()).g(this.c.f).d(this.c.g).f(this.b.a().c()).b(this.c.h.d()).c(this.c.h.e()).a();
    }

    private j12.e t(String str, long j) {
        return j12.e.a().m(j).j(str).h(h).b(s()).l(v()).e(u()).i(3).a();
    }

    private j12.e.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int g2 = g();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b = ek1.b(this.a);
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean w = ek1.w();
        int l = ek1.l();
        String str = Build.MANUFACTURER;
        return j12.e.c.a().b(g2).f(Build.MODEL).c(availableProcessors).h(b).d(blockCount).i(w).j(l).e(str).g(Build.PRODUCT).a();
    }

    private j12.e.AbstractC0390e v() {
        return j12.e.AbstractC0390e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(ek1.x()).a();
    }

    private j12.e.d.a.b.AbstractC0381d w() {
        return j12.e.d.a.b.AbstractC0381d.a().d("0").c("0").b(0L).a();
    }

    private j12.e.d.a.b.AbstractC0383e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    private j12.e.d.a.b.AbstractC0383e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        return j12.e.d.a.b.AbstractC0383e.a().d(thread.getName()).c(i).b(r(stackTraceElementArr, i)).a();
    }

    private List<j12.e.d.a.b.AbstractC0383e> z(cnb cnbVar, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, cnbVar.c, i));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(x(key, this.d.a(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public j12.e.d c(j12.a aVar) {
        int i = this.a.getResources().getConfiguration().orientation;
        return j12.e.d.a().g("anr").f(aVar.i()).b(j(i, a(aVar))).c(l(i)).a();
    }

    public j12.e.d d(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.a.getResources().getConfiguration().orientation;
        return j12.e.d.a().g(str).f(j).b(k(i3, cnb.a(th, this.d), thread, i, i2, z)).c(l(i3)).a();
    }

    public j12 e(String str, long j) {
        return b().l(t(str, j)).a();
    }
}
