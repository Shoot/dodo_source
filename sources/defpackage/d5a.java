package defpackage;

import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: SelectDeliveryAddressAppRouterImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Ld5a;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a;", "", "b", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a;", "result", "a", "Lf63;", "Lf63;", "router", "<init>", "(Lf63;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: d5a  reason: default package */
/* loaded from: classes4.dex */
public final class d5a implements com.dodopizza.geo.feature.selectdeliveryaddress.a {
    public static final a b = new a(null);
    private final f63 a;

    /* compiled from: SelectDeliveryAddressAppRouterImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ld5a$a;", "", "", "SELECT_DELIVERY_LOCATION_RESULT_ID", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: d5a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public d5a(f63 f63Var) {
        z65.h(f63Var, "router");
        this.a = f63Var;
    }

    @Override // com.dodopizza.geo.feature.selectdeliveryaddress.a
    public void a(a.AbstractC0149a abstractC0149a) {
        z65.h(abstractC0149a, "result");
        this.a.i(R.id.select_delivery_location_result_id, abstractC0149a);
    }

    @Override // com.dodopizza.geo.feature.selectdeliveryaddress.a
    public void b() {
        this.a.f(h56.c(null, 1, null));
    }
}
