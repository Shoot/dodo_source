package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.nr7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: ZipFiles.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a.\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000\u001a\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0002\u001a\f\u0010\u000f\u001a\u00020\u0005*\u00020\u000eH\u0000\u001a\f\u0010\u0011\u001a\u00020\u0010*\u00020\u000eH\u0002\u001a\u0014\u0010\u0013\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002\u001a.\u0010\u001a\u001a\u00020\u0018*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0002\u001a\f\u0010\u001b\u001a\u00020\u0018*\u00020\u000eH\u0000\u001a\u0014\u0010\u001e\u001a\u00020\u001c*\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000\u001a\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c*\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002\u001a!\u0010\"\u001a\u0004\u0018\u00010\u00172\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010#\"\u0018\u0010'\u001a\u00020$*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lnr7;", "zipPath", "Liu3;", "fileSystem", "Lkotlin/Function1;", "Lrcc;", "", "predicate", "Ltcc;", DateTokenConverter.CONVERTER_KEY, "", "entries", "", "a", "Lfh0;", e.a, "Lak3;", "f", "regularRecord", "j", "", "extraSize", "Lkotlin/Function2;", "", "", "block", "g", "k", "Lbu3;", "basicMetadata", Image.TYPE_HIGH, "i", "date", CrashHianalyticsData.TIME, "b", "(II)Ljava/lang/Long;", "", com.huawei.hms.opendevice.c.a, "(I)Ljava/lang/String;", "hex", "okio"}, k = 2, mv = {1, 9, 0})
/* renamed from: ucc  reason: default package */
/* loaded from: classes3.dex */
public final class ucc {

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ucc$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(((rcc) t).a(), ((rcc) t2).a());
            return d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ZipFiles.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "headerId", "", "dataSize", "", "a", "(IJ)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ucc$b */
    /* loaded from: classes3.dex */
    public static final class b extends ej5 implements Function2<Integer, Long, Unit> {
        final /* synthetic */ aa9 a;
        final /* synthetic */ long b;
        final /* synthetic */ da9 c;
        final /* synthetic */ fh0 d;
        final /* synthetic */ da9 e;
        final /* synthetic */ da9 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(aa9 aa9Var, long j, da9 da9Var, fh0 fh0Var, da9 da9Var2, da9 da9Var3) {
            super(2);
            this.a = aa9Var;
            this.b = j;
            this.c = da9Var;
            this.d = fh0Var;
            this.e = da9Var2;
            this.f = da9Var3;
        }

        public final void a(int i, long j) {
            long j2;
            if (i == 1) {
                aa9 aa9Var = this.a;
                if (!aa9Var.a) {
                    aa9Var.a = true;
                    if (j >= this.b) {
                        da9 da9Var = this.c;
                        long j3 = da9Var.a;
                        if (j3 == 4294967295L) {
                            j3 = this.d.y0();
                        }
                        da9Var.a = j3;
                        da9 da9Var2 = this.e;
                        long j4 = 0;
                        if (da9Var2.a == 4294967295L) {
                            j2 = this.d.y0();
                        } else {
                            j2 = 0;
                        }
                        da9Var2.a = j2;
                        da9 da9Var3 = this.f;
                        if (da9Var3.a == 4294967295L) {
                            j4 = this.d.y0();
                        }
                        da9Var3.a = j4;
                        return;
                    }
                    throw new IOException("bad zip: zip64 extra too short");
                }
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Long l) {
            a(num.intValue(), l.longValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ZipFiles.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "headerId", "", "dataSize", "", "a", "(IJ)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ucc$c */
    /* loaded from: classes3.dex */
    public static final class c extends ej5 implements Function2<Integer, Long, Unit> {
        final /* synthetic */ fh0 a;
        final /* synthetic */ ea9<Long> b;
        final /* synthetic */ ea9<Long> c;
        final /* synthetic */ ea9<Long> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(fh0 fh0Var, ea9<Long> ea9Var, ea9<Long> ea9Var2, ea9<Long> ea9Var3) {
            super(2);
            this.a = fh0Var;
            this.b = ea9Var;
            this.c = ea9Var2;
            this.d = ea9Var3;
        }

        /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r10v3, types: [T, java.lang.Long] */
        public final void a(int i, long j) {
            boolean z;
            boolean z2;
            if (i == 21589) {
                long j2 = 1;
                if (j >= 1) {
                    byte readByte = this.a.readByte();
                    boolean z3 = false;
                    if ((readByte & 1) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((readByte & 2) == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((readByte & 4) == 4) {
                        z3 = true;
                    }
                    fh0 fh0Var = this.a;
                    if (z) {
                        j2 = 5;
                    }
                    if (z2) {
                        j2 += 4;
                    }
                    if (z3) {
                        j2 += 4;
                    }
                    if (j >= j2) {
                        if (z) {
                            this.b.a = Long.valueOf(fh0Var.C1() * 1000);
                        }
                        if (z2) {
                            this.c.a = Long.valueOf(this.a.C1() * 1000);
                        }
                        if (z3) {
                            this.d.a = Long.valueOf(this.a.C1() * 1000);
                            return;
                        }
                        return;
                    }
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                throw new IOException("bad zip: extended timestamp extra too short");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Long l) {
            a(num.intValue(), l.longValue());
            return Unit.a;
        }
    }

    private static final Map<nr7, rcc> a(List<rcc> list) {
        Map<nr7, rcc> m;
        List<rcc> y0;
        nr7 e = nr7.a.e(nr7.b, "/", false, 1, null);
        m = g86.m(lnb.a(e, new rcc(e, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null)));
        y0 = sc1.y0(list, new a());
        for (rcc rccVar : y0) {
            if (m.put(rccVar.a(), rccVar) == null) {
                while (true) {
                    nr7 q = rccVar.a().q();
                    if (q != null) {
                        rcc rccVar2 = m.get(q);
                        if (rccVar2 != null) {
                            rccVar2.b().add(rccVar.a());
                            break;
                        }
                        rcc rccVar3 = new rcc(q, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                        m.put(q, rccVar3);
                        rccVar3.b().add(rccVar.a());
                        rccVar = rccVar3;
                    }
                }
            }
        }
        return m;
    }

    private static final Long b(int i, int i2) {
        if (i2 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i >> 9) & 127) + 1980, ((i >> 5) & 15) - 1, i & 31, (i2 >> 11) & 31, (i2 >> 5) & 63, (i2 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    private static final String c(int i) {
        int a2;
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        a2 = nw0.a(16);
        String num = Integer.toString(i, a2);
        z65.g(num, "toString(...)");
        sb.append(num);
        return sb.toString();
    }

    public static final tcc d(nr7 nr7Var, iu3 iu3Var, Function1<? super rcc, Boolean> function1) throws IOException {
        int C1;
        z65.h(nr7Var, "zipPath");
        z65.h(iu3Var, "fileSystem");
        z65.h(function1, "predicate");
        wt3 n = iu3Var.n(nr7Var);
        try {
            long n2 = n.n() - 22;
            if (n2 >= 0) {
                long max = Math.max(n2 - 65536, 0L);
                while (true) {
                    fh0 c2 = c77.c(n.o(n2));
                    if (c2.C1() == 101010256) {
                        ak3 f = f(c2);
                        String G0 = c2.G0(f.b());
                        c2.close();
                        long j = n2 - 20;
                        if (j > 0) {
                            fh0 c3 = c77.c(n.o(j));
                            if (c3.C1() == 117853008) {
                                int C12 = c3.C1();
                                long y0 = c3.y0();
                                if (c3.C1() == 1 && C12 == 0) {
                                    fh0 c4 = c77.c(n.o(y0));
                                    if (c4.C1() == 101075792) {
                                        f = j(c4, f);
                                        Unit unit = Unit.a;
                                        aa1.a(c4, null);
                                    } else {
                                        throw new IOException("bad zip: expected " + c(101075792) + " but was " + c(C1));
                                    }
                                } else {
                                    throw new IOException("unsupported zip: spanned");
                                }
                            }
                            Unit unit2 = Unit.a;
                            aa1.a(c3, null);
                        }
                        ArrayList arrayList = new ArrayList();
                        fh0 c5 = c77.c(n.o(f.a()));
                        long c6 = f.c();
                        for (long j2 = 0; j2 < c6; j2++) {
                            rcc e = e(c5);
                            if (e.f() < f.a()) {
                                if (function1.invoke(e).booleanValue()) {
                                    arrayList.add(e);
                                }
                            } else {
                                throw new IOException("bad zip: local file header offset >= central directory offset");
                            }
                        }
                        Unit unit3 = Unit.a;
                        aa1.a(c5, null);
                        tcc tccVar = new tcc(nr7Var, iu3Var, a(arrayList), G0);
                        aa1.a(n, null);
                        return tccVar;
                    }
                    c2.close();
                    n2--;
                    if (n2 < max) {
                        throw new IOException("not a zip: end of central directory signature not found");
                    }
                }
            } else {
                throw new IOException("not a zip: size=" + n.n());
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                aa1.a(n, th);
                throw th2;
            }
        }
    }

    public static final rcc e(fh0 fh0Var) throws IOException {
        int C1;
        boolean N;
        long j;
        long j2;
        boolean u;
        z65.h(fh0Var, "<this>");
        if (fh0Var.C1() == 33639248) {
            fh0Var.skip(4L);
            short w0 = fh0Var.w0();
            int i = w0 & 65535;
            if ((w0 & 1) == 0) {
                int w02 = fh0Var.w0() & 65535;
                Long b2 = b(fh0Var.w0() & 65535, fh0Var.w0() & 65535);
                long C12 = fh0Var.C1() & 4294967295L;
                da9 da9Var = new da9();
                da9Var.a = fh0Var.C1() & 4294967295L;
                da9 da9Var2 = new da9();
                da9Var2.a = fh0Var.C1() & 4294967295L;
                int w03 = fh0Var.w0() & 65535;
                int w04 = fh0Var.w0() & 65535;
                fh0Var.skip(8L);
                da9 da9Var3 = new da9();
                da9Var3.a = fh0Var.C1() & 4294967295L;
                String G0 = fh0Var.G0(fh0Var.w0() & 65535);
                N = m0b.N(G0, (char) 0, false, 2, null);
                if (!N) {
                    if (da9Var2.a == 4294967295L) {
                        j = 8;
                    } else {
                        j = 0;
                    }
                    if (da9Var.a == 4294967295L) {
                        j2 = j + 8;
                    } else {
                        j2 = j;
                    }
                    if (da9Var3.a == 4294967295L) {
                        j2 += 8;
                    }
                    long j3 = j2;
                    aa9 aa9Var = new aa9();
                    g(fh0Var, w03, new b(aa9Var, j3, da9Var2, fh0Var, da9Var, da9Var3));
                    if (j3 > 0 && !aa9Var.a) {
                        throw new IOException("bad zip: zip64 extra required but absent");
                    }
                    String G02 = fh0Var.G0(w04);
                    nr7 u2 = nr7.a.e(nr7.b, "/", false, 1, null).u(G0);
                    u = l0b.u(G0, "/", false, 2, null);
                    return new rcc(u2, u, G02, C12, da9Var.a, da9Var2.a, w02, b2, da9Var3.a);
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i));
        }
        throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(C1));
    }

    private static final ak3 f(fh0 fh0Var) throws IOException {
        int w0 = fh0Var.w0() & 65535;
        int w02 = fh0Var.w0() & 65535;
        long w03 = fh0Var.w0() & 65535;
        if (w03 == (fh0Var.w0() & 65535) && w0 == 0 && w02 == 0) {
            fh0Var.skip(4L);
            return new ak3(w03, 4294967295L & fh0Var.C1(), fh0Var.w0() & 65535);
        }
        throw new IOException("unsupported zip: spanned");
    }

    private static final void g(fh0 fh0Var, int i, Function2<? super Integer, ? super Long, Unit> function2) {
        long j = i;
        while (j != 0) {
            if (j >= 4) {
                int w0 = fh0Var.w0() & 65535;
                long w02 = fh0Var.w0() & 65535;
                long j2 = j - 4;
                if (j2 >= w02) {
                    fh0Var.B0(w02);
                    long P = fh0Var.d().P();
                    function2.invoke(Integer.valueOf(w0), Long.valueOf(w02));
                    long P2 = (fh0Var.d().P() + w02) - P;
                    int i2 = (P2 > 0L ? 1 : (P2 == 0L ? 0 : -1));
                    if (i2 >= 0) {
                        if (i2 > 0) {
                            fh0Var.d().skip(P2);
                        }
                        j = j2 - w02;
                    } else {
                        throw new IOException("unsupported zip: too many bytes processed for " + w0);
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    public static final bu3 h(fh0 fh0Var, bu3 bu3Var) {
        z65.h(fh0Var, "<this>");
        z65.h(bu3Var, "basicMetadata");
        bu3 i = i(fh0Var, bu3Var);
        z65.e(i);
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final bu3 i(fh0 fh0Var, bu3 bu3Var) {
        T t;
        int C1;
        ea9 ea9Var = new ea9();
        if (bu3Var != null) {
            t = bu3Var.c();
        } else {
            t = 0;
        }
        ea9Var.a = t;
        ea9 ea9Var2 = new ea9();
        ea9 ea9Var3 = new ea9();
        if (fh0Var.C1() == 67324752) {
            fh0Var.skip(2L);
            short w0 = fh0Var.w0();
            int i = w0 & 65535;
            if ((w0 & 1) == 0) {
                fh0Var.skip(18L);
                int w02 = fh0Var.w0() & 65535;
                fh0Var.skip(fh0Var.w0() & 65535);
                if (bu3Var == null) {
                    fh0Var.skip(w02);
                    return null;
                }
                g(fh0Var, w02, new c(fh0Var, ea9Var, ea9Var2, ea9Var3));
                return new bu3(bu3Var.g(), bu3Var.f(), null, bu3Var.d(), (Long) ea9Var3.a, (Long) ea9Var.a, (Long) ea9Var2.a, null, 128, null);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i));
        }
        throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(C1));
    }

    private static final ak3 j(fh0 fh0Var, ak3 ak3Var) throws IOException {
        fh0Var.skip(12L);
        int C1 = fh0Var.C1();
        int C12 = fh0Var.C1();
        long y0 = fh0Var.y0();
        if (y0 == fh0Var.y0() && C1 == 0 && C12 == 0) {
            fh0Var.skip(8L);
            return new ak3(y0, fh0Var.y0(), ak3Var.b());
        }
        throw new IOException("unsupported zip: spanned");
    }

    public static final void k(fh0 fh0Var) {
        z65.h(fh0Var, "<this>");
        i(fh0Var, null);
    }
}
