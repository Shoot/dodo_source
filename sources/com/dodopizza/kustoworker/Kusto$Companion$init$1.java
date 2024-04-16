package com.dodopizza.kustoworker;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: KustoInitialized.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/dodopizza/kustoworker/InitializedKusto;", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes2.dex */
final class Kusto$Companion$init$1 extends ej5 implements Function1<InitializedKusto, Unit> {
    public static final Kusto$Companion$init$1 INSTANCE = new Kusto$Companion$init$1();

    Kusto$Companion$init$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InitializedKusto initializedKusto) {
        z65.h(initializedKusto, "$receiver");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InitializedKusto initializedKusto) {
        invoke2(initializedKusto);
        return Unit.a;
    }
}
