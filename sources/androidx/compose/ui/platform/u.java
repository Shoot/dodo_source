package androidx.compose.ui.platform;

import kotlin.Metadata;
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0013\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/u;", "Lha7;", "", "", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "a", "F", "_start", "b", "_endExclusive", com.huawei.hms.opendevice.c.a, "()Ljava/lang/Float;", "start", "endExclusive", "<init>", "(FF)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class u implements ha7<Float> {
    private final float a;
    private final float b;

    public u(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.ha7
    /* renamed from: b */
    public Float a() {
        return Float.valueOf(this.b);
    }

    @Override // defpackage.ha7
    /* renamed from: c */
    public Float d() {
        return Float.valueOf(this.a);
    }

    public boolean equals(Object obj) {
        if (obj instanceof u) {
            if (!isEmpty() || !((u) obj).isEmpty()) {
                u uVar = (u) obj;
                if (this.a != uVar.a || this.b != uVar.b) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    @Override // defpackage.ha7
    public boolean isEmpty() {
        if (this.a >= this.b) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.a + "..<" + this.b;
    }
}
