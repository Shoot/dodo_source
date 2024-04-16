package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.domain.halves.ProductTagsApi;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ProductTagsService.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\nB\u0019\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lqm8;", "", "", LocalityEntity.FIELD_COUNTRY_CODE, "", "languageCode", "", "Llm8;", "b", "tagsKeys", "a", "Lcom/dodopizza/order/domain/halves/ProductTagsApi;", "Lcom/dodopizza/order/domain/halves/ProductTagsApi;", "api", "Lava;", "Lava;", "stateProvider", "", com.huawei.hms.opendevice.c.a, "Ljava/util/Map;", "cache", "<init>", "(Lcom/dodopizza/order/domain/halves/ProductTagsApi;Lava;)V", DateTokenConverter.CONVERTER_KEY, "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qm8  reason: default package */
/* loaded from: classes2.dex */
public final class qm8 {
    public static final a d = new a(null);
    public static final int e = 8;
    private final ProductTagsApi a;
    private final ava b;
    private final Map<String, List<lm8>> c;

    /* compiled from: ProductTagsService.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lqm8$a;", "", "", "DEFAULT_LANGUAGE_CODE", "Ljava/lang/String;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qm8$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qm8$b */
    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((lm8) t).a()), Integer.valueOf(((lm8) t2).a()));
            return d;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qm8$c */
    /* loaded from: classes2.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((lm8) t).a()), Integer.valueOf(((lm8) t2).a()));
            return d;
        }
    }

    public qm8(ProductTagsApi productTagsApi, ava avaVar) {
        z65.h(productTagsApi, "api");
        z65.h(avaVar, "stateProvider");
        this.a = productTagsApi;
        this.b = avaVar;
        this.c = new LinkedHashMap();
    }

    private final List<lm8> b(int i, String str) {
        return this.a.getTags(i, str).a();
    }

    public final List<lm8> a(List<String> list) {
        List<lm8> y0;
        List<lm8> list2;
        List<lm8> l;
        List<lm8> y02;
        CharSequence R0;
        z65.h(list, "tagsKeys");
        StateEntity e2 = this.b.e();
        String str = (String) mh5.c(e2.getLanguageCode(), "en-US");
        int intValue = ((Number) mh5.c(e2.getCountryCode(), 0)).intValue();
        if (this.c.containsKey(str) && (list2 = this.c.get(str)) != null && !list2.isEmpty()) {
            List<lm8> list3 = this.c.get(str);
            if (list3 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list3) {
                    R0 = m0b.R0(((lm8) obj).b());
                    if (list.contains(R0.toString())) {
                        arrayList.add(obj);
                    }
                }
                y02 = sc1.y0(arrayList, new b());
                if (y02 != null) {
                    return y02;
                }
            }
            l = kc1.l();
            return l;
        }
        List<lm8> b2 = b(intValue, str);
        this.c.put(str, b2);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : b2) {
            if (list.contains(((lm8) obj2).b())) {
                arrayList2.add(obj2);
            }
        }
        y0 = sc1.y0(arrayList2, new c());
        return y0;
    }
}
