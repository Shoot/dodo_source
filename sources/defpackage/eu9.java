package defpackage;

import java.util.Map;
import kotlin.Metadata;
/* compiled from: EncryptionDataConverter.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ2\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\n"}, d2 = {"Leu9;", "Lph3;", "Loh3;", "encryptionData", "", "", "providerData", "a", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: eu9  reason: default package */
/* loaded from: classes2.dex */
public final class eu9 implements ph3 {
    @Override // defpackage.ph3
    public Map<String, String> a(oh3 oh3Var, Map<String, String> map) {
        Map<String, String> map2;
        Map<String, String> h;
        z65.h(map, "providerData");
        if (oh3Var != null) {
            map2 = g86.k(lnb.a("timestamp", oh3Var.f()), lnb.a("mdorder", oh3Var.c()));
        } else {
            map2 = null;
        }
        if (map2 == null) {
            h = g86.h();
            return h;
        }
        return map2;
    }
}
