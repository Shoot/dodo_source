package defpackage;

import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"!\u0010\u000e\u001a\u00020\t*\u00020\u00038FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"", "width", "height", "Lcna;", "a", "(FF)J", "Lk99;", c.a, "(J)Lk99;", "Ls67;", "b", "(J)J", "getCenter-uvyYCjk$annotations", "(J)V", ElementGenerator.TEXT_ALIGN_CENTER, "ui-geometry_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ina  reason: default package */
/* loaded from: classes.dex */
public final class ina {
    public static final long a(float f, float f2) {
        return cna.d((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    public static final long b(long j) {
        return x67.a(cna.i(j) / 2.0f, cna.g(j) / 2.0f);
    }

    public static final k99 c(long j) {
        return o99.a(s67.b.c(), j);
    }
}
