package com.dodopizza.auth.features.legaldocuments.presentation;

import com.dodopizza.feature.webinfo.presentation.a;
import com.dodopizza.feature.webinfo.presentation.d;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LegalDocumentsPresenter.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0014J\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/dodopizza/auth/features/legaldocuments/presentation/LegalDocumentsPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lvo5;", "Lwo5;", "legalInformation", "", "q", "", "onFirstViewAttach", "onBackPressed", "Ljq5;", "item", "r", "Lqo5;", "a", "Lqo5;", "data", "Lf63;", "b", "Lf63;", "dodoRouter", "Lhq3;", c.a, "Lhq3;", "featureService", "<init>", "(Lqo5;Lf63;Lhq3;)V", "auth_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LegalDocumentsPresenter extends BasePresenter<vo5> {
    private final qo5 a;
    private final f63 b;
    private final hq3 c;

    public LegalDocumentsPresenter(qo5 qo5Var, f63 f63Var, hq3 hq3Var) {
        z65.h(qo5Var, "data");
        z65.h(f63Var, "dodoRouter");
        z65.h(hq3Var, "featureService");
        this.a = qo5Var;
        this.b = f63Var;
        this.c = hq3Var;
    }

    private final String q(wo5 wo5Var) {
        if (this.c.a(bq3.L5) && wo5Var.c() == 10) {
            return "personal_data_title";
        }
        return wo5Var.b();
    }

    public final void onBackPressed() {
        this.b.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        int w;
        Object dcbVar;
        List<wo5> a = this.a.a();
        w = lc1.w(a, 10);
        ArrayList arrayList = new ArrayList(w);
        for (wo5 wo5Var : a) {
            if (wo5Var.d().length() > 0) {
                dcbVar = new jq5(q(wo5Var), wo5Var.d());
            } else {
                dcbVar = new dcb(wo5Var.a());
            }
            arrayList.add(dcbVar);
        }
        ((vo5) getViewState()).Cf(arrayList);
    }

    public final void r(jq5 jq5Var) {
        z65.h(jq5Var, "item");
        this.b.e(d.a(new com.dodopizza.feature.webinfo.presentation.a(jq5Var.a(), jq5Var.b(), (a.InterfaceC0123a) null, 4, (DefaultConstructorMarker) null)));
    }
}
