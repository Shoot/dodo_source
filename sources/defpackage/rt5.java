package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.backend.domain.locality.LocalityAPI;
/* compiled from: LocalityInfoService.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R#\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\f\u0010\u0015¨\u0006\u0019"}, d2 = {"Lrt5;", "", "Ldt5;", "locality", "Ljt5;", c.a, "a", DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/backend/domain/locality/LocalityAPI;", "Lru/dodopizza/backend/domain/locality/LocalityAPI;", "localityAPI", "Lnt5;", "b", "Lnt5;", "localityInfoRepository", "Lkt5;", "Lkt5;", "localityInfoConverter", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lrn5;", "()Lorg/slf4j/Logger;", "logger", "<init>", "(Lru/dodopizza/backend/domain/locality/LocalityAPI;Lnt5;Lkt5;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rt5  reason: default package */
/* loaded from: classes4.dex */
public final class rt5 {
    private final LocalityAPI a;
    private final nt5 b;
    private final kt5 c;
    private final rn5 d;

    /* compiled from: LocalityInfoService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: rt5$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function0<Logger> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("LocalityInfoService");
        }
    }

    public rt5(LocalityAPI localityAPI, nt5 nt5Var, kt5 kt5Var) {
        rn5 b;
        z65.h(localityAPI, "localityAPI");
        z65.h(nt5Var, "localityInfoRepository");
        z65.h(kt5Var, "localityInfoConverter");
        this.a = localityAPI;
        this.b = nt5Var;
        this.c = kt5Var;
        b = yn5.b(a.a);
        this.d = b;
    }

    private final Logger b() {
        return (Logger) this.d.getValue();
    }

    private final jt5 c(dt5 dt5Var) {
        try {
            return this.b.n(dt5Var);
        } catch (Exception e) {
            Logger b = b();
            String id = dt5Var.getId();
            b.error("Failed to load locality info from storage: " + id, (Throwable) e);
            return null;
        }
    }

    public final synchronized jt5 a(dt5 dt5Var) {
        jt5 c;
        z65.h(dt5Var, "locality");
        c = c(dt5Var);
        if (c == null) {
            c = d(dt5Var);
        }
        return c;
    }

    public final synchronized jt5 d(dt5 dt5Var) {
        z65.h(dt5Var, "locality");
        return this.b.i(this.c.a(dt5Var, this.a.getLocalityInfoV3(dt5Var.getId(), dt5Var.a())));
    }
}
