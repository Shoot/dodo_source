package defpackage;

import kotlin.Metadata;
/* compiled from: PackageReference.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001e\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0014"}, d2 = {"Lvo7;", "Li81;", "", "other", "", "equals", "", "hashCode", "", "toString", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "b", "()Ljava/lang/Class;", "jClass", "Ljava/lang/String;", "moduleName", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: vo7  reason: default package */
/* loaded from: classes3.dex */
public final class vo7 implements i81 {
    private final Class<?> a;
    private final String b;

    public vo7(Class<?> cls, String str) {
        z65.h(cls, "jClass");
        z65.h(str, "moduleName");
        this.a = cls;
        this.b = str;
    }

    @Override // defpackage.i81
    public Class<?> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof vo7) && z65.c(b(), ((vo7) obj).b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
