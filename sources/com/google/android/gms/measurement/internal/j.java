package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
enum j {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    FAILSAFE('9');
    
    private final char a;

    j(char c) {
        this.a = c;
    }

    public static j i(char c) {
        j[] values;
        for (j jVar : values()) {
            if (jVar.a == c) {
                return jVar;
            }
        }
        return UNSET;
    }
}
