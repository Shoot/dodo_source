package ru.dodopizza.app.presentation.selectordertype;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.selectordertype.a;
/* compiled from: SelectOrderTypePresenter.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u0006\u0010\u0005\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0003R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/dodopizza/app/presentation/selectordertype/SelectOrderTypePresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Ly6a;", "", "onFirstViewAttach", "q", "r", "Lf63;", "a", "Lf63;", "router", "Lr6a;", "b", "Lr6a;", "data", "Lgc;", c.a, "Lgc;", "analytics", "Lhq3;", DateTokenConverter.CONVERTER_KEY, "Lhq3;", "featureService", "<init>", "(Lf63;Lr6a;Lgc;Lhq3;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SelectOrderTypePresenter extends BasePresenter<y6a> {
    private final f63 a;
    private final r6a b;
    private final gc c;
    private final hq3 d;

    public SelectOrderTypePresenter(f63 f63Var, r6a r6aVar, gc gcVar, hq3 hq3Var) {
        z65.h(f63Var, "router");
        z65.h(r6aVar, "data");
        z65.h(gcVar, "analytics");
        z65.h(hq3Var, "featureService");
        this.a = f63Var;
        this.b = r6aVar;
        this.c = gcVar;
        this.d = hq3Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        this.c.a(id.b());
        if (this.d.a(bq3.Q5)) {
            ((y6a) getViewState()).Wg();
        }
    }

    public final void q() {
        this.c.a(id.a(m9a.b));
        this.a.i(this.b.a(), a.C0617a.a);
    }

    public final void r() {
        this.c.a(id.a(m9a.c));
        this.a.i(this.b.a(), a.b.a);
    }
}
