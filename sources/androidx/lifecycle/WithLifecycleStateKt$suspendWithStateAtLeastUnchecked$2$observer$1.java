package androidx.lifecycle;

import androidx.lifecycle.d;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import defpackage.sk9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: WithLifecycleState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Landroidx/lifecycle/g;", "Lop5;", KustoStorage.KustoTable.COLUMN_SOURCE, "Landroidx/lifecycle/d$a;", "event", "", DateTokenConverter.CONVERTER_KEY, "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements g {
    final /* synthetic */ d.b a;
    final /* synthetic */ d b;
    final /* synthetic */ fn0<Object> c;
    final /* synthetic */ Function0<Object> d;

    @Override // androidx.lifecycle.g
    public void d(op5 op5Var, d.a aVar) {
        Object b;
        z65.h(op5Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(aVar, "event");
        if (aVar == d.a.Companion.c(this.a)) {
            this.b.d(this);
            fn0<Object> fn0Var = this.c;
            Function0<Object> function0 = this.d;
            try {
                sk9.a aVar2 = sk9.b;
                b = sk9.b(function0.invoke());
            } catch (Throwable th) {
                sk9.a aVar3 = sk9.b;
                b = sk9.b(vk9.a(th));
            }
            fn0Var.resumeWith(b);
        } else if (aVar == d.a.ON_DESTROY) {
            this.b.d(this);
            fn0<Object> fn0Var2 = this.c;
            sk9.a aVar4 = sk9.b;
            fn0Var2.resumeWith(sk9.b(vk9.a(new LifecycleDestroyedException())));
        }
    }
}
