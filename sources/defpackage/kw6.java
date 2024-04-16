package defpackage;

import androidx.annotation.NonNull;
/* compiled from: NetworkState.java */
/* renamed from: kw6  reason: default package */
/* loaded from: classes.dex */
public class kw6 {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;

    public kw6(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public boolean a() {
        return this.a;
    }

    public boolean b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw6)) {
            return false;
        }
        kw6 kw6Var = (kw6) obj;
        if (this.a == kw6Var.a && this.b == kw6Var.b && this.c == kw6Var.c && this.d == kw6Var.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r0 = this.a;
        int i = r0;
        if (this.b) {
            i = r0 + 16;
        }
        int i2 = i;
        if (this.c) {
            i2 = i + 256;
        }
        if (this.d) {
            return i2 + 4096;
        }
        return i2;
    }

    @NonNull
    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d));
    }
}
