package defpackage;

import com.dodopizza.persistence.entity.payment.CardEntity;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: CardRepository.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Ltp0;", "Lsp0;", "", "clear", "", "id", c.a, "Lgk2;", "Lcom/dodopizza/persistence/entity/payment/CardEntity;", "a", "Lgk2;", "dao", "<init>", "(Lgk2;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: tp0  reason: default package */
/* loaded from: classes2.dex */
public final class tp0 implements sp0 {
    private final gk2<CardEntity> a;

    public tp0(gk2<CardEntity> gk2Var) {
        z65.h(gk2Var, "dao");
        this.a = gk2Var;
    }

    @Override // defpackage.sp0
    public void c(String str) {
        z65.h(str, "id");
        this.a.c(str);
    }

    @Override // defpackage.sp0
    public void clear() {
        this.a.e();
    }
}
