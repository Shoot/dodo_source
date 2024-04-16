package defpackage;

import defpackage.ia0;
/* compiled from: MapProperty.java */
/* renamed from: v66  reason: default package */
/* loaded from: classes2.dex */
public class v66 extends gr8 {
    private static final ia0 h = new ia0.a();
    protected final bob b;
    protected final ia0 c;
    protected Object d;
    protected Object e;
    protected gc5<Object> f;
    protected gc5<Object> g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v66(defpackage.bob r2, defpackage.ia0 r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L5
            uq8 r0 = defpackage.uq8.j
            goto L9
        L5:
            uq8 r0 = r3.getMetadata()
        L9:
            r1.<init>(r0)
            r1.b = r2
            if (r3 != 0) goto L12
            ia0 r3 = defpackage.v66.h
        L12:
            r1.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v66.<init>(bob, ia0):void");
    }

    @Override // defpackage.ia0
    public hl c() {
        return this.c.c();
    }

    public void d(Object obj, Object obj2, gc5<Object> gc5Var, gc5<Object> gc5Var2) {
        this.d = obj;
        this.e = obj2;
        this.f = gc5Var;
        this.g = gc5Var2;
    }

    @Override // defpackage.ia0
    public y85 getType() {
        return this.c.getType();
    }
}
