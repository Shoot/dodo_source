package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PreferredOrderLocationService.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001d"}, d2 = {"Lri8;", "Lqi8;", "Lni8;", DateTokenConverter.CONVERTER_KEY, "Ld88;", e.a, "", "Lib7;", "f", "get", "Lou2;", "deliverablePlace", "", "b", "pizzeria", "a", c.a, "clear", "Loi8;", "Loi8;", "preferredOrderLocationRepository", "Le98;", "Le98;", "pizzeriaService", "Ldt5;", "Ldt5;", "locality", "<init>", "(Loi8;Le98;Ldt5;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ri8  reason: default package */
/* loaded from: classes4.dex */
public final class ri8 implements qi8 {
    private final oi8 a;
    private final e98 b;
    private final dt5 c;

    public ri8(oi8 oi8Var, e98 e98Var, dt5 dt5Var) {
        z65.h(oi8Var, "preferredOrderLocationRepository");
        z65.h(e98Var, "pizzeriaService");
        z65.h(dt5Var, "locality");
        this.a = oi8Var;
        this.b = e98Var;
        this.c = dt5Var;
    }

    private final ni8 d() {
        d88 e = e();
        return new ni8(null, e, e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0015, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.d88 e() {
        /*
            r8 = this;
            java.util.List r0 = r8.f()
            e98 r1 = r8.b
            dt5 r2 = r8.c
            java.util.Collection r1 = r1.a(r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
            r4 = r2
        L15:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L52
            java.lang.Object r5 = r1.next()
            r6 = r5
            d88 r6 = (defpackage.d88) r6
            java.util.List r6 = r6.G()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r7 = r6 instanceof java.util.Collection
            if (r7 == 0) goto L36
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L36
            goto L15
        L36:
            java.util.Iterator r6 = r6.iterator()
        L3a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L15
            java.lang.Object r7 = r6.next()
            ib7 r7 = (defpackage.ib7) r7
            boolean r7 = r0.contains(r7)
            if (r7 == 0) goto L3a
            if (r3 == 0) goto L4f
            goto L56
        L4f:
            r3 = 1
            r4 = r5
            goto L15
        L52:
            if (r3 != 0) goto L55
            goto L56
        L55:
            r2 = r4
        L56:
            d88 r2 = (defpackage.d88) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri8.e():d88");
    }

    private final List<ib7> f() {
        List<ib7> o;
        o = kc1.o(ib7.e, ib7.d);
        return o;
    }

    @Override // defpackage.qi8
    public void a(d88 d88Var) {
        z65.h(d88Var, "pizzeria");
        this.a.a(ni8.b(get(), null, d88Var, null, 5, null));
    }

    @Override // defpackage.qi8
    public void b(ou2 ou2Var) {
        z65.h(ou2Var, "deliverablePlace");
        this.a.a(ni8.b(get(), ou2Var, null, null, 6, null));
    }

    @Override // defpackage.qi8
    public void c(d88 d88Var) {
        z65.h(d88Var, "pizzeria");
        this.a.a(ni8.b(get(), null, null, d88Var, 3, null));
    }

    @Override // defpackage.qi8
    public void clear() {
        this.a.a(d());
    }

    @Override // defpackage.qi8
    public ni8 get() {
        ni8 ni8Var = this.a.get();
        if (ni8Var == null) {
            return d();
        }
        return ni8Var;
    }
}
