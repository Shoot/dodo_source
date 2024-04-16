package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AssistantSettingsConverter.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0002J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f¨\u0006\u0011"}, d2 = {"Ltv;", "", "Lnu;", "dto", "Lju;", "a", "Lcv;", "Lav;", "b", "Lbx;", "Lzw;", DateTokenConverter.CONVERTER_KEY, "Lvv;", "Lsv;", com.huawei.hms.opendevice.c.a, "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: tv  reason: default package */
/* loaded from: classes2.dex */
public final class tv {

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tv$a */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((nu) t2).d()), Integer.valueOf(((nu) t).d()));
            return d;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tv$b */
    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((cv) t2).c()), Integer.valueOf(((cv) t).c()));
            return d;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tv$c */
    /* loaded from: classes2.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((bx) t2).d()), Integer.valueOf(((bx) t).d()));
            return d;
        }
    }

    private final ju a(nu nuVar) {
        return new ju(nuVar.b(), nuVar.c(), nuVar.a());
    }

    private final av b(cv cvVar) {
        return new av(cvVar.a(), cvVar.b());
    }

    private final zw d(bx bxVar) {
        return new zw(bxVar.b(), bxVar.c(), bxVar.a());
    }

    public final sv c(vv vvVar) {
        List y0;
        int w;
        List y02;
        int w2;
        List y03;
        int w3;
        z65.h(vvVar, "dto");
        y0 = sc1.y0(vvVar.a(), new a());
        List<nu> list = y0;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (nu nuVar : list) {
            arrayList.add(a(nuVar));
        }
        y02 = sc1.y0(vvVar.b(), new b());
        List<cv> list2 = y02;
        w2 = lc1.w(list2, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (cv cvVar : list2) {
            arrayList2.add(b(cvVar));
        }
        y03 = sc1.y0(vvVar.d(), new c());
        List<bx> list3 = y03;
        w3 = lc1.w(list3, 10);
        ArrayList arrayList3 = new ArrayList(w3);
        for (bx bxVar : list3) {
            arrayList3.add(d(bxVar));
        }
        return new sv(arrayList, arrayList2, arrayList3, vvVar.c());
    }
}
