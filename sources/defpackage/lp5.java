package defpackage;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.d;
import kotlin.Metadata;
/* compiled from: Lifecycle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/d;", "Lip5;", "a", "(Landroidx/lifecycle/d;)Lip5;", "coroutineScope", "lifecycle-common"}, k = 2, mv = {1, 8, 0})
/* renamed from: lp5  reason: default package */
/* loaded from: classes.dex */
public final class lp5 {
    public static final ip5 a(d dVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        z65.h(dVar, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) dVar.c().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(dVar, k2b.b(null, 1, null).P(v33.c().p0()));
        } while (!ho1.a(dVar.c(), null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.c();
        return lifecycleCoroutineScopeImpl;
    }
}
