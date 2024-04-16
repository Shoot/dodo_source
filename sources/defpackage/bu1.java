package defpackage;

import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: ContentScale.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a%\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a%\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a%\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcna;", "srcSize", "dstSize", "", "f", "(JJ)F", "g", Image.TYPE_HIGH, e.a, "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: bu1  reason: default package */
/* loaded from: classes.dex */
public final class bu1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(long j, long j2) {
        return cna.g(j2) / cna.g(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(long j, long j2) {
        return Math.max(h(j, j2), e(j, j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(long j, long j2) {
        return Math.min(h(j, j2), e(j, j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(long j, long j2) {
        return cna.i(j2) / cna.i(j);
    }
}
