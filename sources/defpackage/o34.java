package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import defpackage.w34;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontRequestWorker.java */
/* renamed from: o34  reason: default package */
/* loaded from: classes.dex */
public class o34 {
    static final j36<String, Typeface> a = new j36<>(16);
    private static final ExecutorService b = qi9.a("fonts-androidx", 10, 10000);
    static final Object c = new Object();
    static final wka<String, ArrayList<xr1<e>>> d = new wka<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* renamed from: o34$a */
    /* loaded from: classes.dex */
    public class a implements Callable<e> {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;
        final /* synthetic */ n34 c;
        final /* synthetic */ int d;

        a(String str, Context context, n34 n34Var, int i) {
            this.a = str;
            this.b = context;
            this.c = n34Var;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public e call() {
            return o34.c(this.a, this.b, this.c, this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* renamed from: o34$b */
    /* loaded from: classes.dex */
    public class b implements xr1<e> {
        final /* synthetic */ om0 a;

        b(om0 om0Var) {
            this.a = om0Var;
        }

        @Override // defpackage.xr1
        /* renamed from: a */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.a.b(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* renamed from: o34$c */
    /* loaded from: classes.dex */
    public class c implements Callable<e> {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;
        final /* synthetic */ n34 c;
        final /* synthetic */ int d;

        c(String str, Context context, n34 n34Var, int i) {
            this.a = str;
            this.b = context;
            this.c = n34Var;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public e call() {
            try {
                return o34.c(this.a, this.b, this.c, this.d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* renamed from: o34$d */
    /* loaded from: classes.dex */
    public class d implements xr1<e> {
        final /* synthetic */ String a;

        d(String str) {
            this.a = str;
        }

        @Override // defpackage.xr1
        /* renamed from: a */
        public void accept(e eVar) {
            synchronized (o34.c) {
                try {
                    wka<String, ArrayList<xr1<e>>> wkaVar = o34.d;
                    ArrayList<xr1<e>> arrayList = wkaVar.get(this.a);
                    if (arrayList == null) {
                        return;
                    }
                    wkaVar.remove(this.a);
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList.get(i).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* renamed from: o34$e */
    /* loaded from: classes.dex */
    public static final class e {
        final Typeface a;
        final int b;

        e(int i) {
            this.a = null;
            this.b = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        public boolean a() {
            if (this.b == 0) {
                return true;
            }
            return false;
        }

        @SuppressLint({"WrongConstant"})
        e(@NonNull Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }

    private static String a(@NonNull n34 n34Var, int i) {
        return n34Var.d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    private static int b(@NonNull w34.a aVar) {
        int i = 1;
        if (aVar.c() != 0) {
            if (aVar.c() != 1) {
                return -3;
            }
            return -2;
        }
        w34.b[] b2 = aVar.b();
        if (b2 != null && b2.length != 0) {
            i = 0;
            for (w34.b bVar : b2) {
                int b3 = bVar.b();
                if (b3 != 0) {
                    if (b3 < 0) {
                        return -3;
                    }
                    return b3;
                }
            }
        }
        return i;
    }

    @NonNull
    static e c(@NonNull String str, @NonNull Context context, @NonNull n34 n34Var, int i) {
        j36<String, Typeface> j36Var = a;
        Typeface d2 = j36Var.d(str);
        if (d2 != null) {
            return new e(d2);
        }
        try {
            w34.a e2 = m34.e(context, n34Var, null);
            int b2 = b(e2);
            if (b2 != 0) {
                return new e(b2);
            }
            Typeface b3 = hob.b(context, null, e2.b(), i);
            if (b3 != null) {
                j36Var.e(str, b3);
                return new e(b3);
            }
            return new e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface d(@NonNull Context context, @NonNull n34 n34Var, int i, Executor executor, @NonNull om0 om0Var) {
        String a2 = a(n34Var, i);
        Typeface d2 = a.d(a2);
        if (d2 != null) {
            om0Var.b(new e(d2));
            return d2;
        }
        b bVar = new b(om0Var);
        synchronized (c) {
            try {
                wka<String, ArrayList<xr1<e>>> wkaVar = d;
                ArrayList<xr1<e>> arrayList = wkaVar.get(a2);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList<xr1<e>> arrayList2 = new ArrayList<>();
                arrayList2.add(bVar);
                wkaVar.put(a2, arrayList2);
                c cVar = new c(a2, context, n34Var, i);
                if (executor == null) {
                    executor = b;
                }
                qi9.b(executor, cVar, new d(a2));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface e(@NonNull Context context, @NonNull n34 n34Var, @NonNull om0 om0Var, int i, int i2) {
        String a2 = a(n34Var, i);
        Typeface d2 = a.d(a2);
        if (d2 != null) {
            om0Var.b(new e(d2));
            return d2;
        } else if (i2 == -1) {
            e c2 = c(a2, context, n34Var, i);
            om0Var.b(c2);
            return c2.a;
        } else {
            try {
                e eVar = (e) qi9.c(b, new a(a2, context, n34Var, i), i2);
                om0Var.b(eVar);
                return eVar.a;
            } catch (InterruptedException unused) {
                om0Var.b(new e(-3));
                return null;
            }
        }
    }
}
