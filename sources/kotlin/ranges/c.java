package kotlin.ranges;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import kotlin.Metadata;
/* compiled from: Ranges.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0013\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0011¨\u0006\u0016"}, d2 = {"Lkotlin/ranges/c;", "Lca1;", "", "", com.huawei.hms.opendevice.c.a, "", "other", "equals", "", "hashCode", "", "toString", "a", "F", "_start", "b", "_endInclusive", "()Ljava/lang/Float;", "start", "endInclusive", "<init>", "(FF)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c implements ca1<Float> {
    private final float a;
    private final float b;

    public c(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.da1
    /* renamed from: a */
    public Float g() {
        return Float.valueOf(this.b);
    }

    @Override // defpackage.da1
    /* renamed from: b */
    public Float d() {
        return Float.valueOf(this.a);
    }

    public boolean c() {
        if (this.a > this.b) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!c() || !((c) obj).c()) {
                c cVar = (c) obj;
                if (this.a != cVar.a || this.b != cVar.b) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (c()) {
            return -1;
        }
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public String toString() {
        return this.a + CallerDataConverter.DEFAULT_RANGE_DELIMITER + this.b;
    }
}
