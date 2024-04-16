package defpackage;

import defpackage.v25;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: InitializeLock.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"Ll95;", "Lv25$a;", "state", "a", "sdk_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: w25  reason: default package */
/* loaded from: classes.dex */
public final class w25 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InitializeLock.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: w25$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function1<Throwable, Unit> {
        final /* synthetic */ v25.a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v25.a aVar) {
            super(1);
            this.a = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            v25.a.b(this.a);
        }
    }

    public static final l95 a(l95 l95Var, v25.a aVar) {
        z65.h(l95Var, "<this>");
        z65.h(aVar, "state");
        l95Var.r(new a(aVar));
        return l95Var;
    }
}
