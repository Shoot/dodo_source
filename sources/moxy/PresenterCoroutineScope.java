package moxy;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
/* compiled from: PresenterScope.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lmoxy/PresenterCoroutineScope;", "Lqx1;", "Lmoxy/OnDestroyListener;", "", "onDestroy", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "moxy-ktx"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class PresenterCoroutineScope implements qx1, OnDestroyListener {
    private final /* synthetic */ qx1 $$delegate_0 = rx1.b();

    @Override // defpackage.qx1
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // moxy.OnDestroyListener
    public void onDestroy() {
        s95.f(getCoroutineContext(), null, 1, null);
    }
}
