package com.google.android.gms.internal.gtm;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import ch.qos.logback.classic.spi.CallerData;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzfe extends zzbs {
    private static final byte[] zza = "\n".getBytes();
    private final String zzb;
    private final zzfo zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfe(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzb = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", zzbt.zza, Build.VERSION.RELEASE, zzfs.zzd(Locale.getDefault()), Build.MODEL, Build.ID);
        this.zzc = new zzfo(zzbvVar.zzr());
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzg(java.net.URL r6, byte[] r7) {
        /*
            r5 = this;
            java.lang.String r0 = "Error closing http post connection output stream"
            defpackage.gh8.j(r6)
            defpackage.gh8.j(r7)
            int r1 = r7.length
            java.lang.String r2 = "POST bytes, url"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r5.zzH(r2, r3, r6)
            boolean r2 = com.google.android.gms.internal.gtm.zzbr.zzV()
            if (r2 == 0) goto L22
            java.lang.String r2 = new java.lang.String
            r2.<init>(r7)
            java.lang.String r3 = "Post payload\n"
            r5.zzP(r3, r2)
        L22:
            r2 = 0
            android.content.Context r3 = r5.zzo()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
            r3.getPackageName()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
            java.net.HttpURLConnection r6 = r5.zzb(r6)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
            r3 = 1
            r6.setDoOutput(r3)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r6.setFixedLengthStreamingMode(r1)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r6.connect()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            java.io.OutputStream r2 = r6.getOutputStream()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r2.write(r7)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r5.zzk(r6)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            int r7 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r1 = 200(0xc8, float:2.8E-43)
            if (r7 != r1) goto L58
            com.google.android.gms.internal.gtm.zzbq r7 = r5.zzs()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r7.zzi()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r7 = 200(0xc8, float:2.8E-43)
            goto L58
        L54:
            r7 = move-exception
            goto L94
        L56:
            r7 = move-exception
            goto L6d
        L58:
            java.lang.String r1 = "POST status"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r5.zzG(r1, r3)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r2.close()     // Catch: java.io.IOException -> L65
            goto L69
        L65:
            r1 = move-exception
            r5.zzK(r0, r1)
        L69:
            r6.disconnect()
            return r7
        L6d:
            r4 = r2
            r2 = r6
            r6 = r4
            goto L7a
        L71:
            r6 = move-exception
            r7 = r6
            goto L77
        L74:
            r6 = move-exception
            r7 = r6
            goto L79
        L77:
            r6 = r2
            goto L94
        L79:
            r6 = r2
        L7a:
            java.lang.String r1 = "Network POST connection error"
            r5.zzS(r1, r7)     // Catch: java.lang.Throwable -> L90
            if (r6 == 0) goto L89
            r6.close()     // Catch: java.io.IOException -> L85
            goto L89
        L85:
            r6 = move-exception
            r5.zzK(r0, r6)
        L89:
            if (r2 == 0) goto L8e
            r2.disconnect()
        L8e:
            r6 = 0
            return r6
        L90:
            r7 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
        L94:
            if (r2 == 0) goto L9e
            r2.close()     // Catch: java.io.IOException -> L9a
            goto L9e
        L9a:
            r1 = move-exception
            r5.zzK(r0, r1)
        L9e:
            if (r6 == 0) goto La3
            r6.disconnect()
        La3:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfe.zzg(java.net.URL, byte[]):int");
    }

    private final URL zzh() {
        String str;
        zzw();
        String zzi = zzct.zzi();
        zzw();
        String zzb = zzeu.zzt.zzb();
        if (zzb.length() != 0) {
            str = zzi.concat(zzb);
        } else {
            str = new String(zzi);
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            zzK("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzi(zzex zzexVar) {
        String str;
        String concat;
        if (zzexVar.zzh()) {
            zzw();
            String zzi = zzct.zzi();
            zzw();
            String zzj = zzct.zzj();
            if (zzj.length() != 0) {
                concat = zzi.concat(zzj);
            } else {
                str = new String(zzi);
                concat = str;
            }
        } else {
            zzw();
            String zzk = zzct.zzk();
            zzw();
            String zzj2 = zzct.zzj();
            if (zzj2.length() != 0) {
                concat = zzk.concat(zzj2);
            } else {
                str = new String(zzk);
                concat = str;
            }
        }
        try {
            return new URL(concat);
        } catch (MalformedURLException e) {
            zzK("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzj(zzex zzexVar, String str) {
        String sb;
        if (zzexVar.zzh()) {
            zzw();
            String zzi = zzct.zzi();
            zzw();
            String zzj = zzct.zzj();
            int length = zzi.length();
            StringBuilder sb2 = new StringBuilder(length + 1 + zzj.length() + str.length());
            sb2.append(zzi);
            sb2.append(zzj);
            sb2.append(CallerData.NA);
            sb2.append(str);
            sb = sb2.toString();
        } else {
            zzw();
            String zzk = zzct.zzk();
            zzw();
            String zzj2 = zzct.zzj();
            int length2 = zzk.length();
            StringBuilder sb3 = new StringBuilder(length2 + 1 + zzj2.length() + str.length());
            sb3.append(zzk);
            sb3.append(zzj2);
            sb3.append(CallerData.NA);
            sb3.append(str);
            sb = sb3.toString();
        }
        try {
            return new URL(sb);
        } catch (MalformedURLException e) {
            zzK("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final void zzk(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                do {
                } while (inputStream.read(new byte[1024]) > 0);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzK("Error closing http connection input stream", e);
                }
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        zzK("Error closing http connection input stream", e2);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    private static final void zzl(StringBuilder sb, String str, String str2) throws UnsupportedEncodingException {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zza(zzex zzexVar, boolean z) {
        String valueOf;
        gh8.j(zzexVar);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : zzexVar.zzg().entrySet()) {
                String key = entry.getKey();
                if (!"ht".equals(key) && !"qt".equals(key) && !"AppUID".equals(key) && !"z".equals(key) && !"_gmsv".equals(key)) {
                    zzl(sb, key, entry.getValue());
                }
            }
            zzl(sb, "ht", String.valueOf(zzexVar.zzd()));
            zzl(sb, "qt", String.valueOf(zzC().currentTimeMillis() - zzexVar.zzd()));
            zzw();
            if (z) {
                long zzc = zzexVar.zzc();
                if (zzc != 0) {
                    valueOf = String.valueOf(zzc);
                } else {
                    valueOf = String.valueOf(zzexVar.zzb());
                }
                zzl(sb, "z", valueOf);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            zzK("Failed to encode name or value", e);
            return null;
        }
    }

    final HttpURLConnection zzb(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzw();
            httpURLConnection.setConnectTimeout(zzeu.zzE.zzb().intValue());
            zzw();
            httpURLConnection.setReadTimeout(zzeu.zzF.zzb().intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.zzb);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0332 A[EDGE_INSN: B:186:0x0332->B:162:0x0332 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.Long> zzc(java.util.List<com.google.android.gms.internal.gtm.zzex> r20) {
        /*
            Method dump skipped, instructions count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfe.zzc(java.util.List):java.util.List");
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        zzP("Network initialized. User agent", this.zzb);
    }

    public final boolean zze() {
        NetworkInfo networkInfo;
        bad.h();
        zzW();
        try {
            networkInfo = ((ConnectivityManager) zzo().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        zzO("No network connectivity");
        return false;
    }
}
