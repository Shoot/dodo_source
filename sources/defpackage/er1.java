package defpackage;

import androidx.annotation.NonNull;
/* compiled from: Constants.java */
/* renamed from: er1  reason: default package */
/* loaded from: classes2.dex */
public enum er1 {
    APP_START_TRACE_NAME("_as"),
    ON_CREATE_TRACE_NAME("_astui"),
    ON_START_TRACE_NAME("_astfd"),
    ON_RESUME_TRACE_NAME("_asti"),
    FOREGROUND_TRACE_NAME("_fs"),
    BACKGROUND_TRACE_NAME("_bs");
    
    private String a;

    er1(@NonNull String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.a;
    }
}
