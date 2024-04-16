package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.UserManager;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.HwTelephonyManager;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public class NetworkUtil {
    private static final int INVALID_RSSI = -127;
    private static final String STR_NSA = "5G_NSA";
    private static final String STR_SA = "5G_SA";
    private static final String TAG = "NetworkUtil";
    private static final int TYPE_WIFI_P2P = 13;
    public static final int UNAVAILABLE = Integer.MAX_VALUE;

    /* loaded from: classes3.dex */
    public static final class NetType {
        public static final int TYPE_2G = 2;
        public static final int TYPE_3G = 3;
        public static final int TYPE_4G = 4;
        public static final int TYPE_4G_NSA = 7;
        public static final int TYPE_5G = 5;
        public static final int TYPE_5G_SA = 8;
        public static final int TYPE_MOBILE = 6;
        public static final int TYPE_NO_NETWORK = -1;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WIFI = 1;
    }

    /* loaded from: classes3.dex */
    public static final class SignalType {
        public static final String LTE_CQI = "lteCqi";
        public static final String LTE_DBM = "lteDbm";
        public static final String LTE_RSRP = "lteRsrp";
        public static final String LTE_RSRQ = "lteRsrq";
        public static final String LTE_RSSI = "lteRssi";
        public static final String LTE_RSSNR = "lteRssnr";
        public static final String NR_CSIRSRP = "nrCSIRsrp";
        public static final String NR_CSIRSRQ = "nrCSIRsrq";
        public static final String NR_CSISINR = "nrCSISinr";
        public static final String NR_DBM = "nrDbm";
        public static final String NR_SSRSRP = "nrSSRsrp";
        public static final String NR_SSRSRQ = "nrSSRsrq";
        public static final String NR_SSSINR = "nrSSSinr";
    }

    public static String getDnsServerIps(Context context) {
        return Arrays.toString(getDnsServerIpsFromConnectionManager(context));
    }

    @SuppressLint({"MissingPermission"})
    private static String[] getDnsServerIpsFromConnectionManager(Context context) {
        ConnectivityManager connectivityManager;
        Network[] allNetworks;
        NetworkInfo networkInfo;
        LinkProperties linkProperties;
        LinkedList linkedList = new LinkedList();
        if (context != null && (connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, "connectivity")) != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    for (Network network : connectivityManager.getAllNetworks()) {
                        if (network != null && (networkInfo = connectivityManager.getNetworkInfo(network)) != null && networkInfo.getType() == activeNetworkInfo.getType() && (linkProperties = connectivityManager.getLinkProperties(network)) != null) {
                            for (InetAddress inetAddress : linkProperties.getDnsServers()) {
                                linkedList.add(inetAddress.getHostAddress());
                            }
                        }
                    }
                }
            } catch (SecurityException e) {
                Logger.i(TAG, "getActiveNetworkInfo failed, exception:" + e.getClass().getSimpleName());
            } catch (RuntimeException e2) {
                Logger.i(TAG, "getActiveNetworkInfo failed, exception:" + e2.getClass().getSimpleName());
            }
        }
        if (linkedList.isEmpty()) {
            return new String[0];
        }
        return (String[]) linkedList.toArray(new String[linkedList.size()]);
    }

    public static String getHost(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new URI(str).getHost();
        } catch (URISyntaxException e) {
            Logger.w(TAG, e.getClass().getSimpleName());
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        r3 = r3.getServiceState();
     */
    @android.annotation.SuppressLint({"MissingPermission", "NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int getHwNetworkType(android.content.Context r3) {
        /*
            java.lang.String r0 = "com.huawei.android.os.BuildEx$VERSION"
            boolean r0 = com.huawei.hms.framework.common.ReflectionUtils.checkCompatible(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            if (r3 == 0) goto L3e
            java.lang.String r0 = "phone"
            java.lang.Object r3 = com.huawei.hms.framework.common.ContextCompat.getSystemService(r3, r0)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            if (r3 == 0) goto L3e
            int r0 = com.huawei.android.os.BuildEx.VERSION.EMUI_SDK_INT     // Catch: java.lang.NoClassDefFoundError -> L27 java.lang.NoSuchMethodError -> L2f java.lang.SecurityException -> L37
            r2 = 21
            if (r0 < r2) goto L3e
            android.telephony.ServiceState r3 = defpackage.rw6.a(r3)     // Catch: java.lang.NoClassDefFoundError -> L27 java.lang.NoSuchMethodError -> L2f java.lang.SecurityException -> L37
            if (r3 == 0) goto L3e
            int r1 = com.huawei.android.telephony.ServiceStateEx.getConfigRadioTechnology(r3)     // Catch: java.lang.NoClassDefFoundError -> L27 java.lang.NoSuchMethodError -> L2f java.lang.SecurityException -> L37
            goto L3e
        L27:
            java.lang.String r3 = com.huawei.hms.framework.common.NetworkUtil.TAG
            java.lang.String r0 = "NoClassDefFoundError occur in method getHwNetworkType."
            com.huawei.hms.framework.common.Logger.w(r3, r0)
            goto L3e
        L2f:
            java.lang.String r3 = com.huawei.hms.framework.common.NetworkUtil.TAG
            java.lang.String r0 = "NoSuchMethodError occur in method getHwNetworkType."
            com.huawei.hms.framework.common.Logger.w(r3, r0)
            goto L3e
        L37:
            java.lang.String r3 = com.huawei.hms.framework.common.NetworkUtil.TAG
            java.lang.String r0 = "requires permission maybe missing."
            com.huawei.hms.framework.common.Logger.w(r3, r0)
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.common.NetworkUtil.getHwNetworkType(android.content.Context):int");
    }

    public static int getInfoWithReflect(SignalStrength signalStrength, String str) {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                final Method declaredMethod = SignalStrength.class.getDeclaredMethod(str, new Class[0]);
                AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.NetworkUtil.1
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        declaredMethod.setAccessible(true);
                        return null;
                    }
                });
                return ((Integer) declaredMethod.invoke(signalStrength, new Object[0])).intValue();
            }
            return Integer.MAX_VALUE;
        } catch (IllegalAccessException unused) {
            String str2 = TAG;
            Logger.i(str2, str + " : cannot access");
            return Integer.MAX_VALUE;
        } catch (NoSuchMethodException unused2) {
            String str3 = TAG;
            Logger.i(str3, str + " : function not found");
            return Integer.MAX_VALUE;
        } catch (InvocationTargetException unused3) {
            String str4 = TAG;
            Logger.i(str4, str + " : InvocationTargetException");
            return Integer.MAX_VALUE;
        } catch (Throwable th) {
            String str5 = TAG;
            Logger.i(str5, str + " : throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getLteCqi(Context context) {
        List cellSignalStrengths;
        int cqi;
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getLteCqi: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT > 28) {
            cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
            if (cellSignalStrengths.size() > 0) {
                cqi = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getCqi();
                return cqi;
            }
            return Integer.MAX_VALUE;
        }
        return getInfoWithReflect(signalStrength, "getLteCqi");
    }

    public static int getLteRsrp(Context context) {
        List cellSignalStrengths;
        int rsrp;
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getLteRsrp: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT > 28) {
            cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
            if (cellSignalStrengths.size() > 0) {
                rsrp = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrp();
                return rsrp;
            }
            return Integer.MAX_VALUE;
        }
        return getInfoWithReflect(signalStrength, "getLteRsrp");
    }

    public static int getLteRsrq(Context context) {
        List cellSignalStrengths;
        int rsrq;
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getLteRsrq: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT > 28) {
            cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
            if (cellSignalStrengths.size() > 0) {
                rsrq = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrq();
                return rsrq;
            }
            return Integer.MAX_VALUE;
        }
        return getInfoWithReflect(signalStrength, "getLteRsrq");
    }

    public static int getLteRssi(Context context) {
        List cellSignalStrengths;
        int rssi;
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return Integer.MAX_VALUE;
        }
        try {
            if (Build.VERSION.SDK_INT > 28) {
                cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    rssi = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssi();
                    return rssi;
                }
            }
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getLteRssi: throwable:" + th.getClass());
        }
        return Integer.MAX_VALUE;
    }

    public static int getLteRssnr(Context context) {
        List cellSignalStrengths;
        int rssnr;
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getLteRssnr: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT > 28) {
            cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
            if (cellSignalStrengths.size() > 0) {
                rssnr = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssnr();
                return rssnr;
            }
            return Integer.MAX_VALUE;
        }
        return getInfoWithReflect(signalStrength, "getLteRssnr");
    }

    public static Map<String, Integer> getLteSignalInfo(Context context) {
        List cellSignalStrengths;
        int rsrp;
        int rsrq;
        int rssnr;
        int cqi;
        int rssi;
        HashMap hashMap = new HashMap();
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return hashMap;
        }
        try {
            if (Build.VERSION.SDK_INT > 28) {
                cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    hashMap.put(SignalType.LTE_DBM, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getDbm()));
                    rsrp = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrp();
                    hashMap.put(SignalType.LTE_RSRP, Integer.valueOf(rsrp));
                    rsrq = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrq();
                    hashMap.put(SignalType.LTE_RSRQ, Integer.valueOf(rsrq));
                    rssnr = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssnr();
                    hashMap.put(SignalType.LTE_RSSNR, Integer.valueOf(rssnr));
                    cqi = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getCqi();
                    hashMap.put(SignalType.LTE_CQI, Integer.valueOf(cqi));
                    rssi = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssi();
                    hashMap.put(SignalType.LTE_RSSI, Integer.valueOf(rssi));
                }
            } else {
                hashMap.put(SignalType.LTE_DBM, Integer.valueOf(getInfoWithReflect(signalStrength, "getDbm")));
                hashMap.put(SignalType.LTE_RSRP, Integer.valueOf(getInfoWithReflect(signalStrength, "getLteRsrp")));
                hashMap.put(SignalType.LTE_RSRQ, Integer.valueOf(getInfoWithReflect(signalStrength, "getLteRsrq")));
                hashMap.put(SignalType.LTE_RSSNR, Integer.valueOf(getInfoWithReflect(signalStrength, "getLteRssnr")));
                hashMap.put(SignalType.LTE_CQI, Integer.valueOf(getInfoWithReflect(signalStrength, "getLteCqi")));
            }
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getLteRssi: throwable:" + th.getClass());
        }
        return hashMap;
    }

    public static String getMNC(Context context) {
        TelephonyManager telephonyManager;
        if (context == null || !isSimReady(context)) {
            return "unknown";
        }
        Object systemService = ContextCompat.getSystemService(context, "phone");
        if (systemService instanceof TelephonyManager) {
            telephonyManager = (TelephonyManager) systemService;
        } else {
            telephonyManager = null;
        }
        if (telephonyManager == null) {
            Logger.e(TAG, "getSubscriptionOperatorType: other error!");
            return "unknown";
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        if (!"46001".equals(networkOperator) && !"46006".equals(networkOperator) && !"46009".equals(networkOperator)) {
            if (!"46000".equals(networkOperator) && !"46002".equals(networkOperator) && !"46004".equals(networkOperator) && !"46007".equals(networkOperator)) {
                if (!"46003".equals(networkOperator) && !"46005".equals(networkOperator) && !"46011".equals(networkOperator)) {
                    return "other";
                }
                return "China_Telecom";
            }
            return "China_Mobile";
        }
        return "China_Unicom";
    }

    public static int getMobileRsrp(Context context) {
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return Integer.MAX_VALUE;
        }
        try {
            if (Build.VERSION.SDK_INT > 28) {
                return getMobileSingalStrengthUpPPlatfrom(context);
            }
            return getInfoWithReflect(signalStrength, "getDbm");
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getDbm: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    private static int getMobileSingalStrengthUpPPlatfrom(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        List cellSignalStrengths2;
        List cellSignalStrengths3;
        List cellSignalStrengths4;
        List cellSignalStrengths5;
        int i = Integer.MAX_VALUE;
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        int networkType = getNetworkType(context);
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getMobileSingalStrength: throwable:" + th.getClass());
        }
        if (networkType == 3) {
            cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthCdma.class);
            if (cellSignalStrengths.size() <= 0) {
                cellSignalStrengths2 = signalStrength.getCellSignalStrengths(yw6.a());
                if (cellSignalStrengths2.size() > 0) {
                    i = zw6.a(cellSignalStrengths2.get(0)).getDbm();
                } else {
                    cellSignalStrengths3 = signalStrength.getCellSignalStrengths(CellSignalStrengthWcdma.class);
                    if (cellSignalStrengths3.size() > 0) {
                        i = ((CellSignalStrengthWcdma) cellSignalStrengths3.get(0)).getDbm();
                    }
                }
            } else {
                i = ((CellSignalStrengthCdma) cellSignalStrengths.get(0)).getDbm();
            }
        } else if (networkType == 4) {
            cellSignalStrengths4 = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
            if (cellSignalStrengths4.size() > 0) {
                i = ((CellSignalStrengthLte) cellSignalStrengths4.get(0)).getDbm();
            }
        } else {
            if (networkType == 5) {
                cellSignalStrengths5 = signalStrength.getCellSignalStrengths(ix6.a());
                if (cellSignalStrengths5.size() > 0) {
                    i = jx6.a(cellSignalStrengths5.get(0)).getDbm();
                }
            }
            return i;
        }
        return i;
    }

    public static String getNetWorkNSAorSA() {
        try {
            HwTelephonyManager hwTelephonyManager = HwTelephonyManager.getDefault();
            int default4GSlotId = hwTelephonyManager.getDefault4GSlotId();
            String str = TAG;
            Logger.v(str, "phoneId " + default4GSlotId);
            boolean isNsaState = hwTelephonyManager.isNsaState(default4GSlotId);
            Logger.v(str, "isNsa " + isNsaState);
            if (isNsaState) {
                return STR_NSA;
            }
            return STR_SA;
        } catch (Throwable unused) {
            Logger.v(TAG, "isNsaState error");
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static NetworkInfo getNetworkInfo(Context context) {
        ConnectivityManager connectivityManager;
        if (!ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, "connectivity")) == null) {
            return null;
        }
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (RuntimeException e) {
            String str = TAG;
            Logger.i(str, "getActiveNetworkInfo failed, exception:" + e.getClass().getSimpleName() + e.getMessage());
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static NetworkInfo.DetailedState getNetworkStatus(Context context) {
        NetworkInfo.DetailedState detailedState = NetworkInfo.DetailedState.IDLE;
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "connectivity");
            if (systemService instanceof ConnectivityManager) {
                try {
                    if (!ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                        return detailedState;
                    }
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        detailedState = activeNetworkInfo.getDetailedState();
                    } else {
                        Logger.i(TAG, "getNetworkStatus networkIsConnected netInfo is null!");
                    }
                } catch (RuntimeException e) {
                    String str = TAG;
                    Logger.i(str, "getNetworkStatus exception" + e.getClass().getSimpleName() + e.getMessage());
                }
            } else {
                Logger.i(TAG, "getNetworkStatus ConnectivityManager is null!");
            }
        }
        return detailedState;
    }

    public static int getNetworkType(Context context) {
        if (context != null) {
            return getNetworkType(getNetworkInfo(context), context);
        }
        return 0;
    }

    public static int getNrCsiRsrp(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        int csiRsrp;
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getNrCsiRsrp: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        cellSignalStrengths = signalStrength.getCellSignalStrengths(ix6.a());
        if (cellSignalStrengths.size() > 0) {
            csiRsrp = jx6.a(cellSignalStrengths.get(0)).getCsiRsrp();
            return csiRsrp;
        }
        return Integer.MAX_VALUE;
    }

    public static int getNrCsiRsrq(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        int csiRsrq;
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getNrCsiRsrq: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        cellSignalStrengths = signalStrength.getCellSignalStrengths(ix6.a());
        if (cellSignalStrengths.size() > 0) {
            csiRsrq = jx6.a(cellSignalStrengths.get(0)).getCsiRsrq();
            return csiRsrq;
        }
        return Integer.MAX_VALUE;
    }

    public static int getNrCsiSinr(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        int csiSinr;
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getNrCsiSinr: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        cellSignalStrengths = signalStrength.getCellSignalStrengths(ix6.a());
        if (cellSignalStrengths.size() > 0) {
            csiSinr = jx6.a(cellSignalStrengths.get(0)).getCsiSinr();
            return csiSinr;
        }
        return Integer.MAX_VALUE;
    }

    public static Map<String, Integer> getNrSignalInfo(Context context) {
        List cellSignalStrengths;
        int dbm;
        int csiRsrp;
        int csiRsrq;
        int csiSinr;
        int ssRsrp;
        int ssRsrq;
        int ssSinr;
        HashMap hashMap = new HashMap();
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return hashMap;
        }
        try {
            if (Build.VERSION.SDK_INT > 28) {
                cellSignalStrengths = signalStrength.getCellSignalStrengths(ix6.a());
                if (cellSignalStrengths.size() > 0) {
                    dbm = jx6.a(cellSignalStrengths.get(0)).getDbm();
                    hashMap.put(SignalType.NR_DBM, Integer.valueOf(dbm));
                    csiRsrp = jx6.a(cellSignalStrengths.get(0)).getCsiRsrp();
                    hashMap.put(SignalType.NR_CSIRSRP, Integer.valueOf(csiRsrp));
                    csiRsrq = jx6.a(cellSignalStrengths.get(0)).getCsiRsrq();
                    hashMap.put(SignalType.NR_CSIRSRQ, Integer.valueOf(csiRsrq));
                    csiSinr = jx6.a(cellSignalStrengths.get(0)).getCsiSinr();
                    hashMap.put(SignalType.NR_CSISINR, Integer.valueOf(csiSinr));
                    ssRsrp = jx6.a(cellSignalStrengths.get(0)).getSsRsrp();
                    hashMap.put(SignalType.NR_SSRSRP, Integer.valueOf(ssRsrp));
                    ssRsrq = jx6.a(cellSignalStrengths.get(0)).getSsRsrq();
                    hashMap.put(SignalType.NR_SSRSRQ, Integer.valueOf(ssRsrq));
                    ssSinr = jx6.a(cellSignalStrengths.get(0)).getSsSinr();
                    hashMap.put(SignalType.NR_SSSINR, Integer.valueOf(ssSinr));
                }
            }
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getLteRssi: throwable:" + th.getClass());
        }
        return hashMap;
    }

    public static int getNrSsRsrp(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        int ssRsrp;
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getNrSsRsrp: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        cellSignalStrengths = signalStrength.getCellSignalStrengths(ix6.a());
        if (cellSignalStrengths.size() > 0) {
            ssRsrp = jx6.a(cellSignalStrengths.get(0)).getSsRsrp();
            return ssRsrp;
        }
        return Integer.MAX_VALUE;
    }

    public static int getNrSsRsrq(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        int ssRsrq;
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getNrSsRsrq: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        cellSignalStrengths = signalStrength.getCellSignalStrengths(ix6.a());
        if (cellSignalStrengths.size() > 0) {
            ssRsrq = jx6.a(cellSignalStrengths.get(0)).getSsRsrq();
            return ssRsrq;
        }
        return Integer.MAX_VALUE;
    }

    public static int getNrSsSinr(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        int ssSinr;
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getNrSsSinr: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        cellSignalStrengths = signalStrength.getCellSignalStrengths(ix6.a());
        if (cellSignalStrengths.size() > 0) {
            ssSinr = jx6.a(cellSignalStrengths.get(0)).getSsSinr();
            return ssSinr;
        }
        return Integer.MAX_VALUE;
    }

    public static int getPrimaryNetworkType(Context context) {
        return groupNetworkType(getNetworkType(getNetworkInfo(context), context));
    }

    private static SignalStrength getSignalStrength(Context context) {
        int defaultDataSubscriptionId;
        TelephonyManager createForSubscriptionId;
        SignalStrength signalStrength;
        if (context != null && Build.VERSION.SDK_INT >= 28) {
            Object systemService = ContextCompat.getSystemService(context, "phone");
            if (systemService instanceof TelephonyManager) {
                defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
                createForSubscriptionId = ((TelephonyManager) systemService).createForSubscriptionId(defaultDataSubscriptionId);
                signalStrength = createForSubscriptionId.getSignalStrength();
                return signalStrength;
            }
            return null;
        }
        return null;
    }

    public static String getWifiGatewayIp(Context context) {
        if (context == null) {
            return " ";
        }
        Object systemService = ContextCompat.getSystemService(context.getApplicationContext(), "wifi");
        if (!(systemService instanceof WifiManager)) {
            return " ";
        }
        try {
            int i = ((WifiManager) systemService).getDhcpInfo().gateway;
            return InetAddress.getByAddress(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)}).getHostAddress();
        } catch (RuntimeException | UnknownHostException e) {
            String str = TAG;
            Logger.i(str, "getWifiGatewayIp error!" + e.getClass().getSimpleName() + e.getMessage());
            return " ";
        }
    }

    public static int getWifiRssi(Context context) {
        if (context == null) {
            return INVALID_RSSI;
        }
        Object systemService = ContextCompat.getSystemService(context.getApplicationContext(), "wifi");
        if (!(systemService instanceof WifiManager)) {
            return INVALID_RSSI;
        }
        try {
            WifiInfo connectionInfo = ((WifiManager) systemService).getConnectionInfo();
            if (connectionInfo == null || connectionInfo.getBSSID() == null) {
                return INVALID_RSSI;
            }
            return connectionInfo.getRssi();
        } catch (RuntimeException e) {
            String str = TAG;
            Logger.i(str, "getWifiRssiLevel did not has permission!" + e.getClass().getSimpleName() + e.getMessage());
            return INVALID_RSSI;
        }
    }

    public static int getWifiRssiLevel(Context context) {
        return WifiManager.calculateSignalLevel(getWifiRssi(context), 5);
    }

    private static int groupNetworkType(int i) {
        if (i == -1) {
            return -1;
        }
        if (i == 1) {
            return 1;
        }
        if (i != 2 && i != 3 && i != 4 && i != 5) {
            return 0;
        }
        return 6;
    }

    public static boolean isChangeToConnected(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        if ((networkInfo == null || !networkInfo.isConnected()) && networkInfo2.isConnected()) {
            Logger.v(TAG, "Find network state changed to connected");
            return true;
        }
        return false;
    }

    public static boolean isConnectTypeChange(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        if (networkInfo != null && networkInfo.isConnected() && networkInfo2.isConnected() && getPrimaryNetworkType(networkInfo) != getPrimaryNetworkType(networkInfo2)) {
            Logger.v(TAG, "Find activity network changed");
            return true;
        }
        return false;
    }

    @Deprecated
    public static boolean isForeground(Context context) {
        return ActivityUtil.isForeground(context);
    }

    public static boolean isNetworkAvailable(Context context) {
        if (!ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo networkInfo = getNetworkInfo(context);
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public static boolean isSimReady(Context context) {
        TelephonyManager telephonyManager;
        Object systemService = ContextCompat.getSystemService(context, "phone");
        if (systemService instanceof TelephonyManager) {
            telephonyManager = (TelephonyManager) systemService;
        } else {
            telephonyManager = null;
        }
        if (telephonyManager != null && telephonyManager.getSimState() == 5) {
            return true;
        }
        return false;
    }

    public static boolean isUserUnlocked(Context context) {
        UserManager userManager;
        boolean isUserUnlocked;
        if (Build.VERSION.SDK_INT >= 24 && (userManager = (UserManager) ContextCompat.getSystemService(context, "user")) != null) {
            try {
                isUserUnlocked = userManager.isUserUnlocked();
                return isUserUnlocked;
            } catch (RuntimeException e) {
                Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
                return true;
            }
        }
        return true;
    }

    public static int netWork(Context context) {
        int networkType = getNetworkType(context);
        String str = TAG;
        Logger.v(str, "newWorkType " + networkType);
        if (networkType == 4) {
            if (TextUtils.equals(STR_NSA, getNetWorkNSAorSA())) {
                return 7;
            }
            return networkType;
        } else if (networkType == 5 && TextUtils.equals(STR_SA, getNetWorkNSAorSA())) {
            return 8;
        } else {
            return networkType;
        }
    }

    @Deprecated
    public static NetworkInfo.DetailedState networkStatus(Context context) {
        return getNetworkStatus(context);
    }

    @SuppressLint({"MissingPermission"})
    public static int readDataSaverMode(Context context) {
        int i = 0;
        if (context != null && Build.VERSION.SDK_INT >= 24 && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            Object systemService = ContextCompat.getSystemService(context, "connectivity");
            if (systemService instanceof ConnectivityManager) {
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                try {
                    if (connectivityManager.isActiveNetworkMetered()) {
                        i = connectivityManager.getRestrictBackgroundStatus();
                    } else {
                        Logger.v(TAG, "ConnectType is not Mobile Network!");
                    }
                } catch (RuntimeException e) {
                    Logger.e(TAG, "SystemServer error:", e);
                }
            }
        }
        return i;
    }

    public static int getNetworkType(NetworkInfo networkInfo, Context context) {
        int i;
        if (networkInfo == null || !networkInfo.isConnected()) {
            return -1;
        }
        int type = networkInfo.getType();
        if (1 == type || 13 == type) {
            return 1;
        }
        if (type == 0) {
            int hwNetworkType = getHwNetworkType(context);
            String str = TAG;
            Logger.v(str, "getHwNetworkType return is: " + hwNetworkType);
            if (hwNetworkType == 0) {
                hwNetworkType = networkInfo.getSubtype();
            }
            if (hwNetworkType != 20) {
                switch (hwNetworkType) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        i = 2;
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        i = 3;
                        break;
                    case 13:
                        i = 4;
                        break;
                    default:
                        i = 0;
                        break;
                }
            } else {
                i = 5;
            }
            if (i != 0 || Build.VERSION.SDK_INT < 25) {
                return i;
            }
            if (hwNetworkType != 16) {
                return hwNetworkType != 17 ? 0 : 3;
            }
            return 2;
        }
        return 0;
    }

    public static int getPrimaryNetworkType(NetworkInfo networkInfo) {
        return groupNetworkType(getNetworkType(networkInfo));
    }

    public static int getNetworkType(NetworkInfo networkInfo) {
        return getNetworkType(networkInfo, null);
    }
}
