package defpackage;

import android.util.Pair;
import androidx.annotation.NonNull;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
/* compiled from: NetworkFetcher.java */
/* renamed from: aw6  reason: default package */
/* loaded from: classes.dex */
public class aw6 {
    @NonNull
    private final xv6 a;
    @NonNull
    private final vz5 b;

    public aw6(@NonNull xv6 xv6Var, @NonNull vz5 vz5Var) {
        this.a = xv6Var;
        this.b = vz5Var;
    }

    private ez5 a(@NonNull String str, String str2) {
        Pair<vt3, InputStream> a;
        yz5<ez5> o;
        if (str2 == null || (a = this.a.a(str)) == null) {
            return null;
        }
        vt3 vt3Var = (vt3) a.first;
        InputStream inputStream = (InputStream) a.second;
        if (vt3Var == vt3.ZIP) {
            o = nz5.y(new ZipInputStream(inputStream), str);
        } else {
            o = nz5.o(inputStream, str);
        }
        if (o.b() == null) {
            return null;
        }
        return o.b();
    }

    @NonNull
    private yz5<ez5> b(@NonNull String str, String str2) {
        boolean z;
        ox5.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                pz5 a = this.b.a(str);
                if (a.isSuccessful()) {
                    yz5<ez5> d = d(str, a.i0(), a.f(), str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Completed fetch from network. Success: ");
                    if (d.b() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(z);
                    ox5.a(sb.toString());
                    try {
                        a.close();
                    } catch (IOException e) {
                        ox5.d("LottieFetchResult close failed ", e);
                    }
                    return d;
                }
                yz5<ez5> yz5Var = new yz5<>(new IllegalArgumentException(a.g()));
                try {
                    a.close();
                } catch (IOException e2) {
                    ox5.d("LottieFetchResult close failed ", e2);
                }
                return yz5Var;
            } catch (Exception e3) {
                yz5<ez5> yz5Var2 = new yz5<>(e3);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e4) {
                        ox5.d("LottieFetchResult close failed ", e4);
                    }
                }
                return yz5Var2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e5) {
                    ox5.d("LottieFetchResult close failed ", e5);
                }
            }
            throw th;
        }
    }

    @NonNull
    private yz5<ez5> d(@NonNull String str, @NonNull InputStream inputStream, String str2, String str3) throws IOException {
        vt3 vt3Var;
        yz5<ez5> f;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            ox5.a("Received json response.");
            vt3Var = vt3.JSON;
            f = e(str, inputStream, str3);
        } else {
            ox5.a("Handling zip response.");
            vt3Var = vt3.ZIP;
            f = f(str, inputStream, str3);
        }
        if (str3 != null && f.b() != null) {
            this.a.e(str, vt3Var);
        }
        return f;
    }

    @NonNull
    private yz5<ez5> e(@NonNull String str, @NonNull InputStream inputStream, String str2) throws IOException {
        if (str2 == null) {
            return nz5.o(inputStream, null);
        }
        return nz5.o(new FileInputStream(this.a.f(str, inputStream, vt3.JSON).getAbsolutePath()), str);
    }

    @NonNull
    private yz5<ez5> f(@NonNull String str, @NonNull InputStream inputStream, String str2) throws IOException {
        if (str2 == null) {
            return nz5.y(new ZipInputStream(inputStream), null);
        }
        return nz5.y(new ZipInputStream(new FileInputStream(this.a.f(str, inputStream, vt3.ZIP))), str);
    }

    @NonNull
    public yz5<ez5> c(@NonNull String str, String str2) {
        ez5 a = a(str, str2);
        if (a != null) {
            return new yz5<>(a);
        }
        ox5.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(str, str2);
    }
}
