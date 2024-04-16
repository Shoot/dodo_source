package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: AnalyticEventProducers.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004*$\b\u0002\u0010\b\"\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\t"}, d2 = {"", "eventName", "Lkotlin/Function1;", "Lbc;", "Lru/dodopizza/app/domain/common/analytics/EventParamsBuilder;", "eventParamsBuilder", "Ldc;", "a", "EventParamsBuilder", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: ec  reason: default package */
/* loaded from: classes4.dex */
public final class ec {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnalyticEventProducers.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ec$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function1<bc, bc> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$null");
            return bcVar;
        }
    }

    public static final dc a(String str, Function1<? super bc, bc> function1) {
        z65.h(str, "eventName");
        z65.h(function1, "eventParamsBuilder");
        return new cc(str, function1);
    }

    public static /* synthetic */ dc b(String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = a.a;
        }
        return a(str, function1);
    }
}
