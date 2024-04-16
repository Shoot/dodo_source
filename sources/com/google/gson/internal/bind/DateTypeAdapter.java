package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* loaded from: classes2.dex */
public final class DateTypeAdapter extends TypeAdapter<Date> {
    public static final onb b = new onb() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // defpackage.onb
        public <T> TypeAdapter<T> b(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };
    private final List<DateFormat> a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (c95.e()) {
            arrayList.add(kg8.c(2, 2));
        }
    }

    private synchronized Date a(String str) {
        for (DateFormat dateFormat : this.a) {
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
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public Date read(yb5 yb5Var) throws IOException {
        if (yb5Var.N() == mc5.NULL) {
            yb5Var.H();
            return null;
        }
        return a(yb5Var.L());
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c */
    public synchronized void write(dd5 dd5Var, Date date) throws IOException {
        if (date == null) {
            dd5Var.s();
        } else {
            dd5Var.T(this.a.get(0).format(date));
        }
    }
}
