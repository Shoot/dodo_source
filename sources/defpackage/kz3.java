package defpackage;

import java.io.IOException;
/* compiled from: FloatParser.java */
/* renamed from: kz3  reason: default package */
/* loaded from: classes.dex */
public class kz3 implements jwb<Float> {
    public static final kz3 a = new kz3();

    private kz3() {
    }

    @Override // defpackage.jwb
    /* renamed from: b */
    public Float a(xb5 xb5Var, float f) throws IOException {
        return Float.valueOf(wc5.g(xb5Var) * f);
    }
}
