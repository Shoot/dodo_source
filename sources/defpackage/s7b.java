package defpackage;

import defpackage.et7;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.adapter.TaxPayerIdVH;
/* compiled from: TaxPayerIdBinder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0015\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J.\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Ls7b;", "Loyb;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/adapter/TaxPayerIdVH;", "Let7$d;", "view", "data", "", "position", "", "g", "", "", "changes", "f", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "onClick", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: s7b  reason: default package */
/* loaded from: classes4.dex */
public final class s7b extends oyb<TaxPayerIdVH, et7.d> {
    public static final a b = new a(null);
    private final Function0<Unit> a;

    /* compiled from: TaxPayerIdBinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Ls7b$a;", "", "", "LOADING_CHANGED", "Ljava/lang/String;", "TAX_PAYER_ID_CHANGED", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: s7b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public s7b(Function0<Unit> function0) {
        z65.h(function0, "onClick");
        this.a = function0;
    }

    @Override // defpackage.oyb
    /* renamed from: f */
    public void a(TaxPayerIdVH taxPayerIdVH, et7.d dVar, int i, List<? extends Object> list) {
        z65.h(taxPayerIdVH, "view");
        z65.h(dVar, "data");
        z65.h(list, "changes");
        if (list.contains("loading_changed")) {
            taxPayerIdVH.setLoading(dVar.c());
        }
        if (list.contains("tax_payer_id_changed")) {
            taxPayerIdVH.setTaxPayerId(dVar.b());
        }
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(TaxPayerIdVH taxPayerIdVH, et7.d dVar, int i) {
        z65.h(taxPayerIdVH, "view");
        z65.h(dVar, "data");
        taxPayerIdVH.setTaxPayerId(dVar.b());
        taxPayerIdVH.setOnClickListener(this.a);
        taxPayerIdVH.setLoading(dVar.c());
    }
}
