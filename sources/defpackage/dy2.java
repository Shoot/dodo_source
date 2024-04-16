package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.xl0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.geo.AddressDetailsFieldDto;
import ru.dodopizza.backend.domain.geo.GeoApi;
/* compiled from: DeliveryLocationDetailsService.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u000eB\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Ldy2;", "Lcy2;", "Lxl0;", "", LocalityEntity.FIELD_COUNTRY_CODE, "Lxl0$a;", Image.TYPE_MEDIUM, "", "Lg7;", "l", "k", "Lru/dodopizza/backend/domain/geo/AddressDetailsFieldDto;", "field", "j", "a", "Lru/dodopizza/backend/domain/geo/GeoApi;", DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/backend/domain/geo/GeoApi;", "geoApi", "Ljy2;", e.a, "Ljy2;", "deliveryLocationFieldsRepository", "Lml0;", "cacheInspector", "<init>", "(Lru/dodopizza/backend/domain/geo/GeoApi;Lml0;Ljy2;)V", "f", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dy2  reason: default package */
/* loaded from: classes4.dex */
public final class dy2 extends xl0 implements cy2 {
    private static final a f = new a(null);
    private static final long g = TimeUnit.MINUTES.toMillis(10);
    private final GeoApi d;
    private final jy2 e;

    /* compiled from: DeliveryLocationDetailsService.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Ldy2$a;", "", "", "CACHE_DELIVERY_LOCATION_DETAILS_DURATION", "J", "", "CACHE_DELIVERY_LOCATION_DETAILS_KEY", "Ljava/lang/String;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dy2$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: DeliveryLocationDetailsService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lg7;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dy2$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<List<? extends g7>> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends g7> invoke() {
            List<g7> a = dy2.this.e.a(this.b);
            return a == null ? dy2.this.l(this.b) : a;
        }
    }

    /* compiled from: DeliveryLocationDetailsService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lxl0$a;", "a", "()Lxl0$a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dy2$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<xl0.a> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final xl0.a invoke() {
            return dy2.this.m(this.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy2(GeoApi geoApi, ml0 ml0Var, jy2 jy2Var) {
        super(ml0Var);
        z65.h(geoApi, "geoApi");
        z65.h(ml0Var, "cacheInspector");
        z65.h(jy2Var, "deliveryLocationFieldsRepository");
        this.d = geoApi;
        this.e = jy2Var;
    }

    private final g7 j(AddressDetailsFieldDto addressDetailsFieldDto) {
        return new g7(addressDetailsFieldDto.getType(), addressDetailsFieldDto.isRequired());
    }

    private final List<g7> k(String str) {
        int w;
        List<AddressDetailsFieldDto> fields = this.d.getAddressDetailsFields(Integer.parseInt(str)).getFields();
        w = lc1.w(fields, 10);
        ArrayList arrayList = new ArrayList(w);
        for (AddressDetailsFieldDto addressDetailsFieldDto : fields) {
            arrayList.add(j(addressDetailsFieldDto));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<g7> l(String str) {
        return this.e.b(k(str), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xl0.a m(String str) {
        l(str);
        return xl0.a.C0743a.a;
    }

    @Override // defpackage.cy2
    public List<g7> a(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        return (List) f(new b(str), new c(str), new ql0("deliveryLocationDetails.tag", g, false, 4, null));
    }
}
