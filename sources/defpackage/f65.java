package defpackage;

import java.io.IOException;
/* compiled from: IntegerParser.java */
/* renamed from: f65  reason: default package */
/* loaded from: classes.dex */
public class f65 implements jwb<Integer> {
    public static final f65 a = new f65();

    private f65() {
    }

    @Override // defpackage.jwb
    /* renamed from: b */
    public Integer a(xb5 xb5Var, float f) throws IOException {
        return Integer.valueOf(Math.round(wc5.g(xb5Var) * f));
    }
}
