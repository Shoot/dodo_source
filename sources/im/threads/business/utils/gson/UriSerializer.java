package im.threads.business.utils.gson;

import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Type;
import kotlin.Metadata;
/* compiled from: UriSerializer.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lim/threads/business/utils/gson/UriSerializer;", "Lhc5;", "Landroid/net/Uri;", "src", "Ljava/lang/reflect/Type;", "typeOfSrc", "Lec5;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lpa5;", "serialize", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class UriSerializer implements hc5<Uri> {
    @Override // defpackage.hc5
    public pa5 serialize(Uri uri, Type type, ec5 ec5Var) {
        z65.h(uri, "src");
        z65.h(type, "typeOfSrc");
        z65.h(ec5Var, CoreConstants.CONTEXT_SCOPE_VALUE);
        return new qb5(uri.toString());
    }
}
