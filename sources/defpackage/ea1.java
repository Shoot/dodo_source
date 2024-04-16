package defpackage;

import kotlin.Metadata;
/* compiled from: CloudPaymentsAcquirer.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lea1;", "Ll4;", "Lxo0;", "cardCredentials", "", "a", "Lzo0;", "cardEncryptor", "<init>", "(Lzo0;)V", "cloudpayments_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: ea1  reason: default package */
/* loaded from: classes2.dex */
public final class ea1 extends l4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea1(zo0 zo0Var) {
        super("CloudPayments", zo0Var);
        z65.h(zo0Var, "cardEncryptor");
    }

    @Override // defpackage.l4
    public boolean a(xo0 xo0Var) {
        z65.h(xo0Var, "cardCredentials");
        return true;
    }
}
