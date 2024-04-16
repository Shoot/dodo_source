package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/* loaded from: classes2.dex */
final class SqlDateTypeAdapter extends TypeAdapter<Date> {
    static final onb b = new onb() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // defpackage.onb
        public <T> TypeAdapter<T> b(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != Date.class) {
                return null;
            }
            return new SqlDateTypeAdapter();
        }
    };
    private final DateFormat a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a */
    public synchronized Date read(yb5 yb5Var) throws IOException {
        if (yb5Var.N() == mc5.NULL) {
            yb5Var.H();
            return null;
        }
        try {
            return new Date(this.a.parse(yb5Var.L()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public synchronized void write(dd5 dd5Var, Date date) throws IOException {
        String format;
        if (date == null) {
            format = null;
        } else {
            format = this.a.format((java.util.Date) date);
        }
        dd5Var.T(format);
    }

    private SqlDateTypeAdapter() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }
}
