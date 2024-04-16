package defpackage;

import defpackage.tmb;
/* compiled from: JsonToken.java */
/* renamed from: nc5  reason: default package */
/* loaded from: classes2.dex */
public enum nc5 {
    NOT_AVAILABLE(null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME(null, 5),
    VALUE_EMBEDDED_OBJECT(null, 12),
    VALUE_STRING(null, 6),
    VALUE_NUMBER_INT(null, 7),
    VALUE_NUMBER_FLOAT(null, 8),
    VALUE_TRUE(tmb.h.TRUE_JSON_NAME, 9),
    VALUE_FALSE("false", 10),
    VALUE_NULL("null", 11);
    
    final String a;
    final char[] b;
    final byte[] c;
    final int d;
    final boolean e;
    final boolean f;
    final boolean g;
    final boolean h;
    final boolean i;

    nc5(String str, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (str == null) {
            this.a = null;
            this.b = null;
            this.c = null;
        } else {
            this.a = str;
            char[] charArray = str.toCharArray();
            this.b = charArray;
            int length = charArray.length;
            this.c = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                this.c[i2] = (byte) this.b[i2];
            }
        }
        this.d = i;
        if (i != 10 && i != 9) {
            z = false;
        } else {
            z = true;
        }
        this.h = z;
        if (i != 7 && i != 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.g = z2;
        if (i != 1 && i != 3) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.e = z3;
        if (i != 2 && i != 4) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f = z4;
        if (!z3 && !z4 && i != 5 && i != -1) {
            z5 = true;
        }
        this.i = z5;
    }
}
