package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
/* loaded from: classes2.dex */
public final class NumberTypeAdapter extends TypeAdapter<Number> {
    private static final onb b = b(rhb.b);
    private final shb a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[mc5.values().length];
            a = iArr;
            try {
                iArr[mc5.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[mc5.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[mc5.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private NumberTypeAdapter(shb shbVar) {
        this.a = shbVar;
    }

    public static onb a(shb shbVar) {
        if (shbVar == rhb.b) {
            return b;
        }
        return b(shbVar);
    }

    private static onb b(shb shbVar) {
        return new onb() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // defpackage.onb
            public <T> TypeAdapter<T> b(Gson gson, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c */
    public Number read(yb5 yb5Var) throws IOException {
        mc5 N = yb5Var.N();
        int i = a.a[N.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new JsonSyntaxException("Expecting number, got: " + N);
            }
            return this.a.a(yb5Var);
        }
        yb5Var.H();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: d */
    public void write(dd5 dd5Var, Number number) throws IOException {
        dd5Var.S(number);
    }
}
