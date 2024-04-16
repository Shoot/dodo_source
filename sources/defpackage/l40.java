package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: AutofillTree.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Ll40;", "", "", "id", "", "value", "", "b", "(ILjava/lang/String;)Lkotlin/Unit;", "", "Lk40;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "children", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: l40  reason: default package */
/* loaded from: classes.dex */
public final class l40 {
    private final Map<Integer, k40> a = new LinkedHashMap();

    public final Map<Integer, k40> a() {
        return this.a;
    }

    public final Unit b(int i, String str) {
        Function1<String, Unit> c;
        z65.h(str, "value");
        k40 k40Var = this.a.get(Integer.valueOf(i));
        if (k40Var != null && (c = k40Var.c()) != null) {
            c.invoke(str);
            return Unit.a;
        }
        return null;
    }
}
