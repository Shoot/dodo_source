package im.threads.business.utils.gson;

import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;
/* compiled from: UriDeserializer.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lim/threads/business/utils/gson/UriDeserializer;", "Loa5;", "Landroid/net/Uri;", "Lpa5;", "src", "Ljava/lang/reflect/Type;", "srcType", "Lla5;", CoreConstants.CONTEXT_SCOPE_VALUE, "deserialize", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class UriDeserializer implements oa5<Uri> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.oa5
    public Uri deserialize(pa5 pa5Var, Type type, la5 la5Var) throws JsonParseException {
        z65.h(pa5Var, "src");
        z65.h(type, "srcType");
        z65.h(la5Var, CoreConstants.CONTEXT_SCOPE_VALUE);
        Uri parse = Uri.parse(pa5Var.h());
        z65.g(parse, "parse(src.asString)");
        return parse;
    }
}
