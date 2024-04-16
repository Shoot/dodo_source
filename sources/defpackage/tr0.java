package defpackage;

import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: CartQueueItemRepositoryImpl.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Ltr0;", "Lbk1;", "Lqr0;", "Lcom/dodopizza/persistence/entity/cart/queue/CartQueueItemEntity;", "Lrr0;", "", "r", "Ljk2;", "daoFactory", "Lsr0;", "converter", "<init>", "(Ljk2;Lsr0;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: tr0  reason: default package */
/* loaded from: classes4.dex */
public final class tr0 extends bk1<qr0, CartQueueItemEntity> implements rr0 {

    /* compiled from: CartQueueItemRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvu8;", "Lcom/dodopizza/persistence/entity/cart/queue/CartQueueItemEntity;", "q", "a", "(Lvu8;)Lvu8;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tr0$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<vu8<CartQueueItemEntity>, vu8<CartQueueItemEntity>> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final vu8<CartQueueItemEntity> invoke(vu8<CartQueueItemEntity> vu8Var) {
            z65.h(vu8Var, "q");
            return vu8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr0(jk2 jk2Var, sr0 sr0Var) {
        super(jk2Var, bc9.b(CartQueueItemEntity.class), sr0Var);
        z65.h(jk2Var, "daoFactory");
        z65.h(sr0Var, "converter");
    }

    @Override // defpackage.rr0
    public void r() {
        z(a.a);
    }

    @Override // defpackage.rr0
    public /* bridge */ /* synthetic */ void s(qr0 qr0Var) {
        y(qr0Var);
    }

    @Override // defpackage.rr0
    public /* bridge */ /* synthetic */ qr0 t(qr0 qr0Var) {
        return C(qr0Var);
    }
}
