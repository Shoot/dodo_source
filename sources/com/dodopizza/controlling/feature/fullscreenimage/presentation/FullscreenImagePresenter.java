package com.dodopizza.controlling.feature.fullscreenimage.presentation;

import com.dodopizza.controlling.feature.fullscreenimage.presentation.a;
import kotlin.Metadata;
import moxy.MvpPresenter;
/* compiled from: FullscreenImagePresenter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/dodopizza/controlling/feature/fullscreenimage/presentation/FullscreenImagePresenter;", "Lmoxy/MvpPresenter;", "Lf84;", "Lcom/dodopizza/controlling/feature/fullscreenimage/presentation/a;", "result", "", "o", "onFirstViewAttach", "p", "onBackPressed", "q", "Lv74;", "a", "Lv74;", "data", "Lf63;", "b", "Lf63;", "dodoRouter", "<init>", "(Lv74;Lf63;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FullscreenImagePresenter extends MvpPresenter<f84> {
    private final v74 a;
    private final f63 b;

    public FullscreenImagePresenter(v74 v74Var, f63 f63Var) {
        z65.h(v74Var, "data");
        z65.h(f63Var, "dodoRouter");
        this.a = v74Var;
        this.b = f63Var;
    }

    private final void o(a aVar) {
        this.b.i(zx8.fullscreen_image_result_id, aVar);
    }

    public final void onBackPressed() {
        o(a.C0116a.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().z(this.a.b());
        getViewState().Uf(this.a.a());
    }

    public final void p() {
        o(new a.b(this.a.b()));
    }

    public final void q() {
        o(new a.c(this.a.b()));
    }
}
