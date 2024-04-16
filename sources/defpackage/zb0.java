package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import defpackage.ew6;
import defpackage.s58;
import defpackage.si9;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BitmapHunter.java */
/* renamed from: zb0  reason: default package */
/* loaded from: classes3.dex */
public class zb0 implements Runnable {
    private static final Object t = new Object();
    private static final ThreadLocal<StringBuilder> u = new a();
    private static final AtomicInteger v = new AtomicInteger();
    private static final si9 w = new b();
    final int a = v.incrementAndGet();
    final s58 b;
    final s33 c;
    final jl0 d;
    final pwa e;
    final String f;
    final gi9 g;
    final int h;
    int i;
    final si9 j;
    s4 k;
    List<s4> l;
    Bitmap m;
    Future<?> n;
    s58.e o;
    Exception p;
    int q;
    int r;
    s58.f s;

    /* compiled from: BitmapHunter.java */
    /* renamed from: zb0$a */
    /* loaded from: classes3.dex */
    static class a extends ThreadLocal<StringBuilder> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* compiled from: BitmapHunter.java */
    /* renamed from: zb0$b */
    /* loaded from: classes3.dex */
    static class b extends si9 {
        b() {
        }

        @Override // defpackage.si9
        public boolean c(gi9 gi9Var) {
            return true;
        }

        @Override // defpackage.si9
        public si9.a f(gi9 gi9Var, int i) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + gi9Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BitmapHunter.java */
    /* renamed from: zb0$c */
    /* loaded from: classes3.dex */
    public static class c implements Runnable {
        final /* synthetic */ skb a;
        final /* synthetic */ RuntimeException b;

        c(skb skbVar, RuntimeException runtimeException) {
            this.a = skbVar;
            this.b = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException("Transformation " + this.a.key() + " crashed with exception.", this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BitmapHunter.java */
    /* renamed from: zb0$d */
    /* loaded from: classes3.dex */
    public static class d implements Runnable {
        final /* synthetic */ StringBuilder a;

        d(StringBuilder sb) {
            this.a = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new NullPointerException(this.a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BitmapHunter.java */
    /* renamed from: zb0$e */
    /* loaded from: classes3.dex */
    public static class e implements Runnable {
        final /* synthetic */ skb a;

        e(skb skbVar) {
            this.a = skbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.a.key() + " returned input Bitmap but recycled it.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BitmapHunter.java */
    /* renamed from: zb0$f */
    /* loaded from: classes3.dex */
    public static class f implements Runnable {
        final /* synthetic */ skb a;

        f(skb skbVar) {
            this.a = skbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.a.key() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    zb0(s58 s58Var, s33 s33Var, jl0 jl0Var, pwa pwaVar, s4 s4Var, si9 si9Var) {
        this.b = s58Var;
        this.c = s33Var;
        this.d = jl0Var;
        this.e = pwaVar;
        this.k = s4Var;
        this.f = s4Var.d();
        this.g = s4Var.i();
        this.s = s4Var.h();
        this.h = s4Var.e();
        this.i = s4Var.f();
        this.j = si9Var;
        this.r = si9Var.e();
    }

    static Bitmap a(List<skb> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            skb skbVar = list.get(i);
            try {
                Bitmap transform = skbVar.transform(bitmap);
                if (transform == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(skbVar.key());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (skb skbVar2 : list) {
                        sb.append(skbVar2.key());
                        sb.append('\n');
                    }
                    s58.o.post(new d(sb));
                    return null;
                } else if (transform == bitmap && bitmap.isRecycled()) {
                    s58.o.post(new e(skbVar));
                    return null;
                } else if (transform != bitmap && !bitmap.isRecycled()) {
                    s58.o.post(new f(skbVar));
                    return null;
                } else {
                    i++;
                    bitmap = transform;
                }
            } catch (RuntimeException e2) {
                s58.o.post(new c(skbVar, e2));
                return null;
            }
        }
        return bitmap;
    }

    private s58.f d() {
        boolean z;
        s58.f fVar = s58.f.LOW;
        List<s4> list = this.l;
        if (list != null && !list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        s4 s4Var = this.k;
        if (s4Var == null && !z) {
            return fVar;
        }
        if (s4Var != null) {
            fVar = s4Var.h();
        }
        if (z) {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                s58.f h = this.l.get(i).h();
                if (h.ordinal() > fVar.ordinal()) {
                    fVar = h;
                }
            }
        }
        return fVar;
    }

    static Bitmap e(pqa pqaVar, gi9 gi9Var) throws IOException {
        fh0 c2 = c77.c(pqaVar);
        boolean s = evb.s(c2);
        boolean z = gi9Var.r;
        BitmapFactory.Options d2 = si9.d(gi9Var);
        boolean g = si9.g(d2);
        if (!s) {
            InputStream z2 = c2.z();
            if (g) {
                l86 l86Var = new l86(z2);
                l86Var.a(false);
                long c3 = l86Var.c(1024);
                BitmapFactory.decodeStream(l86Var, null, d2);
                si9.b(gi9Var.h, gi9Var.i, d2, gi9Var);
                l86Var.b(c3);
                l86Var.a(true);
                z2 = l86Var;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(z2, null, d2);
            if (decodeStream != null) {
                return decodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        byte[] T0 = c2.T0();
        if (g) {
            BitmapFactory.decodeByteArray(T0, 0, T0.length, d2);
            si9.b(gi9Var.h, gi9Var.i, d2, gi9Var);
        }
        return BitmapFactory.decodeByteArray(T0, 0, T0.length, d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zb0 g(s58 s58Var, s33 s33Var, jl0 jl0Var, pwa pwaVar, s4 s4Var) {
        gi9 i = s4Var.i();
        List<si9> h = s58Var.h();
        int size = h.size();
        for (int i2 = 0; i2 < size; i2++) {
            si9 si9Var = h.get(i2);
            if (si9Var.c(i)) {
                return new zb0(s58Var, s33Var, jl0Var, pwaVar, s4Var, si9Var);
            }
        }
        return new zb0(s58Var, s33Var, jl0Var, pwaVar, s4Var, w);
    }

    static int l(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    static int m(int i) {
        if (i != 2 && i != 7 && i != 4 && i != 5) {
            return 1;
        }
        return -1;
    }

    private static boolean v(boolean z, int i, int i2, int i3, int i4) {
        if (z && ((i3 == 0 || i <= i3) && (i4 == 0 || i2 <= i4))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static android.graphics.Bitmap y(defpackage.gi9 r26, android.graphics.Bitmap r27, int r28) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb0.y(gi9, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    static void z(gi9 gi9Var) {
        String a2 = gi9Var.a();
        StringBuilder sb = u.get();
        sb.ensureCapacity(a2.length() + 8);
        sb.replace(8, sb.length(), a2);
        Thread.currentThread().setName(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(s4 s4Var) {
        boolean z = this.b.m;
        gi9 gi9Var = s4Var.b;
        if (this.k == null) {
            this.k = s4Var;
            if (z) {
                List<s4> list = this.l;
                if (list != null && !list.isEmpty()) {
                    evb.u("Hunter", "joined", gi9Var.d(), evb.l(this, "to "));
                    return;
                } else {
                    evb.u("Hunter", "joined", gi9Var.d(), "to empty hunter");
                    return;
                }
            }
            return;
        }
        if (this.l == null) {
            this.l = new ArrayList(3);
        }
        this.l.add(s4Var);
        if (z) {
            evb.u("Hunter", "joined", gi9Var.d(), evb.l(this, "to "));
        }
        s58.f h = s4Var.h();
        if (h.ordinal() > this.s.ordinal()) {
            this.s = h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        Future<?> future;
        if (this.k != null) {
            return false;
        }
        List<s4> list = this.l;
        if ((list != null && !list.isEmpty()) || (future = this.n) == null || !future.cancel(false)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r0.remove(r4) != false) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(defpackage.s4 r4) {
        /*
            r3 = this;
            s4 r0 = r3.k
            if (r0 != r4) goto L8
            r0 = 0
            r3.k = r0
            goto L12
        L8:
            java.util.List<s4> r0 = r3.l
            if (r0 == 0) goto L20
            boolean r0 = r0.remove(r4)
            if (r0 == 0) goto L20
        L12:
            s58$f r0 = r4.h()
            s58$f r1 = r3.s
            if (r0 != r1) goto L20
            s58$f r0 = r3.d()
            r3.s = r0
        L20:
            s58 r0 = r3.b
            boolean r0 = r0.m
            if (r0 == 0) goto L39
            gi9 r4 = r4.b
            java.lang.String r4 = r4.d()
            java.lang.String r0 = "from "
            java.lang.String r0 = defpackage.evb.l(r3, r0)
            java.lang.String r1 = "Hunter"
            java.lang.String r2 = "removed"
            defpackage.evb.u(r1, r2, r4, r0)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb0.f(s4):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s4 h() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<s4> i() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public gi9 j() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Exception k() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String n() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s58.e o() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s58 q() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s58.f r() {
        return this.s;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        z(this.g);
                        if (this.b.m) {
                            evb.t("Hunter", "executing", evb.k(this));
                        }
                        Bitmap t2 = t();
                        this.m = t2;
                        if (t2 == null) {
                            this.c.e(this);
                        } else {
                            this.c.d(this);
                        }
                    } catch (IOException e2) {
                        this.p = e2;
                        this.c.g(this);
                    }
                } catch (ew6.b e3) {
                    if (!dw6.a(e3.b) || e3.a != 504) {
                        this.p = e3;
                    }
                    this.c.e(this);
                }
            } catch (Exception e4) {
                this.p = e4;
                this.c.e(this);
            } catch (OutOfMemoryError e5) {
                StringWriter stringWriter = new StringWriter();
                this.e.a().a(new PrintWriter(stringWriter));
                this.p = new RuntimeException(stringWriter.toString(), e5);
                this.c.e(this);
            }
            Thread.currentThread().setName("Picasso-Idle");
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap s() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc A[Catch: all -> 0x00a7, TryCatch #1 {all -> 0x00a7, blocks: (B:38:0x009a, B:40:0x00a2, B:48:0x00c4, B:50:0x00cc, B:52:0x00da, B:53:0x00e9, B:45:0x00a9, B:47:0x00b7), top: B:62:0x009a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap t() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb0.t():android.graphics.Bitmap");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u() {
        Future<?> future = this.n;
        if (future != null && future.isCancelled()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w(boolean z, NetworkInfo networkInfo) {
        int i = this.r;
        if (i > 0) {
            this.r = i - 1;
            return this.j.h(z, networkInfo);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        return this.j.i();
    }
}
