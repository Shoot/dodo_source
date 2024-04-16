package defpackage;

import java.io.IOException;
/* compiled from: UnsupportedTypeSerializer.java */
/* renamed from: lrb  reason: default package */
/* loaded from: classes2.dex */
public class lrb extends cxa<Object> {
    protected final y85 c;
    protected final String d;

    public lrb(y85 y85Var, String str) {
        super(Object.class);
        this.c = y85Var;
        this.d = str;
    }

    @Override // defpackage.cxa, defpackage.gc5
    public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
        bdaVar.k(this.c, this.d);
    }
}
