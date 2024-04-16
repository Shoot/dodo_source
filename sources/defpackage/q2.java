package defpackage;

import ch.qos.logback.core.CoreConstants;
import defpackage.b94;
import kotlin.Metadata;
/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0004B\u001b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lq2;", "Lb94;", "", "T", "", "other", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "label", "Lb94;", "()Lb94;", "action", "<init>", "(Ljava/lang/String;Lb94;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: q2  reason: default package */
/* loaded from: classes.dex */
public final class q2<T extends b94<? extends Boolean>> {
    private final String a;
    private final T b;

    public q2(String str, T t) {
        this.a = str;
        this.b = t;
    }

    public final T a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        if (z65.c(this.a, q2Var.a) && z65.c(this.b, q2Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        T t = this.b;
        if (t != null) {
            i2 = t.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
