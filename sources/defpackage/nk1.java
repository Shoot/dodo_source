package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _ComparisonsJvm.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u00020\u0002\"\u00020\u0000H\u0007\u001a\u001c\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u00020\u0002\"\u00020\u0000H\u0007¨\u0006\u0006"}, d2 = {"", "a", "", "other", "g", Image.TYPE_HIGH, "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/comparisons/ComparisonsKt")
/* renamed from: nk1  reason: default package */
/* loaded from: classes3.dex */
public class nk1 extends mk1 {
    public static float g(float f, float... fArr) {
        z65.h(fArr, "other");
        for (float f2 : fArr) {
            f = Math.max(f, f2);
        }
        return f;
    }

    public static float h(float f, float... fArr) {
        z65.h(fArr, "other");
        for (float f2 : fArr) {
            f = Math.min(f, f2);
        }
        return f;
    }
}
