package com.dodopizza.controlling.feature.ratingapplied.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.tmb;
import kotlin.Metadata;
/* compiled from: RatingAppliedPresenter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0014J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/dodopizza/controlling/feature/ratingapplied/presentation/RatingAppliedPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Ll59;", "", "orderId", "", "v", "w", "q", "onFirstViewAttach", "", "available", "u", "r", "t", "Lmp8;", "promoVO", Image.TYPE_SMALL, "a", "Ljava/lang/String;", "b", "Z", "contactMeChecked", "Lay1;", c.a, "Lay1;", tmb.c.COUNTRY_JSON_NAME, "Lj59;", DateTokenConverter.CONVERTER_KEY, "Lj59;", "router", "Lah7;", e.a, "Lah7;", "orderRatingAutoSubmitFeatureState", "<init>", "(Ljava/lang/String;ZLay1;Lj59;Lah7;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RatingAppliedPresenter extends BasePresenter<l59> {
    private final String a;
    private final boolean b;
    private final ay1 c;
    private final j59 d;
    private final ah7 e;

    public RatingAppliedPresenter(String str, boolean z, ay1 ay1Var, j59 j59Var, ah7 ah7Var) {
        z65.h(str, "orderId");
        z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
        z65.h(j59Var, "router");
        z65.h(ah7Var, "orderRatingAutoSubmitFeatureState");
        this.a = str;
        this.b = z;
        this.c = ay1Var;
        this.d = j59Var;
        this.e = ah7Var;
    }

    private final void q() {
        ((l59) getViewState()).uf(this.c);
    }

    private final void v(String str) {
        if (bh7.a(this.e)) {
            return;
        }
        ((l59) getViewState()).s(new vm9(str, true, ck1.A));
    }

    private final void w() {
        if (this.b) {
            ((l59) getViewState()).Ud();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        v(this.a);
        q();
        w();
    }

    public final void r() {
        this.d.a();
    }

    public final void s(mp8 mp8Var) {
        z65.h(mp8Var, "promoVO");
        ((l59) getViewState()).d(mp8Var.d());
    }

    public final void t() {
        this.d.a();
    }

    public final void u(boolean z) {
        ((l59) getViewState()).H(z);
        if (z) {
            ((l59) getViewState()).ua();
        } else {
            ((l59) getViewState()).Z();
        }
    }
}
