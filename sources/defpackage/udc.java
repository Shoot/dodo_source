package defpackage;

import java.text.Normalizer;
import kotlin.Metadata;
/* compiled from: -NormalizeJvm.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"", "string", "a", "okhttp"}, k = 2, mv = {1, 9, 0})
/* renamed from: udc  reason: default package */
/* loaded from: classes3.dex */
public final class udc {
    public static final String a(String str) {
        z65.h(str, "string");
        String normalize = Normalizer.normalize(str, Normalizer.Form.NFC);
        z65.g(normalize, "normalize(...)");
        return normalize;
    }
}
