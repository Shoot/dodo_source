package ru.dodopizza.app.presentation.collaboration;

import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
/* compiled from: CollaborationPromoPresenter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0014J\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0005R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/dodopizza/app/presentation/collaboration/CollaborationPromoPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lnb1;", "", "imageUrl", "", "r", "Lr67;", "validationPeriod", "q", "promoCode", "t", ElementGenerator.TYPE_LINK, Image.TYPE_SMALL, "onFirstViewAttach", "w", "u", "v", "Lrb1;", "a", "Lrb1;", "collaborationPromo", "Lgc;", "b", "Lgc;", "analytics", "<init>", "(Lrb1;Lgc;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CollaborationPromoPresenter extends BasePresenter<nb1> {
    private final rb1 a;
    private final gc b;

    public CollaborationPromoPresenter(rb1 rb1Var, gc gcVar) {
        z65.h(rb1Var, "collaborationPromo");
        z65.h(gcVar, "analytics");
        this.a = rb1Var;
        this.b = gcVar;
    }

    private final void q(r67 r67Var) {
        if (r67Var.b() == null) {
            ((nb1) getViewState()).B();
        } else if (r67Var.c()) {
            Long b = r67Var.b();
            z65.e(b);
            ((nb1) getViewState()).v(b.longValue());
        } else {
            Long b2 = r67Var.b();
            z65.e(b2);
            ((nb1) getViewState()).n(b2.longValue());
        }
    }

    private final void r(String str) {
        if (str.length() > 0) {
            ((nb1) getViewState()).z(str);
        } else {
            ((nb1) getViewState()).w0();
        }
    }

    private final void s(String str) {
        if (str.length() > 0) {
            ((nb1) getViewState()).J1();
        } else {
            ((nb1) getViewState()).M2();
        }
    }

    private final void t(String str) {
        if (str.length() > 0) {
            ((nb1) getViewState()).a1(str);
        } else {
            ((nb1) getViewState()).z4();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        ((nb1) getViewState()).W2(this.a.e());
        ((nb1) getViewState()).o1();
        ((nb1) getViewState()).Pc(this.a.b());
        r(this.a.c());
        q(this.a.f());
        t(this.a.d());
        s(this.a.a());
    }

    public final void u() {
        ((nb1) getViewState()).close();
    }

    public final void v() {
        ((nb1) getViewState()).l5(this.a.d());
        ((nb1) getViewState()).g8();
        this.b.a(new fb1(this.a.d(), qb1.c));
    }

    public final void w() {
        ((nb1) getViewState()).m1(this.a.a());
        ((nb1) getViewState()).close();
        this.b.a(new hb1(this.a.getId(), this.a.e(), this.a.a(), qb1.b));
    }
}
