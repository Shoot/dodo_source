package defpackage;

import android.graphics.drawable.Drawable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: HalvesProductCardGlideTarget.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001f\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lbl4;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroid/graphics/drawable/Drawable;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "()Ljava/util/concurrent/atomic/AtomicReference;", "firstDrawable", "b", "secondDrawable", "<init>", "(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: bl4  reason: default package */
/* loaded from: classes4.dex */
public final class bl4 {
    private final AtomicReference<Drawable> a;
    private final AtomicReference<Drawable> b;

    public bl4() {
        this(null, null, 3, null);
    }

    public final AtomicReference<Drawable> a() {
        return this.a;
    }

    public final AtomicReference<Drawable> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl4)) {
            return false;
        }
        bl4 bl4Var = (bl4) obj;
        if (z65.c(this.a, bl4Var.a) && z65.c(this.b, bl4Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        AtomicReference<Drawable> atomicReference = this.a;
        AtomicReference<Drawable> atomicReference2 = this.b;
        return "HalvesDrawableHolder(firstDrawable=" + atomicReference + ", secondDrawable=" + atomicReference2 + ")";
    }

    public bl4(AtomicReference<Drawable> atomicReference, AtomicReference<Drawable> atomicReference2) {
        z65.h(atomicReference, "firstDrawable");
        z65.h(atomicReference2, "secondDrawable");
        this.a = atomicReference;
        this.b = atomicReference2;
    }

    public /* synthetic */ bl4(AtomicReference atomicReference, AtomicReference atomicReference2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AtomicReference(null) : atomicReference, (i & 2) != 0 ? new AtomicReference(null) : atomicReference2);
    }
}
