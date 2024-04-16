package com.dodopizza.order.feature.product.card.presentation.removeingredient;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ijb;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: RemoveIngredientsPresenter.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b \u0010!J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0014J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/removeingredient/RemoveIngredientsPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lzd9;", "", "", "removedIngredients", "", "q", "onFirstViewAttach", Image.TYPE_SMALL, "t", "Lvl8;", "productIngredientVO", "", "isRemoved", "r", "", "a", "Ljava/lang/String;", "menuItemId", "", "b", "Ljava/util/List;", "ingredients", "Lgc;", c.a, "Lgc;", "analytics", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Set;", "removedIngredientsIds", "<init>", "(Ljava/lang/String;Ljava/util/List;Lgc;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class RemoveIngredientsPresenter extends BasePresenter<zd9> {
    private final String a;
    private final List<vl8> b;
    private final gc c;
    private final Set<String> d;

    public RemoveIngredientsPresenter(String str, List<vl8> list, gc gcVar) {
        z65.h(str, "menuItemId");
        z65.h(list, "ingredients");
        z65.h(gcVar, "analytics");
        this.a = str;
        this.b = list;
        this.c = gcVar;
        this.d = new LinkedHashSet();
    }

    private final void q(Collection<? extends Object> collection) {
        if (!collection.isEmpty()) {
            ((zd9) getViewState()).Gb();
        } else {
            ((zd9) getViewState()).i8();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        for (vl8 vl8Var : this.b) {
            ((zd9) getViewState()).K0(vl8Var);
            if (vl8Var.c()) {
                this.d.add(vl8Var.a());
            }
        }
        q(this.d);
    }

    public final void r(vl8 vl8Var, boolean z) {
        z65.h(vl8Var, "productIngredientVO");
        if (z) {
            this.d.add(vl8Var.a());
            this.c.a(new av0(this.a, vl8Var, ijb.b.b, a88.b));
        } else {
            this.d.remove(vl8Var.a());
            this.c.a(new av0(this.a, vl8Var, ijb.a.b, a88.b));
        }
        q(this.d);
    }

    public final void s() {
        this.d.clear();
        ((zd9) getViewState()).i8();
        ((zd9) getViewState()).Qd();
    }

    public final void t() {
        ((zd9) getViewState()).Kf(this.d);
        ((zd9) getViewState()).close();
    }
}
