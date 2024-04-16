package defpackage;

import com.dodopizza.orderhistory.domain.orderhistory.OrderHistoryAPI;
import retrofit2.Retrofit;
/* compiled from: OrderHistoryDomainModule_ProvideOrderHistoryApi$orderhistory_releaseFactory.java */
/* renamed from: ue7  reason: default package */
/* loaded from: classes2.dex */
public final class ue7 implements no3<OrderHistoryAPI> {
    public static OrderHistoryAPI a(Retrofit retrofit) {
        return (OrderHistoryAPI) jh8.e(te7.a.a(retrofit));
    }
}
