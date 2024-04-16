package defpackage;

import com.dodopizza.orderhistory.domain.check.CheckApi;
import kotlin.Metadata;
import retrofit2.Retrofit;
/* compiled from: CheckDomainModule.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lc31;", "", "a", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: c31  reason: default package */
/* loaded from: classes2.dex */
public interface c31 {
    public static final a a = a.a;

    /* compiled from: CheckDomainModule.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lc31$a;", "", "Lretrofit2/Retrofit;", "retrofit", "Lcom/dodopizza/orderhistory/domain/check/CheckApi;", "a", "(Lretrofit2/Retrofit;)Lcom/dodopizza/orderhistory/domain/check/CheckApi;", "<init>", "()V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: c31$a */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final CheckApi a(Retrofit retrofit) {
            z65.h(retrofit, "retrofit");
            return (CheckApi) retrofit.create(CheckApi.class);
        }
    }
}
