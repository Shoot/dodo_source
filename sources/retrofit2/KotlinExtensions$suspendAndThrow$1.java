package retrofit2;

import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KotlinExtensions.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00060\u0000j\u0002`\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080@"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcv1;", "", "continuation", "", "suspendAndThrow"}, k = 3, mv = {1, 4, 0})
@nn2(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
/* loaded from: classes3.dex */
public final class KotlinExtensions$suspendAndThrow$1 extends ev1 {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public KotlinExtensions$suspendAndThrow$1(cv1 cv1Var) {
        super(cv1Var);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return KotlinExtensions.suspendAndThrow(null, this);
    }
}
