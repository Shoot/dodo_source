package com.dodopizza.presentation.presenters;

import kotlin.Metadata;
import moxy.MvpPresenter;
import moxy.MvpView;
import moxy.PresenterScopeKt;
/* compiled from: BasePresenter.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0004J\u0018\u0010\t\u001a\u00020\u0006\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\bH\u0004¨\u0006\f"}, d2 = {"Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lmoxy/MvpView;", "View", "Lmoxy/MvpPresenter;", "T", "Loz3;", "Ll95;", "o", "Lwx;", "p", "<init>", "()V", "presentation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class BasePresenter<View extends MvpView> extends MvpPresenter<View> {
    /* JADX INFO: Access modifiers changed from: protected */
    public final <T> l95 o(oz3<? extends T> oz3Var) {
        z65.h(oz3Var, "<this>");
        return wz3.C(oz3Var, PresenterScopeKt.getPresenterScope(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <T> l95 p(wx<? extends T> wxVar) {
        z65.h(wxVar, "<this>");
        return wj1.b(wxVar, PresenterScopeKt.getPresenterScope(this));
    }
}
