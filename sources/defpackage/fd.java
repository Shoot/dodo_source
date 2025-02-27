package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
/* compiled from: analytics.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0014\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006\u001a\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\r"}, d2 = {"Lh88;", "pizzeriaFilter", "", "isEnabled", "Ldc;", "f", "", "pizzeriaFilters", com.huawei.hms.opendevice.c.a, "Lp88;", DateTokenConverter.CONVERTER_KEY, "Ln88;", e.a, "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: fd  reason: default package */
/* loaded from: classes4.dex */
public final class fd {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: analytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fd$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ List<h88> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends h88> list) {
            super(1);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            int w;
            z65.h(bcVar, "$this$eventProducer");
            List<h88> list = this.a;
            w = lc1.w(list, 10);
            ArrayList arrayList = new ArrayList(w);
            for (h88 h88Var : list) {
                arrayList.add(fd.d(h88Var).getValue());
            }
            bc.e(bcVar, "filters", arrayList, false, 4, null);
            return bc.e(bcVar, "results_shown", Integer.valueOf(this.a.size()), false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: analytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fd$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ h88 a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h88 h88Var, boolean z) {
            super(1);
            this.a = h88Var;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "filter", fd.d(this.a).getValue(), false, 4, null);
            return bc.e(bcVar, "mode", fd.e(this.b).getValue(), false, 4, null);
        }
    }

    /* compiled from: analytics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fd$c */
    /* loaded from: classes4.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[h88.values().length];
            try {
                iArr[h88.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h88.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h88.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h88.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final dc c(List<? extends h88> list) {
        z65.h(list, "pizzeriaFilters");
        return ec.a("show_filtered_restaurants", new a(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p88 d(h88 h88Var) {
        int i = c.$EnumSwitchMapping$0[h88Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return p88.d;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return p88.e;
            }
            return p88.c;
        }
        return p88.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n88 e(boolean z) {
        if (z) {
            return n88.b;
        }
        return n88.c;
    }

    public static final dc f(h88 h88Var, boolean z) {
        z65.h(h88Var, "pizzeriaFilter");
        return ec.a("filter_restaurants_click", new b(h88Var, z));
    }
}
