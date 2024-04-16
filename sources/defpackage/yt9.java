package defpackage;

import android.content.Intent;
import kotlin.Metadata;
/* compiled from: SberPayIntentBuilder.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lyt9;", "", "", "deepLink", "Landroid/content/Intent;", "a", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yt9  reason: default package */
/* loaded from: classes2.dex */
public final class yt9 {
    public final Intent a(String str) {
        z65.h(str, "deepLink");
        Intent parseUri = Intent.parseUri(str, 0);
        parseUri.setPackage("ru.sberbankmobile");
        parseUri.setFlags(268468224);
        z65.g(parseUri, "apply(...)");
        return parseUri;
    }
}
