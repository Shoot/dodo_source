package defpackage;

import java.io.IOException;
/* compiled from: FailingSerializer.java */
/* renamed from: vo3  reason: default package */
/* loaded from: classes2.dex */
public class vo3 extends cxa<Object> {
    protected final String c;

    public vo3(String str) {
        super(Object.class);
        this.c = str;
    }

    @Override // defpackage.cxa, defpackage.gc5
    public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
        bdaVar.R0(this.c, new Object[0]);
    }
}
