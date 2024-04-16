package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* renamed from: jyc  reason: default package */
/* loaded from: classes2.dex */
public final class jyc implements rad {
    private static final Uri b;
    private final LogPrinter a = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        b = builder.build();
    }

    @Override // defpackage.rad
    public final void a(a0d a0dVar) {
        ArrayList arrayList = new ArrayList(a0dVar.e());
        Collections.sort(arrayList, new ixc(this));
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String obj = ((g2d) arrayList.get(i)).toString();
            if (!TextUtils.isEmpty(obj)) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(obj);
            }
        }
        this.a.println(sb.toString());
    }

    @Override // defpackage.rad
    public final Uri b() {
        return b;
    }
}
