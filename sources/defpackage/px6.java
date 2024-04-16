package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: NetworkUtils.java */
/* renamed from: px6  reason: default package */
/* loaded from: classes.dex */
public class px6 {
    private static final Logger a = LoggerFactory.getLogger("NetworkUtils");

    public static boolean a(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL("https://www.google.com/").openConnection()));
            httpURLConnection.setRequestProperty("User-Agent", "test");
            httpURLConnection.setRequestProperty("DatabaseConnector", "close");
            httpURLConnection.setConnectTimeout(2000);
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                return true;
            }
            Logger logger = a;
            logger.warn("Check online was unsuccessful due to response code " + responseCode);
            return false;
        } catch (Throwable th) {
            Logger logger2 = a;
            logger2.warn("Check online was unsuccessful due to exception. ", th);
            logger2.error("Error while checkOnline() in " + str);
            return false;
        }
    }

    public static String b(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
            if (networkInfo.isAvailable()) {
                return d(context);
            }
            if (networkInfo2.isAvailable()) {
                return c();
            }
            return "ip ? error";
        } catch (Throwable th) {
            a.error("some trouble in NetworkUtils#getIp", th);
            return th.getClass().getSimpleName() + th.getMessage();
        }
    }

    private static String c() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        return "mobile " + nextElement.getHostAddress();
                    }
                }
            }
            return "";
        } catch (SocketException unused) {
            return "";
        }
    }

    private static String d(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                return "wifi error";
            }
            int ipAddress = wifiManager.getConnectionInfo().getIpAddress();
            return "wifi " + String.format(Locale.getDefault(), "%d.%d.%d.%d", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255));
        } catch (Exception unused) {
            return "wifi error";
        }
    }

    public static boolean e(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            if (!activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            a.error("isConnected() error", th);
            return false;
        }
    }
}
