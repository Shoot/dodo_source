package defpackage;

import com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.adapter.ComboOrderItemVH;
import defpackage.xf7;
import kotlin.Metadata;
/* compiled from: ComboOrderItemBinder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lqh1;", "Loyb;", "Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistorydetails/adapter/ComboOrderItemVH;", "Lxf7$a;", "view", "data", "", "position", "", "f", "Lg78;", "a", "Lg78;", "pizzaDoughNameFormatter", "<init>", "(Lg78;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qh1  reason: default package */
/* loaded from: classes2.dex */
public final class qh1 extends oyb<ComboOrderItemVH, xf7.a> {
    private final g78 a;

    public qh1(g78 g78Var) {
        z65.h(g78Var, "pizzaDoughNameFormatter");
        this.a = g78Var;
    }

    @Override // defpackage.oyb
    /* renamed from: f */
    public void b(ComboOrderItemVH comboOrderItemVH, xf7.a aVar, int i) {
        z65.h(comboOrderItemVH, "view");
        z65.h(aVar, "data");
        comboOrderItemVH.setName(aVar.getName());
        comboOrderItemVH.setPrice(aVar.h());
        comboOrderItemVH.setProducts(aVar.a(), this.a);
    }
}
