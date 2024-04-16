package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: KeyTemplates.java */
/* renamed from: wf5  reason: default package */
/* loaded from: classes2.dex */
public final class wf5 {
    public static uf5 a(String str) throws GeneralSecurityException {
        uf5 uf5Var = kc9.h().get(str);
        if (uf5Var != null) {
            return uf5Var;
        }
        throw new GeneralSecurityException("cannot find key template: " + str);
    }
}
