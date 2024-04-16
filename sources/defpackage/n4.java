package defpackage;

import java.util.Map;
import kotlin.Metadata;
/* compiled from: AcquirerFactoryFacade.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Ln4;", "Lm4;", "", "acquirerCode", "Ll4;", "a", "Lm4;", "acquirerFactory", "", "Lzo0;", "b", "Ljava/util/Map;", "acquirerEncryptors", "<init>", "(Lm4;Ljava/util/Map;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: n4  reason: default package */
/* loaded from: classes4.dex */
public final class n4 implements m4 {
    private final m4 a;
    private final Map<String, zo0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public n4(m4 m4Var, Map<String, ? extends zo0> map) {
        z65.h(m4Var, "acquirerFactory");
        z65.h(map, "acquirerEncryptors");
        this.a = m4Var;
        this.b = map;
    }

    @Override // defpackage.m4
    public l4 a(String str) {
        z65.h(str, "acquirerCode");
        if (z65.c(str, "PaymentsOS")) {
            zo0 zo0Var = this.b.get("PaymentsOS");
            if (zo0Var != null) {
                return new fx7(zo0Var);
            }
            throw new IllegalArgumentException("Encryptor for " + str + " acquirer not found");
        }
        return this.a.a(str);
    }
}
