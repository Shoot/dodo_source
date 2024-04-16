package defpackage;

import androidx.annotation.NonNull;
import defpackage.xw1;
/* compiled from: ListItemSpanFactory.java */
/* renamed from: cr5  reason: default package */
/* loaded from: classes3.dex */
public class cr5 implements tqa {
    @Override // defpackage.tqa
    public Object a(@NonNull s86 s86Var, @NonNull dg9 dg9Var) {
        if (xw1.a.BULLET == xw1.a.d(dg9Var)) {
            return new uh0(s86Var.g(), xw1.b.d(dg9Var).intValue());
        }
        return new zl7(s86Var.g(), String.valueOf(xw1.c.d(dg9Var)) + ". ");
    }
}
