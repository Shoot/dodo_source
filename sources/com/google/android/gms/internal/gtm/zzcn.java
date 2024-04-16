package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzcn extends zzbs {
    private volatile String zza;
    private Future<String> zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzcn(zzbv zzbvVar) {
        super(zzbvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzf() {
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        try {
            Context a = zzq().a();
            gh8.f(lowerCase);
            gh8.i("ClientId should be saved from worker thread");
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    zzP("Storing clientId", lowerCase);
                    fileOutputStream = a.openFileOutput("gaClientId", 0);
                    fileOutputStream.write(lowerCase.getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        zzK("Failed to close clientId writing stream", e);
                    }
                    return lowerCase;
                } catch (FileNotFoundException e2) {
                    zzK("Error creating clientId file", e2);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            e = e3;
                            zzK("Failed to close clientId writing stream", e);
                            return "0";
                        }
                    }
                    return "0";
                }
            } catch (IOException e4) {
                zzK("Error writing to clientId file", e4);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e5) {
                        e = e5;
                        zzK("Failed to close clientId writing stream", e);
                        return "0";
                    }
                }
                return "0";
            }
        } catch (Exception e6) {
            zzK("Error saving clientId file", e6);
            return "0";
        }
    }

    public final String zzb() {
        String str;
        zzW();
        synchronized (this) {
            try {
                if (this.zza == null) {
                    this.zzb = zzq().g(new zzcl(this));
                }
                Future<String> future = this.zzb;
                if (future != null) {
                    try {
                        this.zza = future.get();
                    } catch (InterruptedException e) {
                        zzS("ClientId loading or generation was interrupted", e);
                        this.zza = "0";
                    } catch (ExecutionException e2) {
                        zzK("Failed to load or generate client id", e2);
                        this.zza = "0";
                    }
                    if (this.zza == null) {
                        this.zza = "0";
                    }
                    zzP("Loaded clientId", this.zza);
                    this.zzb = null;
                }
                str = this.zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[Catch: IOException -> 0x0035, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0035, blocks: (B:8:0x0030, B:20:0x004f, B:35:0x007a, B:45:0x008d), top: B:51:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d A[Catch: IOException -> 0x0035, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0035, blocks: (B:8:0x0030, B:20:0x004f, B:35:0x007a, B:45:0x008d), top: B:51:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.IOException, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.internal.gtm.zzcn, com.google.android.gms.internal.gtm.zzbr] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0078 -> B:57:0x0090). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x007a -> B:50:0x0090). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x008d -> B:50:0x0090). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzc() {
        /*
            r9 = this;
            java.lang.String r0 = "gaClientId"
            java.lang.String r1 = "Failed to close client id reading stream"
            bad r2 = r9.zzq()
            android.content.Context r2 = r2.a()
            java.lang.String r3 = "ClientId should be loaded from worker thread"
            defpackage.gh8.i(r3)
            r3 = 0
            java.io.FileInputStream r4 = r2.openFileInput(r0)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.io.FileNotFoundException -> L89
            r5 = 36
            byte[] r6 = new byte[r5]     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c java.io.FileNotFoundException -> L3e
            r7 = 0
            int r5 = r4.read(r6, r7, r5)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c java.io.FileNotFoundException -> L3e
            int r8 = r4.available()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c java.io.FileNotFoundException -> L3e
            if (r8 <= 0) goto L40
            java.lang.String r5 = "clientId file seems corrupted, deleting it."
            r9.zzR(r5)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c java.io.FileNotFoundException -> L3e
            r4.close()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c java.io.FileNotFoundException -> L3e
            r2.deleteFile(r0)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c java.io.FileNotFoundException -> L3e
            r4.close()     // Catch: java.io.IOException -> L35
            goto L90
        L35:
            r0 = move-exception
            r9.zzK(r1, r0)
            goto L90
        L3a:
            r0 = move-exception
            goto L6a
        L3c:
            r5 = move-exception
            goto L70
        L3e:
            goto L8b
        L40:
            r8 = 14
            if (r5 >= r8) goto L53
            java.lang.String r5 = "clientId file is empty, deleting it."
            r9.zzR(r5)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c java.io.FileNotFoundException -> L3e
            r4.close()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c java.io.FileNotFoundException -> L3e
            r2.deleteFile(r0)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c java.io.FileNotFoundException -> L3e
            r4.close()     // Catch: java.io.IOException -> L35
            goto L90
        L53:
            r4.close()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c java.io.FileNotFoundException -> L3e
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c java.io.FileNotFoundException -> L3e
            r8.<init>(r6, r7, r5)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c java.io.FileNotFoundException -> L3e
            java.lang.String r5 = "Read client id from disk"
            r9.zzP(r5, r8)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c java.io.FileNotFoundException -> L3e
            r4.close()     // Catch: java.io.IOException -> L64
            goto L68
        L64:
            r0 = move-exception
            r9.zzK(r1, r0)
        L68:
            r3 = r8
            goto L90
        L6a:
            r3 = r4
            goto L7e
        L6c:
            r0 = move-exception
            goto L7e
        L6e:
            r5 = move-exception
            r4 = r3
        L70:
            java.lang.String r6 = "Error reading client id file, deleting it"
            r9.zzK(r6, r5)     // Catch: java.lang.Throwable -> L3a
            r2.deleteFile(r0)     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L90
            r4.close()     // Catch: java.io.IOException -> L35
            goto L90
        L7e:
            if (r3 == 0) goto L88
            r3.close()     // Catch: java.io.IOException -> L84
            goto L88
        L84:
            r2 = move-exception
            r9.zzK(r1, r2)
        L88:
            throw r0
        L89:
            r4 = r3
        L8b:
            if (r4 == 0) goto L90
            r4.close()     // Catch: java.io.IOException -> L35
        L90:
            if (r3 != 0) goto L97
            java.lang.String r0 = r9.zzf()
            return r0
        L97:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcn.zzc():java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zze() {
        synchronized (this) {
            this.zza = null;
            this.zzb = zzq().g(new zzcm(this));
        }
        return zzb();
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
    }
}
