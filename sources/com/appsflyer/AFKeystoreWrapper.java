package com.appsflyer;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import com.appsflyer.internal.AFa1dSDK;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;
/* loaded from: classes.dex */
public class AFKeystoreWrapper {
    public KeyStore AFInAppEventType;
    private Context values;
    public final Object valueOf = new Object();
    public String AFInAppEventParameterName = "";
    public int AFKeystoreWrapper = 0;

    public AFKeystoreWrapper(Context context) {
        this.values = context;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.AFInAppEventType = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    private static boolean AFInAppEventType(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final String AFInAppEventParameterName() {
        StringBuilder sb = new StringBuilder();
        sb.append("com.appsflyer,");
        synchronized (this.valueOf) {
            sb.append("KSAppsFlyerId=");
            sb.append(this.AFInAppEventParameterName);
            sb.append(",");
            sb.append("KSAppsFlyerRICounter=");
            sb.append(this.AFKeystoreWrapper);
        }
        return sb.toString();
    }

    public final boolean AFKeystoreWrapper() {
        boolean z;
        synchronized (this.valueOf) {
            try {
                KeyStore keyStore = this.AFInAppEventType;
                z = false;
                if (keyStore != null) {
                    Enumeration<String> aliases = keyStore.aliases();
                    while (true) {
                        if (!aliases.hasMoreElements()) {
                            break;
                        }
                        String nextElement = aliases.nextElement();
                        if (nextElement != null && AFInAppEventType(nextElement)) {
                            String[] split = nextElement.split(",");
                            if (split.length == 3) {
                                AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(nextElement));
                                z = true;
                                String[] split2 = split[1].trim().split(ContainerUtils.KEY_VALUE_DELIMITER);
                                String[] split3 = split[2].trim().split(ContainerUtils.KEY_VALUE_DELIMITER);
                                if (split2.length == 2 && split3.length == 2) {
                                    this.AFInAppEventParameterName = split2[1].trim();
                                    this.AFKeystoreWrapper = Integer.parseInt(split3[1].trim());
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final String valueOf() {
        String str;
        synchronized (this.valueOf) {
            str = this.AFInAppEventParameterName;
        }
        return str;
    }

    public final int AFInAppEventType() {
        int i;
        synchronized (this.valueOf) {
            i = this.AFKeystoreWrapper;
        }
        return i;
    }

    public final void AFKeystoreWrapper(String str) {
        AlgorithmParameterSpec build;
        KeyGenParameterSpec.Builder certificateSubject;
        KeyGenParameterSpec.Builder certificateSerialNumber;
        KeyGenParameterSpec.Builder certificateNotBefore;
        KeyGenParameterSpec.Builder certificateNotAfter;
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            synchronized (this.valueOf) {
                if (!this.AFInAppEventType.containsAlias(str)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        g.a();
                        certificateSubject = f.a(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer"));
                        certificateSerialNumber = certificateSubject.setCertificateSerialNumber(BigInteger.ONE);
                        certificateNotBefore = certificateSerialNumber.setCertificateNotBefore(calendar.getTime());
                        certificateNotAfter = certificateNotBefore.setCertificateNotAfter(calendar2.getTime());
                        build = certificateNotAfter.build();
                    } else {
                        build = !AFa1dSDK.values() ? new KeyPairGeneratorSpec.Builder(this.values).setAlias(str).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build() : null;
                    }
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    keyPairGenerator.initialize(build);
                    keyPairGenerator.generateKeyPair();
                } else {
                    AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Exception ");
            sb.append(th.getMessage());
            sb.append(" occurred");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }
}
