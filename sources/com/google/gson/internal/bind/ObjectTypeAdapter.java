package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {
    private static final onb c = b(rhb.a);
    private final Gson a;
    private final shb b;

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[mc5.values().length];
            a = iArr;
            try {
                iArr[mc5.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[mc5.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[mc5.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[mc5.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[mc5.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[mc5.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static onb a(shb shbVar) {
        if (shbVar == rhb.a) {
            return c;
        }
        return b(shbVar);
    }

    private static onb b(final shb shbVar) {
        return new onb() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // defpackage.onb
            public <T> TypeAdapter<T> b(Gson gson, TypeToken<T> typeToken) {
                if (typeToken.getRawType() != Object.class) {
                    return null;
                }
                return new ObjectTypeAdapter(gson, shb.this);
            }
        };
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(yb5 yb5Var) throws IOException {
        switch (a.a[yb5Var.N().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                yb5Var.a();
                while (yb5Var.m()) {
                    arrayList.add(read(yb5Var));
                }
                yb5Var.j();
                return arrayList;
            case 2:
                rq5 rq5Var = new rq5();
                yb5Var.b();
                while (yb5Var.m()) {
                    rq5Var.put(yb5Var.y(), read(yb5Var));
                }
                yb5Var.k();
                return rq5Var;
            case 3:
                return yb5Var.L();
            case 4:
                return this.b.a(yb5Var);
            case 5:
                return Boolean.valueOf(yb5Var.r());
            case 6:
                yb5Var.H();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(dd5 dd5Var, Object obj) throws IOException {
        if (obj == null) {
            dd5Var.s();
            return;
        }
        TypeAdapter n = this.a.n(obj.getClass());
        if (n instanceof ObjectTypeAdapter) {
            dd5Var.e();
            dd5Var.k();
            return;
        }
        n.write(dd5Var, obj);
    }

    private ObjectTypeAdapter(Gson gson, shb shbVar) {
        this.a = gson;
        this.b = shbVar;
    }
}
