package defpackage;

import defpackage.bi8;
import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: PreferencesFactory.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\u0007\u001a\u00020\u00062\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbi8;", "a", "()Lbi8;", "", "Lbi8$b;", "pairs", "Luq6;", "b", "([Lbi8$b;)Luq6;", "datastore-preferences-core"}, k = 2, mv = {1, 5, 1})
/* renamed from: di8  reason: default package */
/* loaded from: classes.dex */
public final class di8 {
    public static final bi8 a() {
        return new uq6(null, true, 1, null);
    }

    public static final uq6 b(bi8.b<?>... bVarArr) {
        z65.h(bVarArr, "pairs");
        uq6 uq6Var = new uq6(null, false, 1, null);
        uq6Var.g((bi8.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        return uq6Var;
    }
}
