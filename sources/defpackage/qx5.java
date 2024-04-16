package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: qx5  reason: default package */
/* loaded from: classes2.dex */
public class qx5 {
    private final String a;
    private final String b;
    private final mg4 c;
    private final int d;

    public qx5(@NonNull String str, @NonNull String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.b = sb;
        this.a = str;
        this.c = new mg4(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.a, i)) {
            i++;
        }
        this.d = i;
    }

    public void a(@NonNull String str, @NonNull Object... objArr) {
        if (d(3)) {
            Log.d(this.a, c(str, objArr));
        }
    }

    public void b(@NonNull String str, @NonNull Object... objArr) {
        Log.e(this.a, c(str, objArr));
    }

    @NonNull
    protected String c(@NonNull String str, @NonNull Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.b.concat(str);
    }

    public boolean d(int i) {
        if (this.d <= i) {
            return true;
        }
        return false;
    }
}
