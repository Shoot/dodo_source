package defpackage;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: HalvesInfo.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lgl4;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "Lfna;", "b", "Lfna;", "()Lfna;", "sizeGroup", "<init>", "(Ljava/lang/String;Lfna;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: gl4  reason: default package */
/* loaded from: classes.dex */
public final class gl4 {
    private final String a;
    private final fna b;

    public gl4(String str, fna fnaVar) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(fnaVar, "sizeGroup");
        this.a = str;
        this.b = fnaVar;
    }

    public final String a() {
        return this.a;
    }

    public final fna b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl4)) {
            return false;
        }
        gl4 gl4Var = (gl4) obj;
        if (z65.c(this.a, gl4Var.a) && z65.c(this.b, gl4Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        fna fnaVar = this.b;
        return "HalvesInfo(name=" + str + ", sizeGroup=" + fnaVar + ")";
    }
}
