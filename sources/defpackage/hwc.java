package defpackage;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: hwc  reason: default package */
/* loaded from: classes2.dex */
public final class hwc implements Runnable {
    private static final qx5 c = new qx5("RevokeAccessOperation", new String[0]);
    private final String a;
    private final twa b = new twa(null);

    private hwc(String str) {
        this.a = gh8.f(str);
    }

    public static sx7<Status> a(String str) {
        if (str == null) {
            return ux7.a(new Status(4), null);
        }
        hwc hwcVar = new hwc(str);
        new Thread(hwcVar).start();
        return hwcVar.b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        String str3;
        Status status = Status.i;
        try {
            String valueOf = String.valueOf(this.a);
            if (valueOf.length() != 0) {
                str3 = "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf);
            } else {
                str3 = new String("https://accounts.google.com/o/oauth2/revoke?token=");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str3).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.g;
            } else {
                c.b("Unable to revoke access!", new Object[0]);
            }
            qx5 qx5Var = c;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            qx5Var.a(sb.toString(), new Object[0]);
        } catch (IOException e) {
            qx5 qx5Var2 = c;
            String valueOf2 = String.valueOf(e.toString());
            if (valueOf2.length() != 0) {
                str2 = "IOException when revoking access: ".concat(valueOf2);
            } else {
                str2 = new String("IOException when revoking access: ");
            }
            qx5Var2.b(str2, new Object[0]);
        } catch (Exception e2) {
            qx5 qx5Var3 = c;
            String valueOf3 = String.valueOf(e2.toString());
            if (valueOf3.length() != 0) {
                str = "Exception when revoking access: ".concat(valueOf3);
            } else {
                str = new String("Exception when revoking access: ");
            }
            qx5Var3.b(str, new Object[0]);
        }
        this.b.setResult(status);
    }
}
