package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: KmsClients.java */
/* renamed from: dh5  reason: default package */
/* loaded from: classes2.dex */
public final class dh5 {
    private static final CopyOnWriteArrayList<ch5> a = new CopyOnWriteArrayList<>();

    public static ch5 a(String str) throws GeneralSecurityException {
        Iterator<ch5> it = a.iterator();
        while (it.hasNext()) {
            ch5 next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
