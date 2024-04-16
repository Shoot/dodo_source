package im.threads.business.utils;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.io.File;
import kotlin.Metadata;
/* compiled from: FileProvider.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lim/threads/business/utils/FileProvider;", "", "()V", "authorityPostfix", "", "getUriForFile", "Landroid/net/Uri;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", Action.FILE_ATTRIBUTE, "Ljava/io/File;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileProvider {
    private final String authorityPostfix = ".im.threads.fileprovider";

    public final Uri getUriForFile(Context context, File file) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(file, Action.FILE_ATTRIBUTE);
        String packageName = context.getPackageName();
        String str = this.authorityPostfix;
        Uri uriForFile = androidx.core.content.FileProvider.getUriForFile(context, packageName + str, file);
        z65.g(uriForFile, "getUriForFile(\n         …           file\n        )");
        return uriForFile;
    }
}
