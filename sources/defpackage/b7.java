package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.geo.AddressCatcherRequestDto;
import ru.dodopizza.backend.domain.geo.GeoApi;
/* compiled from: AddressCatcherSubscriptionService.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u0007B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000e"}, d2 = {"Lb7;", "", "Ljx2;", "deliveryLocation", "", "clientPhoneNumber", "", "a", "Lru/dodopizza/backend/domain/geo/GeoApi;", "Lru/dodopizza/backend/domain/geo/GeoApi;", "geoApi", "<init>", "(Lru/dodopizza/backend/domain/geo/GeoApi;)V", "b", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: b7  reason: default package */
/* loaded from: classes4.dex */
public final class b7 {
    public static final a b = new a(null);
    private final GeoApi a;

    /* compiled from: AddressCatcherSubscriptionService.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lb7$a;", "", "", "AE_COUNTRY_CODE", "Ljava/lang/String;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: b7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b7(GeoApi geoApi) {
        z65.h(geoApi, "geoApi");
        this.a = geoApi;
    }

    public final void a(jx2 jx2Var, String str) {
        z65.h(jx2Var, "deliveryLocation");
        z65.h(str, "clientPhoneNumber");
        this.a.subscribeAddressForUpdates("784", new AddressCatcherRequestDto(oy2.a(jx2Var), str));
    }
}
