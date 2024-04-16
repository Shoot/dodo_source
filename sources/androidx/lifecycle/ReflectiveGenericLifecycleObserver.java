package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.a;
import androidx.lifecycle.d;
/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements g {
    private final Object a;
    private final a.C0037a b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.b = a.c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.g
    public void d(@NonNull op5 op5Var, @NonNull d.a aVar) {
        this.b.a(op5Var, aVar, this.a);
    }
}
