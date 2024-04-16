package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzbi extends zzbs {
    public static boolean zza;
    private AdvertisingIdClient.Info zzb;
    private final zzfo zzc;
    private String zzd;
    private boolean zze;
    private final Object zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbi(zzbv zzbvVar) {
        super(zzbvVar);
        this.zze = false;
        this.zzf = new Object();
        this.zzc = new zzfo(zzbvVar.zzr());
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0163, code lost:
        if (r0 == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038 A[Catch: all -> 0x001b, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0012, B:17:0x0032, B:21:0x003c, B:87:0x0165, B:24:0x0044, B:25:0x004e, B:88:0x0168, B:20:0x0038, B:12:0x001f, B:14:0x0023, B:16:0x002c, B:92:0x0179, B:26:0x004f, B:29:0x0054, B:31:0x006c, B:37:0x0085, B:38:0x008e, B:39:0x0093, B:45:0x009d, B:47:0x00b1, B:53:0x00c2, B:55:0x00d0, B:57:0x00db, B:58:0x00df, B:56:0x00d5, B:60:0x00e2, B:62:0x00ec, B:64:0x00f6, B:63:0x00f1, B:51:0x00bc, B:65:0x00fc, B:67:0x010a, B:69:0x0115, B:71:0x011f, B:73:0x0121, B:75:0x0129, B:77:0x012b, B:79:0x0133, B:80:0x0145, B:82:0x0153, B:84:0x015e, B:85:0x0162, B:83:0x0158, B:68:0x010f, B:46:0x00ac), top: B:104:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044 A[Catch: all -> 0x001b, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0012, B:17:0x0032, B:21:0x003c, B:87:0x0165, B:24:0x0044, B:25:0x004e, B:88:0x0168, B:20:0x0038, B:12:0x001f, B:14:0x0023, B:16:0x002c, B:92:0x0179, B:26:0x004f, B:29:0x0054, B:31:0x006c, B:37:0x0085, B:38:0x008e, B:39:0x0093, B:45:0x009d, B:47:0x00b1, B:53:0x00c2, B:55:0x00d0, B:57:0x00db, B:58:0x00df, B:56:0x00d5, B:60:0x00e2, B:62:0x00ec, B:64:0x00f6, B:63:0x00f1, B:51:0x00bc, B:65:0x00fc, B:67:0x010a, B:69:0x0115, B:71:0x011f, B:73:0x0121, B:75:0x0129, B:77:0x012b, B:79:0x0133, B:80:0x0145, B:82:0x0153, B:84:0x015e, B:85:0x0162, B:83:0x0158, B:68:0x010f, B:46:0x00ac), top: B:104:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzc() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbi.zzc():com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }

    private static String zze(String str) {
        MessageDigest zze = zzfs.zze("MD5");
        if (zze == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, zze.digest(str.getBytes())));
    }

    private final boolean zzf(String str) {
        try {
            String zze = zze(str);
            zzO("Storing hashed adid.");
            FileOutputStream openFileOutput = zzo().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(zze.getBytes());
            openFileOutput.close();
            this.zzd = zze;
            return true;
        } catch (IOException e) {
            zzK("Error creating hash file", e);
            return false;
        }
    }

    public final String zza() {
        String str;
        zzW();
        AdvertisingIdClient.Info zzc = zzc();
        if (zzc != null) {
            str = zzc.getId();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public final boolean zzb() {
        zzW();
        AdvertisingIdClient.Info zzc = zzc();
        if (zzc == null || zzc.isLimitAdTrackingEnabled()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
    }
}
