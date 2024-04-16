package defpackage;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.framework.common.ContainerUtils;
import java.net.HttpURLConnection;
/* compiled from: TileSourcePolicy.java */
/* renamed from: agb  reason: default package */
/* loaded from: classes3.dex */
public class agb {
    private final int a;
    private final int b;

    public agb() {
        this(0, 0);
    }

    private boolean a() {
        if ((this.b & 4) == 0) {
            return true;
        }
        return false;
    }

    public boolean b() {
        if ((this.b & 2) == 0) {
            return true;
        }
        return false;
    }

    public boolean c(String str) {
        if (a()) {
            return true;
        }
        if (str != null && str.trim().length() > 0 && !str.equals("osmdroid")) {
            return true;
        }
        return false;
    }

    public long d(String str, String str2, long j) {
        Long G = dq1.a().G();
        if (G != null) {
            return j + G.longValue();
        }
        long E = dq1.a().E();
        Long f = f(str2);
        if (f != null) {
            return j + (f.longValue() * 1000) + E;
        }
        Long g = g(str);
        if (g != null) {
            return g.longValue() + E;
        }
        return j + CoreConstants.MILLIS_IN_ONE_WEEK + E;
    }

    public long e(HttpURLConnection httpURLConnection, long j) {
        String headerField = httpURLConnection.getHeaderField("Expires");
        String headerField2 = httpURLConnection.getHeaderField("Cache-Control");
        long d = d(headerField, headerField2, j);
        if (dq1.a().H()) {
            Log.d("OsmDroid", "computeExpirationTime('" + headerField + "','" + headerField2 + "'," + j + ContainerUtils.KEY_VALUE_DELIMITER + d);
        }
        return d;
    }

    public Long f(String str) {
        String[] split;
        if (str != null && str.length() > 0) {
            try {
                for (String str2 : str.split(", ")) {
                    if (str2.indexOf("max-age=") == 0) {
                        return Long.valueOf(str2.substring(8));
                    }
                }
                return null;
            } catch (Exception e) {
                if (dq1.a().H()) {
                    Log.d("OsmDroid", "Unable to parse cache control tag for tile, server returned " + str, e);
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public Long g(String str) {
        if (str != null && str.length() > 0) {
            try {
                return Long.valueOf(dq1.a().k().parse(str).getTime());
            } catch (Exception e) {
                if (dq1.a().H()) {
                    Log.d("OsmDroid", "Unable to parse expiration tag for tile, server returned " + str, e);
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public int h() {
        return this.a;
    }

    public boolean i() {
        if ((this.b & 8) != 0) {
            return true;
        }
        return false;
    }

    public agb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
