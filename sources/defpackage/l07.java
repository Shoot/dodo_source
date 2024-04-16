package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: Delegates.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0007\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0012"}, d2 = {"Ll07;", "", "T", "Ll79;", "thisRef", "Lje5;", "property", "a", "(Ljava/lang/Object;Lje5;)Ljava/lang/Object;", "value", "", "b", "(Ljava/lang/Object;Lje5;Ljava/lang/Object;)V", "", "toString", "Ljava/lang/Object;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: l07  reason: default package */
/* loaded from: classes3.dex */
final class l07<T> implements l79<Object, T> {
    private T a;

    @Override // defpackage.l79, defpackage.k79
    public T a(Object obj, je5<?> je5Var) {
        z65.h(je5Var, "property");
        T t = this.a;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Property " + je5Var.getName() + " should be initialized before get.");
    }

    @Override // defpackage.l79
    public void b(Object obj, je5<?> je5Var, T t) {
        z65.h(je5Var, "property");
        z65.h(t, "value");
        this.a = t;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("NotNullProperty(");
        if (this.a != null) {
            str = "value=" + this.a;
        } else {
            str = "value not initialized yet";
        }
        sb.append(str);
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }
}
