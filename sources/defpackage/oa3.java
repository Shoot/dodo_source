package defpackage;

import org.bouncycastle.asn1.k;
/* renamed from: oa3  reason: default package */
/* loaded from: classes3.dex */
public class oa3 {
    public static eb3 a(String str) {
        iac d = pa3.d(str);
        if (d == null) {
            try {
                d = pa3.e(new k(str));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (d == null) {
            return null;
        }
        return new eb3(str, d.t(), d.u(), d.x(), d.v(), d.z());
    }
}
