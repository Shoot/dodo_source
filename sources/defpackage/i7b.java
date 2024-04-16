package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.Metadata;
/* compiled from: TaskLogger.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a$\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t¨\u0006\f"}, d2 = {"Ljava/util/logging/Logger;", "Lx6b;", "task", "Lj7b;", "queue", "", "message", "", c.a, "", "ns", "b", "okhttp"}, k = 2, mv = {1, 9, 0})
/* renamed from: i7b  reason: default package */
/* loaded from: classes3.dex */
public final class i7b {
    public static final String b(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        pza pzaVar = pza.a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        z65.g(format, "format(...)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Logger logger, x6b x6bVar, j7b j7bVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(j7bVar.h());
        sb.append(' ');
        pza pzaVar = pza.a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        z65.g(format, "format(...)");
        sb.append(format);
        sb.append(": ");
        sb.append(x6bVar.b());
        logger.fine(sb.toString());
    }
}
