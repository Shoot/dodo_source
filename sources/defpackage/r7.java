package defpackage;

import java.util.Map;
import kotlin.Metadata;
/* compiled from: AddressFieldFinderExt.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u001a\u001e\u0010\u0007\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\b"}, d2 = {"", "", "Lm54;", "Lbza;", "a", "Ln7;", "addressElement", "b", "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: r7  reason: default package */
/* loaded from: classes4.dex */
public final class r7 {
    public static final bza a(Map<String, ? extends m54> map) {
        ss3 ss3Var;
        z65.h(map, "<this>");
        m54 m54Var = map.get(n7.b.getValue());
        eza ezaVar = null;
        if (m54Var != null) {
            ss3Var = m54Var.d();
        } else {
            ss3Var = null;
        }
        if (ss3Var instanceof eza) {
            ezaVar = (eza) ss3Var;
        }
        if (ezaVar != null) {
            return new bza(ezaVar.e(), ezaVar.f(), ezaVar.d());
        }
        bza bzaVar = bza.d;
        z65.g(bzaVar, "DEFAULT");
        return bzaVar;
    }

    public static final String b(Map<String, ? extends m54> map, n7 n7Var) {
        String str;
        ss3 d;
        z65.h(map, "<this>");
        z65.h(n7Var, "addressElement");
        m54 m54Var = map.get(n7Var.getValue());
        if (m54Var != null && (d = m54Var.d()) != null) {
            str = d.c();
        } else {
            str = null;
        }
        return (String) mh5.c(str, "");
    }
}
