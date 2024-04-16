package defpackage;

import android.content.Context;
import android.util.Log;
import com.getkeepsafe.relinker.MissingLibraryException;
import defpackage.g79;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
/* compiled from: ReLinkerInstance.java */
/* renamed from: h79  reason: default package */
/* loaded from: classes2.dex */
public class h79 {
    protected final Set<String> a;
    protected final g79.b b;
    protected final g79.a c;
    protected boolean d;
    protected boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReLinkerInstance.java */
    /* renamed from: h79$a */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        a(Context context, String str, String str2, g79.c cVar) {
            this.a = context;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                h79.this.g(this.a, this.b, this.c);
                throw null;
            } catch (MissingLibraryException unused) {
                throw null;
            } catch (UnsatisfiedLinkError unused2) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReLinkerInstance.java */
    /* renamed from: h79$b */
    /* loaded from: classes2.dex */
    public class b implements FilenameFilter {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h79() {
        this(new a5b(), new pm());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Context context, String str, String str2) {
        if (this.a.contains(str) && !this.d) {
            i("%s already loaded previously!", str);
            return;
        }
        try {
            this.b.a(str);
            this.a.add(str);
            i("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e) {
            i("Loading the library normally failed: %s", Log.getStackTraceString(e));
            i("%s (%s) was not loaded normally, re-linking...", str, str2);
            File d = d(context, str, str2);
            if (!d.exists() || this.d) {
                if (this.d) {
                    i("Forcing a re-link of %s (%s)...", str, str2);
                }
                b(context, str, str2);
                this.c.a(context, this.b.d(), this.b.b(str), d, this);
            }
            try {
                if (this.e) {
                    af3 af3Var = null;
                    try {
                        af3 af3Var2 = new af3(d);
                        try {
                            List<String> c = af3Var2.c();
                            af3Var2.close();
                            for (String str3 : c) {
                                e(context, this.b.c(str3));
                            }
                        } catch (Throwable th) {
                            th = th;
                            af3Var = af3Var2;
                            af3Var.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (IOException unused) {
            }
            this.b.e(d.getAbsolutePath());
            this.a.add(str);
            i("%s (%s) was re-linked!", str, str2);
        }
    }

    protected void b(Context context, String str, String str2) {
        File c = c(context);
        File d = d(context, str, str2);
        File[] listFiles = c.listFiles(new b(this.b.b(str)));
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (this.d || !file.getAbsolutePath().equals(d.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    protected File c(Context context) {
        return context.getDir("lib", 0);
    }

    protected File d(Context context, String str, String str2) {
        String b2 = this.b.b(str);
        if (zcb.a(str2)) {
            return new File(c(context), b2);
        }
        File c = c(context);
        return new File(c, b2 + "." + str2);
    }

    public void e(Context context, String str) {
        f(context, str, null, null);
    }

    public void f(Context context, String str, String str2, g79.c cVar) {
        if (context != null) {
            if (!zcb.a(str)) {
                i("Beginning load of %s...", str);
                if (cVar == null) {
                    g(context, str, str2);
                    return;
                } else {
                    new Thread(new a(context, str, str2, cVar)).start();
                    return;
                }
            }
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        throw new IllegalArgumentException("Given context is null");
    }

    public void i(String str, Object... objArr) {
        h(String.format(Locale.US, str, objArr));
    }

    protected h79(g79.b bVar, g79.a aVar) {
        this.a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.b = bVar;
        this.c = aVar;
    }

    public void h(String str) {
    }
}
