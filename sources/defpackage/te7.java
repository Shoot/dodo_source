package defpackage;

import com.dodopizza.orderhistory.domain.orderhistory.OrderHistoryAPI;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import retrofit2.Retrofit;
/* compiled from: OrderHistoryDomainModule.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lte7;", "", "Ltf7;", "impl", "Lsf7;", c.a, "(Ltf7;)Lsf7;", "Lretrofit2/Retrofit;", "retrofit", "Lcom/dodopizza/orderhistory/domain/orderhistory/OrderHistoryAPI;", "a", "(Lretrofit2/Retrofit;)Lcom/dodopizza/orderhistory/domain/orderhistory/OrderHistoryAPI;", "Lif7;", "Lhf7;", "b", "(Lif7;)Lhf7;", "<init>", "()V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: te7  reason: default package */
/* loaded from: classes2.dex */
public final class te7 {
    public static final te7 a = new te7();

    private te7() {
    }

    public final OrderHistoryAPI a(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        Object create = retrofit.create(OrderHistoryAPI.class);
        z65.g(create, "create(...)");
        return (OrderHistoryAPI) create;
    }

    public final hf7 b(if7 if7Var) {
        z65.h(if7Var, "impl");
        return if7Var;
    }

    public final sf7 c(tf7 tf7Var) {
        z65.h(tf7Var, "impl");
        return tf7Var;
    }
}
