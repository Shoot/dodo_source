package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.io.File;
import kotlin.Metadata;
/* compiled from: FileProviderUriGetter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Landroid/net/Uri;", "a", "feature-base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: cu3  reason: default package */
/* loaded from: classes.dex */
public final class cu3 {
    public static final Uri a(Context context, File file) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(file, Action.FILE_ATTRIBUTE);
        String packageName = context.getPackageName();
        Uri uriForFile = FileProvider.getUriForFile(context, packageName + ".featurebase.fileprovider", file);
        z65.g(uriForFile, "getUriForFile(...)");
        return uriForFile;
    }
}
