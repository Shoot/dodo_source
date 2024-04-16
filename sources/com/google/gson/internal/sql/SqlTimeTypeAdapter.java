package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes2.dex */
final class SqlTimeTypeAdapter extends TypeAdapter<Time> {
    static final onb b = new onb() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // defpackage.onb
        public <T> TypeAdapter<T> b(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != Time.class) {
                return null;
            }
            return new SqlTimeTypeAdapter();
        }
    };
    private final DateFormat a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a */
    public synchronized Time read(yb5 yb5Var) throws IOException {
        if (yb5Var.N() == mc5.NULL) {
            yb5Var.H();
            return null;
        }
        try {
            return new Time(this.a.parse(yb5Var.L()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public synchronized void write(dd5 dd5Var, Time time) throws IOException {
        String format;
        if (time == null) {
            format = null;
        } else {
            format = this.a.format((Date) time);
        }
        dd5Var.T(format);
    }

    private SqlTimeTypeAdapter() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }
}
