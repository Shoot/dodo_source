package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.nm0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: CoroutineAdapter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0006"}, d2 = {"T", "Lhs2;", "", RemoteMessageConst.Notification.TAG, "Lkr5;", "b", "ads-adservices-java_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ix1  reason: default package */
/* loaded from: classes.dex */
public final class ix1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoroutineAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: ix1$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function1<Throwable, Unit> {
        final /* synthetic */ nm0.a<T> a;
        final /* synthetic */ hs2<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(nm0.a<T> aVar, hs2<? extends T> hs2Var) {
            super(1);
            this.a = aVar;
            this.b = hs2Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (th != null) {
                if (th instanceof CancellationException) {
                    this.a.c();
                    return;
                } else {
                    this.a.e(th);
                    return;
                }
            }
            this.a.b(this.b.j());
        }
    }

    public static final <T> kr5<T> b(final hs2<? extends T> hs2Var, final Object obj) {
        z65.h(hs2Var, "<this>");
        kr5<T> a2 = nm0.a(new nm0.c() { // from class: hx1
            @Override // defpackage.nm0.c
            public final Object a(nm0.a aVar) {
                Object d;
                d = ix1.d(hs2.this, obj, aVar);
                return d;
            }
        });
        z65.g(a2, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return a2;
    }

    public static /* synthetic */ kr5 c(hs2 hs2Var, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(hs2Var, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(hs2 hs2Var, Object obj, nm0.a aVar) {
        z65.h(hs2Var, "$this_asListenableFuture");
        z65.h(aVar, "completer");
        hs2Var.r(new a(aVar, hs2Var));
        return obj;
    }
}
