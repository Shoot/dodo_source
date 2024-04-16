package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.f;
import defpackage.mm6;
import defpackage.uk2;
import java.io.File;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DataCacheGenerator.java */
/* loaded from: classes.dex */
public class c implements f, uk2.a<Object> {
    private final List<se5> a;
    private final g<?> b;
    private final f.a c;
    private int d;
    private se5 e;
    private List<mm6<File, ?>> f;
    private int g;
    private volatile mm6.a<?> h;
    private File i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean a() {
        if (this.g < this.f.size()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (a() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        r0 = r7.f;
        r3 = r7.g;
        r7.g = r3 + 1;
        r7.h = r0.get(r3).b(r7.i, r7.b.t(), r7.b.f(), r7.b.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r7.h == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (r7.b.u(r7.h.c.a()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        r7.h.c.d(r7.b.l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        r7.h = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r2 != false) goto L30;
     */
    @Override // com.bumptech.glide.load.engine.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            defpackage.fg4.a(r0)
        L5:
            java.util.List<mm6<java.io.File, ?>> r0 = r7.f     // Catch: java.lang.Throwable -> L68
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6e
            boolean r0 = r7.a()     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L12
            goto L6e
        L12:
            r0 = 0
            r7.h = r0     // Catch: java.lang.Throwable -> L68
        L15:
            if (r2 != 0) goto L6a
            boolean r0 = r7.a()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L6a
            java.util.List<mm6<java.io.File, ?>> r0 = r7.f     // Catch: java.lang.Throwable -> L68
            int r3 = r7.g     // Catch: java.lang.Throwable -> L68
            int r4 = r3 + 1
            r7.g = r4     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L68
            mm6 r0 = (defpackage.mm6) r0     // Catch: java.lang.Throwable -> L68
            java.io.File r3 = r7.i     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r4 = r7.b     // Catch: java.lang.Throwable -> L68
            int r4 = r4.t()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r5 = r7.b     // Catch: java.lang.Throwable -> L68
            int r5 = r5.f()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r6 = r7.b     // Catch: java.lang.Throwable -> L68
            ac7 r6 = r6.k()     // Catch: java.lang.Throwable -> L68
            mm6$a r0 = r0.b(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L68
            r7.h = r0     // Catch: java.lang.Throwable -> L68
            mm6$a<?> r0 = r7.h     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            com.bumptech.glide.load.engine.g<?> r0 = r7.b     // Catch: java.lang.Throwable -> L68
            mm6$a<?> r3 = r7.h     // Catch: java.lang.Throwable -> L68
            uk2<Data> r3 = r3.c     // Catch: java.lang.Throwable -> L68
            java.lang.Class r3 = r3.a()     // Catch: java.lang.Throwable -> L68
            boolean r0 = r0.u(r3)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            mm6$a<?> r0 = r7.h     // Catch: java.lang.Throwable -> L68
            uk2<Data> r0 = r0.c     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r2 = r7.b     // Catch: java.lang.Throwable -> L68
            yj8 r2 = r2.l()     // Catch: java.lang.Throwable -> L68
            r0.d(r2, r7)     // Catch: java.lang.Throwable -> L68
            r2 = 1
            goto L15
        L68:
            r0 = move-exception
            goto Lb0
        L6a:
            defpackage.fg4.e()
            return r2
        L6e:
            int r0 = r7.d     // Catch: java.lang.Throwable -> L68
            int r0 = r0 + r1
            r7.d = r0     // Catch: java.lang.Throwable -> L68
            java.util.List<se5> r1 = r7.a     // Catch: java.lang.Throwable -> L68
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L68
            if (r0 < r1) goto L7f
            defpackage.fg4.e()
            return r2
        L7f:
            java.util.List<se5> r0 = r7.a     // Catch: java.lang.Throwable -> L68
            int r1 = r7.d     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L68
            se5 r0 = (defpackage.se5) r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r1 = new com.bumptech.glide.load.engine.d     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r3 = r7.b     // Catch: java.lang.Throwable -> L68
            se5 r3 = r3.p()     // Catch: java.lang.Throwable -> L68
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r3 = r7.b     // Catch: java.lang.Throwable -> L68
            b33 r3 = r3.d()     // Catch: java.lang.Throwable -> L68
            java.io.File r1 = r3.a(r1)     // Catch: java.lang.Throwable -> L68
            r7.i = r1     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L5
            r7.e = r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r0 = r7.b     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = r0.j(r1)     // Catch: java.lang.Throwable -> L68
            r7.f = r0     // Catch: java.lang.Throwable -> L68
            r7.g = r2     // Catch: java.lang.Throwable -> L68
            goto L5
        Lb0:
            defpackage.fg4.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.c.b():boolean");
    }

    @Override // defpackage.uk2.a
    public void c(@NonNull Exception exc) {
        this.c.a(this.e, exc, this.h.c, dl2.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        mm6.a<?> aVar = this.h;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // defpackage.uk2.a
    public void f(Object obj) {
        this.c.h(this.e, obj, this.h.c, dl2.DATA_DISK_CACHE, this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(List<se5> list, g<?> gVar, f.a aVar) {
        this.d = -1;
        this.a = list;
        this.b = gVar;
        this.c = aVar;
    }
}
