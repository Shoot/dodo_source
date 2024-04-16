package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import java.sql.Timestamp;
import java.util.Date;
/* compiled from: SqlTypesSupport.java */
/* loaded from: classes2.dex */
public final class a {
    public static final boolean a;
    public static final DefaultDateTypeAdapter.b<? extends Date> b;
    public static final DefaultDateTypeAdapter.b<? extends Date> c;
    public static final onb d;
    public static final onb e;
    public static final onb f;

    /* compiled from: SqlTypesSupport.java */
    /* renamed from: com.google.gson.internal.sql.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0247a extends DefaultDateTypeAdapter.b<java.sql.Date> {
        C0247a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
        /* renamed from: e */
        public java.sql.Date d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    /* compiled from: SqlTypesSupport.java */
    /* loaded from: classes2.dex */
    class b extends DefaultDateTypeAdapter.b<Timestamp> {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
        /* renamed from: e */
        public Timestamp d(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = new C0247a(java.sql.Date.class);
            c = new b(Timestamp.class);
            d = SqlDateTypeAdapter.b;
            e = SqlTimeTypeAdapter.b;
            f = SqlTimestampTypeAdapter.b;
            return;
        }
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
    }
}
