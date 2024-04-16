package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.kl8;
import defpackage.xf7;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.common.ImageUrls;
import ru.dodopizza.backend.domain.orderhistory.dto.MeasureInfoDto;
import ru.dodopizza.backend.domain.orderhistory.dto.SizeDetailsDto;
/* compiled from: OrderHistoryMapper.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\t\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\f\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0002J\f\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002J\f\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002J\f\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001e¨\u0006\""}, d2 = {"Lif7;", "Lhf7;", "Lag7;", "", "isTransparentImageUrlEnabled", "Lxf7;", c.a, "Lzg7;", "Lxg7;", DateTokenConverter.CONVERTER_KEY, "transparent", "", "b", "", "Lni7;", "g", "Lru/dodopizza/backend/domain/orderhistory/dto/SizeDetailsDto;", "Lena;", "f", "Lru/dodopizza/backend/domain/orderhistory/dto/MeasureInfoDto;", "Lkm8;", e.a, "Lxe7;", "dto", "Lae7;", "a", "Lfda;", "Lfda;", "timeParser", "Le78;", "Le78;", "pizzaConceptService", "<init>", "(Lfda;Le78;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: if7  reason: default package */
/* loaded from: classes2.dex */
public final class if7 implements hf7 {
    private final fda a;
    private final e78 b;

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: if7$a */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((xg7) t).f()), Integer.valueOf(((xg7) t2).f()));
            return d;
        }
    }

    public if7(fda fdaVar, e78 e78Var) {
        z65.h(fdaVar, "timeParser");
        z65.h(e78Var, "pizzaConceptService");
        this.a = fdaVar;
        this.b = e78Var;
    }

    private final String b(zg7 zg7Var, boolean z) {
        String b;
        if (z) {
            ImageUrls c = zg7Var.c();
            if (c != null) {
                b = c.getWebp();
            } else {
                b = null;
            }
        } else {
            b = zg7Var.b();
        }
        if (b == null) {
            return "";
        }
        return b;
    }

    private final xf7 c(ag7 ag7Var, boolean z) {
        int w;
        List y0;
        Object Z;
        int d = ag7Var.d();
        if (d != 3 && d != 5) {
            String a2 = ag7Var.a();
            hn6 b = kn6.c.b(ag7Var.c());
            Z = sc1.Z(ag7Var.b());
            return new xf7.b(a2, b, d((zg7) Z, z));
        }
        String a3 = ag7Var.a();
        hn6 b2 = kn6.c.b(ag7Var.c());
        List<zg7> b3 = ag7Var.b();
        w = lc1.w(b3, 10);
        ArrayList arrayList = new ArrayList(w);
        for (zg7 zg7Var : b3) {
            arrayList.add(d(zg7Var, z));
        }
        y0 = sc1.y0(arrayList, new a());
        return new xf7.a(a3, b2, y0);
    }

    private final xg7 d(zg7 zg7Var, boolean z) {
        String d = zg7Var.d();
        String b = b(zg7Var, z);
        kl8 a2 = kl8.a.a.a(zg7Var.e());
        ena f = f(zg7Var.f());
        int g = zg7Var.g();
        yg7 a3 = zg7Var.a();
        return new xg7(d, b, a2, "", f, g, new x52(a3.c(), a3.b(), a3.a()), this.b.a());
    }

    private final km8 e(MeasureInfoDto measureInfoDto) {
        return new km8(String.valueOf(measureInfoDto.getMeasure()), km8.c.a(String.valueOf(measureInfoDto.getValue())));
    }

    private final ena f(SizeDetailsDto sizeDetailsDto) {
        return new ena(sizeDetailsDto.getSizeGroupName(), sizeDetailsDto.getDoughTypeName(), e(sizeDetailsDto.getMeasureInfo()));
    }

    private final ni7 g(int i) {
        if (i != 4 && i != 5) {
            if (i != 12) {
                return ni7.a;
            }
            return ni7.b;
        }
        return ni7.a;
    }

    @Override // defpackage.hf7
    public ae7 a(xe7 xe7Var, boolean z) {
        int w;
        z65.h(xe7Var, "dto");
        String d = xe7Var.d();
        String e = xe7Var.e();
        String a2 = xe7Var.a();
        if (a2 == null) {
            a2 = "";
        }
        String str = a2;
        ni7 g = g(xe7Var.g());
        jk7 a3 = jk7.b.a(xe7Var.h());
        fda fdaVar = this.a;
        String b = xe7Var.b();
        TimeZone timeZone = TimeZone.getDefault();
        z65.g(timeZone, "getDefault(...)");
        Date date = new Date(fdaVar.a(b, timeZone));
        kn6 kn6Var = kn6.c;
        hn6 b2 = kn6Var.b(xe7Var.i());
        hn6 b3 = kn6Var.b(xe7Var.c());
        List<ag7> f = xe7Var.f();
        w = lc1.w(f, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ag7 ag7Var : f) {
            arrayList.add(c(ag7Var, z));
        }
        return new ae7(d, e, str, g, a3, date, b2, b3, arrayList, xe7Var.j());
    }
}
