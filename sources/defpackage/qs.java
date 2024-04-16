package defpackage;

import com.dodopizza.order.domain.assistant.AssistantApi;
import kotlin.Metadata;
import retrofit2.Retrofit;
/* compiled from: AssistantDomainModule.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lqs;", "", "Lretrofit2/Retrofit;", "retrofit", "Lcom/dodopizza/order/domain/assistant/AssistantApi;", "a", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qs  reason: default package */
/* loaded from: classes2.dex */
public final class qs {
    public static final qs a = new qs();

    private qs() {
    }

    public final AssistantApi a(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (AssistantApi) retrofit.create(AssistantApi.class);
    }
}
