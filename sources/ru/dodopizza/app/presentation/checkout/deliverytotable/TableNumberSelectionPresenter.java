package ru.dodopizza.app.presentation.checkout.deliverytotable;

import com.dodopizza.presentation.presenters.BasePresenter;
import defpackage.a6b;
import kotlin.Metadata;
import ru.dodopizza.app.R;
/* compiled from: TableNumberSelectionPresenter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0014J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\n\u001a\u00020\u0007R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/dodopizza/app/presentation/checkout/deliverytotable/TableNumberSelectionPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "", "", "tableNumber", "", "q", "", "onFirstViewAttach", "r", "onBackPressed", "Lf63;", "a", "Lf63;", "router", "Lgc;", "b", "Lgc;", "analytics", "<init>", "(Lf63;Lgc;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TableNumberSelectionPresenter extends BasePresenter<Object> {
    private final f63 a;
    private final gc b;

    public TableNumberSelectionPresenter(f63 f63Var, gc gcVar) {
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        this.a = f63Var;
        this.b = gcVar;
    }

    private final boolean q(String str) {
        boolean y;
        if (str.length() > 0) {
            y = l0b.y(str);
            if ((!y) && new ec9("^[0-9]+$").f(str)) {
                return true;
            }
        }
        return false;
    }

    public final void onBackPressed() {
        this.a.i(R.id.select_table_number_result, a6b.b.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        this.b.a(zw9.a.d());
    }

    public final void r(String str) {
        z65.h(str, "tableNumber");
        if (q(str)) {
            this.a.i(R.id.select_table_number_result, new a6b.a(Integer.parseInt(str)));
        }
    }
}
