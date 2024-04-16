package defpackage;

import java.security.Provider;
import java.security.Security;
/* renamed from: u40  reason: default package */
/* loaded from: classes3.dex */
public class u40 extends cs8 {
    private static volatile Provider b;

    public u40() {
        super(h());
    }

    private static synchronized Provider h() {
        synchronized (u40.class) {
            Provider provider = Security.getProvider("BC");
            if (provider instanceof ff0) {
                return provider;
            }
            if (b != null) {
                return b;
            }
            b = new ff0();
            return b;
        }
    }
}
