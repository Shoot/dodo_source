package com.dodopizza.presentation.presenters;

import kotlin.Metadata;
import moxy.MvpPresenter;
import moxy.MvpView;
/* compiled from: BasePresenter2.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\tR$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0004@BX\u0084.¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/dodopizza/presentation/presenters/BasePresenter2;", "Lmoxy/MvpView;", "View", "Lmoxy/MvpPresenter;", "", "p", "q", "view", "attachView", "(Lmoxy/MvpView;)V", "detachView", "Lqx1;", "<set-?>", "a", "Lqx1;", "o", "()Lqx1;", "attachedViewScope", "<init>", "()V", "presentation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class BasePresenter2<View extends MvpView> extends MvpPresenter<View> {
    private qx1 a;

    @Override // moxy.MvpPresenter
    public final void attachView(View view) {
        this.a = rx1.b();
        super.attachView(view);
        p();
    }

    @Override // moxy.MvpPresenter
    public final void detachView(View view) {
        rx1.d(o(), null, 1, null);
        super.detachView(view);
        q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final qx1 o() {
        qx1 qx1Var = this.a;
        if (qx1Var != null) {
            return qx1Var;
        }
        z65.z("attachedViewScope");
        return null;
    }

    protected void p() {
    }

    protected void q() {
    }
}
