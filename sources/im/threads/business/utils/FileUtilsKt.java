package im.threads.business.utils;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import ch.qos.logback.core.util.FileSize;
import im.threads.R;
import im.threads.business.config.BaseConfig;
import im.threads.business.logger.LoggerEdna;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: FileUtils.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0016\u0010\n\u001a\u00020\u0001*\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¨\u0006\r"}, d2 = {"format", "", "value", "", "divider", "unit", "getDuration", "Landroid/media/MediaMetadataRetriever;", "uri", "Landroid/net/Uri;", "toFileSize", "appContext", "Landroid/content/Context;", "threads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileUtilsKt {
    private static final String format(long j, long j2, String str) {
        double d = j;
        if (j2 > 1) {
            d /= j2;
        }
        return new DecimalFormat("#,##0.#").format(d) + " " + str;
    }

    public static final long getDuration(MediaMetadataRetriever mediaMetadataRetriever, Uri uri) {
        z65.h(mediaMetadataRetriever, "<this>");
        z65.h(uri, "uri");
        try {
            try {
                mediaMetadataRetriever.setDataSource(BaseConfig.Companion.getInstance().context, uri);
            } catch (Exception unused) {
                return 0L;
            }
        } catch (Exception unused2) {
            mediaMetadataRetriever.setDataSource(uri.toString(), new LinkedHashMap());
        }
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        if (extractMetadata == null) {
            return 0L;
        }
        return Long.parseLong(extractMetadata);
    }

    public static final String toFileSize(long j, Context context) {
        if (context == null) {
            context = BaseConfig.Companion.getInstance().context;
        }
        long[] jArr = {1099511627776L, FileSize.GB_COEFFICIENT, 1048576, FileSize.KB_COEFFICIENT, 1};
        String[] strArr = {context.getString(R.string.ecc_tbytes), context.getString(R.string.ecc_gbytes), context.getString(R.string.ecc_mbytes), context.getString(R.string.ecc_kbytes), context.getString(R.string.ecc_bytes)};
        if (j < 0) {
            LoggerEdna.error("Invalid file size: " + j);
            String str = strArr[0];
            return "0 " + str;
        }
        for (int i = 0; i < 5; i++) {
            long j2 = jArr[i];
            if (j >= j2) {
                String str2 = strArr[i];
                z65.g(str2, "units[i]");
                return format(j, j2, str2);
            }
        }
        return "";
    }

    public static /* synthetic */ String toFileSize$default(long j, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        return toFileSize(j, context);
    }
}
