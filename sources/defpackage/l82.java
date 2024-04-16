package defpackage;

import java.security.spec.ECParameterSpec;
/* renamed from: l82  reason: default package */
/* loaded from: classes3.dex */
public class l82 extends ECParameterSpec {
    private final byte[] a;
    private final la3 b;

    public byte[] a() {
        return tr.h(this.a);
    }

    public boolean equals(Object obj) {
        if (obj instanceof l82) {
            return this.b.equals(((l82) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
