package defpackage;

import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: LineBreak.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\t\u001a \u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0002\u001a\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¨\u0006\t"}, d2 = {"", "i1", "i2", "i3", e.a, "mask", "f", "g", Image.TYPE_HIGH, "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: wp5  reason: default package */
/* loaded from: classes.dex */
public final class wp5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(int i, int i2, int i3) {
        return i | (i2 << 8) | (i3 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(int i) {
        return i & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(int i) {
        return (i >> 8) & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(int i) {
        return (i >> 16) & 255;
    }
}
