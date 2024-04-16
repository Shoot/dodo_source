package defpackage;

import com.dodopizza.order.feature.halves.constructor.presentation.adapter.romanpizza.RomanHalfViewHolder;
import kotlin.Metadata;
/* compiled from: RomanHalfBinder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lsn9;", "Loyb;", "Lcom/dodopizza/order/feature/halves/constructor/presentation/adapter/romanpizza/RomanHalfViewHolder;", "Lxj4;", "view", "data", "", "position", "", "f", "Lfka;", "a", "Lfka;", "side", "<init>", "(Lfka;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sn9  reason: default package */
/* loaded from: classes2.dex */
public final class sn9 extends oyb<RomanHalfViewHolder, xj4> {
    private final fka a;

    public sn9(fka fkaVar) {
        z65.h(fkaVar, "side");
        this.a = fkaVar;
    }

    @Override // defpackage.oyb
    /* renamed from: f */
    public void b(RomanHalfViewHolder romanHalfViewHolder, xj4 xj4Var, int i) {
        z65.h(romanHalfViewHolder, "view");
        z65.h(xj4Var, "data");
        String c = xj4Var.c();
        if (c == null) {
            c = "";
        }
        romanHalfViewHolder.setImage(c);
        if (this.a == fka.b) {
            romanHalfViewHolder.setLeftMargin();
            romanHalfViewHolder.setGravityStart();
            return;
        }
        romanHalfViewHolder.setRightMargin();
        romanHalfViewHolder.setGravityEnd();
    }
}
