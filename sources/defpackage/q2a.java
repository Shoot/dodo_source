package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: SecretKeyAccess.java */
/* renamed from: q2a  reason: default package */
/* loaded from: classes2.dex */
public final class q2a {
    private static final q2a a = new q2a();

    private q2a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q2a a() {
        return a;
    }

    public static q2a b(q2a q2aVar) throws GeneralSecurityException {
        if (q2aVar != null) {
            return q2aVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
