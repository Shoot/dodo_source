package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.ranges.i;
/* compiled from: Xyz.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lccc;", "Ljd1;", "", "x", "o", "", "component", "f", e.a, "", "v", "l", "v0", "v1", "v2", "", "j", "(FFF)J", Image.TYPE_MEDIUM, "(FFF)F", "y", "z", "a", "colorSpace", "Luc1;", "n", "(FFFFLjd1;)J", "b", "", Action.NAME_ATTRIBUTE, "id", "<init>", "(Ljava/lang/String;I)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ccc  reason: default package */
/* loaded from: classes.dex */
public final class ccc extends jd1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccc(String str, int i) {
        super(str, ad1.a.c(), i, null);
        z65.h(str, Action.NAME_ATTRIBUTE);
    }

    private final float o(float f) {
        float k;
        k = i.k(f, -2.0f, 2.0f);
        return k;
    }

    @Override // defpackage.jd1
    public float[] b(float[] fArr) {
        z65.h(fArr, "v");
        fArr[0] = o(fArr[0]);
        fArr[1] = o(fArr[1]);
        fArr[2] = o(fArr[2]);
        return fArr;
    }

    @Override // defpackage.jd1
    public float e(int i) {
        return 2.0f;
    }

    @Override // defpackage.jd1
    public float f(int i) {
        return -2.0f;
    }

    @Override // defpackage.jd1
    public long j(float f, float f2, float f3) {
        float o = o(f);
        float o2 = o(f2);
        return (Float.floatToIntBits(o2) & 4294967295L) | (Float.floatToIntBits(o) << 32);
    }

    @Override // defpackage.jd1
    public float[] l(float[] fArr) {
        z65.h(fArr, "v");
        fArr[0] = o(fArr[0]);
        fArr[1] = o(fArr[1]);
        fArr[2] = o(fArr[2]);
        return fArr;
    }

    @Override // defpackage.jd1
    public float m(float f, float f2, float f3) {
        return o(f3);
    }

    @Override // defpackage.jd1
    public long n(float f, float f2, float f3, float f4, jd1 jd1Var) {
        z65.h(jd1Var, "colorSpace");
        return yc1.a(o(f), o(f2), o(f3), f4, jd1Var);
    }
}
