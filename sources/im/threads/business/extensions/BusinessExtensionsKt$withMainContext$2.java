package im.threads.business.extensions;

import defpackage.z65;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: BusinessExtensions.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class BusinessExtensionsKt$withMainContext$2<T> extends m94 implements Function2<qx1, cv1<? super T>, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public BusinessExtensionsKt$withMainContext$2(Object obj) {
        super(2, obj, z65.a.class, "suspendConversion0", "withMainContext$suspendConversion0(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(qx1 qx1Var, cv1<? super T> cv1Var) {
        Object invoke;
        invoke = ((Function1) this.receiver).invoke(qx1Var);
        return invoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, Object obj) {
        return invoke(qx1Var, (cv1) ((cv1) obj));
    }
}
