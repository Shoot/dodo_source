package defpackage;

import defpackage.kl8;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: ComboTemplateProduct.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\u0018\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0007"}, d2 = {"Lfl8;", "", "", "hotAndReadyList", "", "a", "b", "common"}, k = 2, mv = {1, 9, 0})
/* renamed from: bj1  reason: default package */
/* loaded from: classes.dex */
public final class bj1 {
    public static final boolean a(fl8 fl8Var, Collection<String> collection) {
        z65.h(fl8Var, "<this>");
        z65.h(collection, "hotAndReadyList");
        if (kl8.a.a.a(fl8Var.e()) == kl8.h && !collection.contains(fl8Var.getId())) {
            return false;
        }
        return true;
    }

    public static final boolean b(fl8 fl8Var, Collection<String> collection) {
        z65.h(fl8Var, "<this>");
        z65.h(collection, "hotAndReadyList");
        return !a(fl8Var, collection);
    }
}
