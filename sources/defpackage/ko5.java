package defpackage;

import com.dodopizza.persistence.entity.cart.StateEntity;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: LegacyCartService.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0005H&J\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tH&¨\u0006\f"}, d2 = {"Lko5;", "", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "oldState", "newState", "", c.a, "b", "networkState", "", "notify", "a", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ko5  reason: default package */
/* loaded from: classes4.dex */
public interface ko5 {

    /* compiled from: LegacyCartService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ko5$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ void a(ko5 ko5Var, StateEntity stateEntity, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                ko5Var.a(stateEntity, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateBasket");
        }
    }

    void a(StateEntity stateEntity, boolean z);

    void b();

    void c(StateEntity stateEntity, StateEntity stateEntity2);
}
