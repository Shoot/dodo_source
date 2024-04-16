package defpackage;

import androidx.lifecycle.r;
import androidx.lifecycle.s;
/* compiled from: ViewModelProvider.kt */
/* renamed from: tzb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tzb {
    public static r a(s.b bVar, Class cls) {
        z65.h(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static r b(s.b bVar, Class cls, n22 n22Var) {
        z65.h(cls, "modelClass");
        z65.h(n22Var, "extras");
        return bVar.a(cls);
    }
}
