package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnalyticEventProducers.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcc;", "Ldc;", "Lqc;", "a", "", "Ljava/lang/String;", "eventName", "Lkotlin/Function1;", "Lbc;", "Lru/dodopizza/app/domain/common/analytics/EventParamsBuilder;", "b", "Lkotlin/jvm/functions/Function1;", "eventParamsBuilder", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cc  reason: default package */
/* loaded from: classes4.dex */
public final class cc implements dc {
    private final String a;
    private final Function1<bc, bc> b;

    /* JADX WARN: Multi-variable type inference failed */
    public cc(String str, Function1<? super bc, bc> function1) {
        z65.h(str, "eventName");
        z65.h(function1, "eventParamsBuilder");
        this.a = str;
        this.b = function1;
    }

    @Override // defpackage.dc
    public qc a() {
        return this.b.invoke(new bc(this.a)).a();
    }
}
