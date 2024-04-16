package defpackage;

import com.appsflyer.AppsFlyerProperties;
import defpackage.lba;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Produce.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014R\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcl8;", "E", "Ltv0;", "Ldl8;", "", "value", "h1", "(Lkotlin/Unit;)V", "", "cause", "", "handled", "d1", "b", "()Z", "isActive", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lrv0;", AppsFlyerProperties.CHANNEL, "<init>", "(Lkotlin/coroutines/CoroutineContext;Lrv0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: cl8  reason: default package */
/* loaded from: classes3.dex */
public final class cl8<E> extends tv0<E> implements dl8<E> {
    public cl8(CoroutineContext coroutineContext, rv0<E> rv0Var) {
        super(coroutineContext, rv0Var, true, true);
    }

    @Override // defpackage.e1, defpackage.v95, defpackage.l95
    public boolean b() {
        return super.b();
    }

    @Override // defpackage.e1
    protected void d1(Throwable th, boolean z) {
        if (!g1().v(th) && !z) {
            nx1.a(getContext(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.e1
    /* renamed from: h1 */
    public void e1(Unit unit) {
        lba.a.a(g1(), null, 1, null);
    }
}
