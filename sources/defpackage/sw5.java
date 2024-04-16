package defpackage;

import java.io.File;
/* compiled from: LogFileManager.java */
/* renamed from: sw5  reason: default package */
/* loaded from: classes2.dex */
public class sw5 {
    private static final b c = new b();
    private final hu3 a;
    private au3 b;

    public sw5(hu3 hu3Var) {
        this.a = hu3Var;
        this.b = c;
    }

    private File d(String str) {
        return this.a.o(str, "userlog");
    }

    public void a() {
        this.b.d();
    }

    public byte[] b() {
        return this.b.c();
    }

    public String c() {
        return this.b.b();
    }

    public final void e(String str) {
        this.b.a();
        this.b = c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(File file, int i) {
        this.b = new av8(file, i);
    }

    public void g(long j, String str) {
        this.b.e(j, str);
    }

    public sw5(hu3 hu3Var, String str) {
        this(hu3Var);
        e(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LogFileManager.java */
    /* renamed from: sw5$b */
    /* loaded from: classes2.dex */
    public static final class b implements au3 {
        private b() {
        }

        @Override // defpackage.au3
        public String b() {
            return null;
        }

        @Override // defpackage.au3
        public byte[] c() {
            return null;
        }

        @Override // defpackage.au3
        public void a() {
        }

        @Override // defpackage.au3
        public void d() {
        }

        @Override // defpackage.au3
        public void e(long j, String str) {
        }
    }
}
