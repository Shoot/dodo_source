package ru.dodopizza.app.domain.locality;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.backend.domain.country.dto.FeatureDto;
import ru.dodopizza.backend.domain.locality.LocalityAPI;
import ru.dodopizza.backend.domain.locality.dto.LocalityDto;
/* compiled from: LocalityService.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010(\u001a\u00020&¢\u0006\u0004\b7\u00108J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t*\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'R#\u0010.\u001a\n **\u0004\u0018\u00010)0)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u001c\u00101\u001a\n **\u0004\u0018\u00010\u00190\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00104\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u00106¨\u00069"}, d2 = {"Lru/dodopizza/app/domain/locality/LocalityServiceImpl;", "Ljv5;", "", LocalityEntity.FIELD_COUNTRY_CODE, "", "Ldt5;", "l", "k", "Lru/dodopizza/backend/domain/locality/dto/LocalityDto;", "", "o", "", "f", "locality", "", "g", DateTokenConverter.CONVERTER_KEY, "localityId", "b", "localityUuid", "Lbq3;", e.a, com.huawei.hms.opendevice.c.a, Image.TYPE_HIGH, "Las8;", "Lru/dodopizza/backend/domain/locality/LocalityAPI;", "a", "Las8;", "localityAPIProvider", "Ldv5;", "Ldv5;", "localityRepository", "Lc63;", "Lc63;", "dodoResources", "Lmh0;", "Lmh0;", "buildInfo", "Lyjb;", "Lyjb;", "traces", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lrn5;", "n", "()Lorg/slf4j/Logger;", "logger", Image.TYPE_MEDIUM, "()Lru/dodopizza/backend/domain/locality/LocalityAPI;", "localityAPI", "i", "()Ldt5;", "currentLocality", "", "()I", "<init>", "(Las8;Ldv5;Lc63;Lmh0;Lyjb;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocalityServiceImpl implements jv5 {
    private final as8<LocalityAPI> a;
    private final dv5 b;
    private final c63 c;
    private final mh0 d;
    private final yjb e;
    private final rn5 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalityService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldt5;", "a", "()Ldt5;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function0<dt5> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final dt5 invoke() {
            return LocalityServiceImpl.this.b.d();
        }
    }

    /* compiled from: LocalityService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<Logger> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("LocalityServiceImpl");
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((LocalityDto) t).getOrder()), Integer.valueOf(((LocalityDto) t2).getOrder()));
            return d;
        }
    }

    public LocalityServiceImpl(as8<LocalityAPI> as8Var, dv5 dv5Var, c63 c63Var, mh0 mh0Var, yjb yjbVar) {
        rn5 b2;
        z65.h(as8Var, "localityAPIProvider");
        z65.h(dv5Var, "localityRepository");
        z65.h(c63Var, "dodoResources");
        z65.h(mh0Var, "buildInfo");
        z65.h(yjbVar, "traces");
        this.a = as8Var;
        this.b = dv5Var;
        this.c = c63Var;
        this.d = mh0Var;
        this.e = yjbVar;
        b2 = yn5.b(b.a);
        this.f = b2;
    }

    private final Collection<dt5> k(String str) {
        List l;
        try {
            c63 c63Var = this.c;
            String str2 = "country_" + str;
            Type type = new TypeToken<Collection<? extends LocalityDto>>() { // from class: ru.dodopizza.app.domain.locality.LocalityServiceImpl$getLocalitiesFromDefault$1
            }.getType();
            z65.g(type, "getType(...)");
            return o((Collection) c63Var.a(str2, type), str);
        } catch (Exception e) {
            n().error("Cant get default localities list", (Throwable) e);
            l = kc1.l();
            return l;
        }
    }

    private final synchronized Collection<dt5> l(String str) {
        Collection<dt5> j = this.b.j(str);
        if (!j.isEmpty()) {
            return j;
        }
        Collection<dt5> k = k(str);
        this.b.g(str, k);
        return k;
    }

    private final LocalityAPI m() {
        return this.a.get();
    }

    private final Logger n() {
        return (Logger) this.f.getValue();
    }

    private final List<dt5> o(Collection<LocalityDto> collection, String str) {
        List y0;
        int w;
        y0 = sc1.y0(collection, new c());
        List<LocalityDto> list = y0;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (LocalityDto localityDto : list) {
            arrayList.add(new ila(localityDto.getId(), localityDto.getUuid(), localityDto.getName(), str, localityDto.getOrder(), localityDto.isTop()));
        }
        return arrayList;
    }

    @Override // defpackage.jv5
    public int a() {
        Integer num;
        String a2;
        dt5 i = i();
        if (i != null && (a2 = i.a()) != null) {
            num = k0b.k(a2);
        } else {
            num = null;
        }
        return ((Number) mh5.c(num, 643)).intValue();
    }

    @Override // defpackage.jv5
    public dt5 b(String str, String str2) {
        Object obj;
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(str2, "localityId");
        Iterator<T> it = l(str).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (z65.c(((dt5) obj).getId(), str2)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (dt5) obj;
    }

    @Override // defpackage.jv5
    public boolean c() {
        return this.b.c();
    }

    @Override // defpackage.jv5
    public Collection<dt5> d(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        return l(str);
    }

    @Override // defpackage.jv5
    public List<bq3> e(String str, String str2) {
        z65.h(str, "localityUuid");
        z65.h(str2, LocalityEntity.FIELD_COUNTRY_CODE);
        String a2 = this.d.a();
        String h = this.d.h();
        String e = this.d.e();
        ArrayList arrayList = new ArrayList();
        for (FeatureDto featureDto : m().getLocalityFeatures(str, str2, a2, h, e)) {
            bq3 a3 = bq3.c.a(featureDto.getCode());
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return arrayList;
    }

    @Override // defpackage.jv5
    public void f() {
        this.b.p();
    }

    @Override // defpackage.jv5
    public boolean g(dt5 dt5Var) {
        z65.h(dt5Var, "locality");
        return m().getLocalityInfoV3(dt5Var.getId(), dt5Var.a()).isLanding();
    }

    @Override // defpackage.jv5
    public synchronized void h(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        try {
            this.b.g(str, o(m().getLocalitiesIds(str), str));
        } catch (Exception e) {
            Logger n = n();
            n.error("Cant get localities list from api (country code " + str + ")", (Throwable) e);
        }
    }

    @Override // defpackage.jv5
    public dt5 i() {
        try {
            return (dt5) this.e.a("get_current_locality", new a());
        } catch (Exception e) {
            n().error("Failed to find selected locality", (Throwable) e);
            return null;
        }
    }
}
