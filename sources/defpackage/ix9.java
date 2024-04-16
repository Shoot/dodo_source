package defpackage;

import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: ScreenUnifiedMapShown.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0004\u001a\u00020\u0002\u001a\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0006"}, d2 = {"", "orderType", "Ldc;", "a", "b", c.a, "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: ix9  reason: default package */
/* loaded from: classes4.dex */
public final class ix9 {

    /* compiled from: ScreenUnifiedMapShown.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ix9$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "order_type", this.a, false, 4, null);
            return vc.A(bcVar, StatisticManager.ONBOARDING);
        }
    }

    /* compiled from: ScreenUnifiedMapShown.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ix9$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, "order_type", this.a, false, 4, null);
        }
    }

    public static final dc a(String str) {
        z65.h(str, "orderType");
        return ec.a("screen_unified_map_shown", new a(str));
    }

    public static final dc b() {
        return ec.b("unified_map_collapse_button_click", null, 2, null);
    }

    public static final dc c(String str) {
        z65.h(str, "orderType");
        return ec.a("unified_map_order_type_click", new b(str));
    }
}
