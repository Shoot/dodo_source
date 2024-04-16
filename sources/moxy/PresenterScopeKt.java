package moxy;

import defpackage.l95;
import kotlin.Metadata;
/* compiled from: PresenterScope.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0019\u0010\u0004\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lmoxy/MvpPresenter;", "Lqx1;", "getPresenterScope", "(Lmoxy/MvpPresenter;)Lqx1;", "presenterScope", "moxy-ktx"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class PresenterScopeKt {
    public static final qx1 getPresenterScope(MvpPresenter<?> mvpPresenter) {
        OnDestroyListener onDestroyListener;
        bl1 b;
        z65.h(mvpPresenter, "$this$presenterScope");
        OnDestroyListener onDestroyListener2 = mvpPresenter.coroutineScope;
        if (!(onDestroyListener2 instanceof qx1)) {
            onDestroyListener = null;
        } else {
            onDestroyListener = onDestroyListener2;
        }
        qx1 qx1Var = (qx1) onDestroyListener;
        if (qx1Var != null) {
            return qx1Var;
        }
        if (z65.c(onDestroyListener2, OnDestroyListener.EMPTY)) {
            b = s95.b(null, 1, null);
            l95.a.a(b, null, 1, null);
            return rx1.a(b);
        }
        PresenterCoroutineScope presenterCoroutineScope = new PresenterCoroutineScope();
        mvpPresenter.coroutineScope = presenterCoroutineScope;
        return presenterCoroutineScope;
    }
}
