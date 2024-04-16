package com.google.android.gms.internal.gtm;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes2.dex */
public abstract class zzbs extends zzbr {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbs(zzbv zzbvVar) {
        super(zzbvVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzW() {
        if (zzY()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void zzX() {
        zzd();
        this.zza = true;
    }

    public final boolean zzY() {
        if (this.zza) {
            return true;
        }
        return false;
    }

    protected abstract void zzd();
}
