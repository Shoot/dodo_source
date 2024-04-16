package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: EditCommand.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0019J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0015¨\u0006\u001a"}, d2 = {"Llj1;", "Lad3;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lml;", "a", "Lml;", "getAnnotatedString", "()Lml;", "annotatedString", "b", "I", "getNewCursorPosition", "()I", "newCursorPosition", "()Ljava/lang/String;", "text", "<init>", "(Lml;I)V", "(Ljava/lang/String;I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: lj1  reason: default package */
/* loaded from: classes.dex */
public final class lj1 implements ad3 {
    private final ml a;
    private final int b;

    public lj1(ml mlVar, int i) {
        z65.h(mlVar, "annotatedString");
        this.a = mlVar;
        this.b = i;
    }

    public final String a() {
        return this.a.h();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj1)) {
            return false;
        }
        lj1 lj1Var = (lj1) obj;
        if (z65.c(a(), lj1Var.a()) && this.b == lj1Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (a().hashCode() * 31) + this.b;
    }

    public String toString() {
        return "CommitTextCommand(text='" + a() + "', newCursorPosition=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lj1(String str, int i) {
        this(new ml(str, null, null, 6, null), i);
        z65.h(str, "text");
    }
}
