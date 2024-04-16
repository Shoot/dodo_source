package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
/* loaded from: classes2.dex */
class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {
    static final onb b = new onb() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // defpackage.onb
        public <T> TypeAdapter<T> b(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != Timestamp.class) {
                return null;
            }
            return new SqlTimestampTypeAdapter(gson.n(Date.class));
        }
    };
    private final TypeAdapter<Date> a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a */
    public Timestamp read(yb5 yb5Var) throws IOException {
        Date read = this.a.read(yb5Var);
        if (read != null) {
            return new Timestamp(read.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public void write(dd5 dd5Var, Timestamp timestamp) throws IOException {
        this.a.write(dd5Var, timestamp);
    }

    private SqlTimestampTypeAdapter(TypeAdapter<Date> typeAdapter) {
        this.a = typeAdapter;
    }
}
