package moxy.ktx;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import moxy.MvpDelegate;
import moxy.MvpDelegateHolder;
import moxy.MvpPresenter;
/* compiled from: Delegates.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a@\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0003*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\b\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"moxyPresenter", "Lmoxy/ktx/MoxyKtxDelegate;", "T", "Lmoxy/MvpPresenter;", "Lmoxy/MvpDelegateHolder;", Action.NAME_ATTRIBUTE, "", "factory", "Lkotlin/Function0;", "moxy-ktx"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class DelegatesKt {
    public static final /* synthetic */ <T extends MvpPresenter<?>> MoxyKtxDelegate<T> moxyPresenter(MvpDelegateHolder mvpDelegateHolder, String str, Function0<? extends T> function0) {
        z65.h(mvpDelegateHolder, "$this$moxyPresenter");
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(function0, "factory");
        MvpDelegate mvpDelegate = mvpDelegateHolder.getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        StringBuilder sb = new StringBuilder();
        z65.n(4, "T");
        sb.append(MvpPresenter.class.getName());
        sb.append(".");
        sb.append(str);
        return new MoxyKtxDelegate<>(mvpDelegate, sb.toString(), function0);
    }

    public static /* synthetic */ MoxyKtxDelegate moxyPresenter$default(MvpDelegateHolder mvpDelegateHolder, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "presenter";
        }
        z65.h(mvpDelegateHolder, "$this$moxyPresenter");
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(function0, "factory");
        MvpDelegate mvpDelegate = mvpDelegateHolder.getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        StringBuilder sb = new StringBuilder();
        z65.n(4, "T");
        sb.append(MvpPresenter.class.getName());
        sb.append(".");
        sb.append(str);
        return new MoxyKtxDelegate(mvpDelegate, sb.toString(), function0);
    }
}
