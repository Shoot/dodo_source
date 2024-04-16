package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Secure3dFragment.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lf3a;", "Ljava/io/Serializable;", "Lrs7;", "a", "Lrs7;", "()Lrs7;", "authorization3DS", "Ldo3;", "b", "Ldo3;", "()Ldo3;", "extraPaymentData", "<init>", "(Lrs7;Ldo3;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: f3a  reason: default package */
/* loaded from: classes4.dex */
public final class f3a implements Serializable {
    private final rs7 a;
    private final do3 b;

    public f3a(rs7 rs7Var, do3 do3Var) {
        z65.h(rs7Var, "authorization3DS");
        this.a = rs7Var;
        this.b = do3Var;
    }

    public final rs7 a() {
        return this.a;
    }

    public final do3 b() {
        return this.b;
    }

    public /* synthetic */ f3a(rs7 rs7Var, do3 do3Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rs7Var, (i & 2) != 0 ? null : do3Var);
    }
}
