package com.google.gson.internal.bind;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* loaded from: classes2.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {
    private final b<T> a;
    private final List<DateFormat> b;

    private Date a(String str) {
        synchronized (this.b) {
            try {
                for (DateFormat dateFormat : this.b) {
                    try {
                        return dateFormat.parse(str);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return vs4.c(str, new ParsePosition(0));
                } catch (ParseException e) {
                    throw new JsonSyntaxException(str, e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public T read(yb5 yb5Var) throws IOException {
        if (yb5Var.N() == mc5.NULL) {
            yb5Var.H();
            return null;
        }
        return this.a.d(a(yb5Var.L()));
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c */
    public void write(dd5 dd5Var, Date date) throws IOException {
        if (date == null) {
            dd5Var.s();
            return;
        }
        synchronized (this.b) {
            dd5Var.T(this.b.get(0).format(date));
        }
    }

    public String toString() {
        DateFormat dateFormat = this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private DefaultDateTypeAdapter(b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = (b) defpackage.a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private DefaultDateTypeAdapter(b<T> bVar, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = (b) defpackage.a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (c95.e()) {
            arrayList.add(kg8.c(i, i2));
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b<T extends Date> {
        public static final b<Date> b = new a(Date.class);
        private final Class<T> a;

        /* JADX INFO: Access modifiers changed from: protected */
        public b(Class<T> cls) {
            this.a = cls;
        }

        private final onb c(DefaultDateTypeAdapter<T> defaultDateTypeAdapter) {
            return TypeAdapters.b(this.a, defaultDateTypeAdapter);
        }

        public final onb a(int i, int i2) {
            return c(new DefaultDateTypeAdapter<>(this, i, i2));
        }

        public final onb b(String str) {
            return c(new DefaultDateTypeAdapter<>(this, str));
        }

        protected abstract T d(Date date);

        /* loaded from: classes2.dex */
        class a extends b<Date> {
            a(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
            protected Date d(Date date) {
                return date;
            }
        }
    }
}
