package defpackage;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: csc  reason: default package */
/* loaded from: classes2.dex */
public final class csc extends vpc {
    @Override // defpackage.vpc
    public final bpc b(String str, xzc xzcVar, List<bpc> list) {
        if (str != null && !str.isEmpty() && xzcVar.g(str)) {
            bpc a = xzcVar.a(str);
            if (a instanceof ioc) {
                return ((ioc) a).b(xzcVar, list);
            }
            throw new IllegalArgumentException(String.format("Function %s is not defined", str));
        }
        throw new IllegalArgumentException(String.format("Command not found: %s", str));
    }
}
