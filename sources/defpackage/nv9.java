package defpackage;

import defpackage.mv9;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ScheduleExtension.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Lmv9;", "Lmv9$a;", "day", "b", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: nv9  reason: default package */
/* loaded from: classes4.dex */
public final class nv9 {
    public static final mv9.a a(mv9 mv9Var, mv9.a aVar) {
        Object Z;
        z65.h(mv9Var, "<this>");
        z65.h(aVar, "day");
        int indexOf = mv9Var.a().indexOf(aVar) + 1;
        if (indexOf >= mv9Var.a().size()) {
            List<mv9.a> a = mv9Var.a();
            z65.g(a, "getDays(...)");
            Z = sc1.Z(a);
            z65.g(Z, "first(...)");
            return (mv9.a) Z;
        }
        mv9.a aVar2 = mv9Var.a().get(indexOf);
        z65.g(aVar2, "get(...)");
        return aVar2;
    }

    public static final mv9.a b(mv9 mv9Var, mv9.a aVar) {
        Object k0;
        z65.h(mv9Var, "<this>");
        z65.h(aVar, "day");
        int indexOf = mv9Var.a().indexOf(aVar) - 1;
        if (indexOf < 0) {
            List<mv9.a> a = mv9Var.a();
            z65.g(a, "getDays(...)");
            k0 = sc1.k0(a);
            z65.g(k0, "last(...)");
            return (mv9.a) k0;
        }
        mv9.a aVar2 = mv9Var.a().get(indexOf);
        z65.g(aVar2, "get(...)");
        return aVar2;
    }
}
