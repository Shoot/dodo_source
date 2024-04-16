package com.google.gson.internal;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class Excluder implements onb, Cloneable {
    public static final Excluder g = new Excluder();
    private boolean d;
    private double a = -1.0d;
    private int b = SyslogConstants.LOG_LOCAL1;
    private boolean c = true;
    private List<zl3> e = Collections.emptyList();
    private List<zl3> f = Collections.emptyList();

    private boolean e(Class<?> cls) {
        if (this.a != -1.0d && !n((ama) cls.getAnnotation(ama.class), (mrb) cls.getAnnotation(mrb.class))) {
            return true;
        }
        if ((!this.c && i(cls)) || h(cls)) {
            return true;
        }
        return false;
    }

    private boolean f(Class<?> cls, boolean z) {
        List<zl3> list;
        if (z) {
            list = this.e;
        } else {
            list = this.f;
        }
        for (zl3 zl3Var : list) {
            if (zl3Var.a(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean h(Class<?> cls) {
        if (!Enum.class.isAssignableFrom(cls) && !j(cls) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return true;
        }
        return false;
    }

    private boolean i(Class<?> cls) {
        if (cls.isMemberClass() && !j(cls)) {
            return true;
        }
        return false;
    }

    private boolean j(Class<?> cls) {
        if ((cls.getModifiers() & 8) != 0) {
            return true;
        }
        return false;
    }

    private boolean l(ama amaVar) {
        if (amaVar != null && amaVar.value() > this.a) {
            return false;
        }
        return true;
    }

    private boolean m(mrb mrbVar) {
        if (mrbVar != null && mrbVar.value() <= this.a) {
            return false;
        }
        return true;
    }

    private boolean n(ama amaVar, mrb mrbVar) {
        if (l(amaVar) && m(mrbVar)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.onb
    public <T> TypeAdapter<T> b(final Gson gson, final TypeToken<T> typeToken) {
        final boolean z;
        final boolean z2;
        Class<? super T> rawType = typeToken.getRawType();
        boolean e = e(rawType);
        if (!e && !f(rawType, true)) {
            z = false;
        } else {
            z = true;
        }
        if (!e && !f(rawType, false)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z && !z2) {
            return null;
        }
        return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1
            private TypeAdapter<T> a;

            private TypeAdapter<T> a() {
                TypeAdapter<T> typeAdapter = this.a;
                if (typeAdapter == null) {
                    TypeAdapter<T> o = gson.o(Excluder.this, typeToken);
                    this.a = o;
                    return o;
                }
                return typeAdapter;
            }

            @Override // com.google.gson.TypeAdapter
            public T read(yb5 yb5Var) throws IOException {
                if (z2) {
                    yb5Var.l0();
                    return null;
                }
                return a().read(yb5Var);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(dd5 dd5Var, T t) throws IOException {
                if (z) {
                    dd5Var.s();
                } else {
                    a().write(dd5Var, t);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public boolean d(Class<?> cls, boolean z) {
        if (!e(cls) && !f(cls, z)) {
            return false;
        }
        return true;
    }

    public boolean g(Field field, boolean z) {
        List<zl3> list;
        mn3 mn3Var;
        if ((this.b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.a != -1.0d && !n((ama) field.getAnnotation(ama.class), (mrb) field.getAnnotation(mrb.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.d && ((mn3Var = (mn3) field.getAnnotation(mn3.class)) == null || (!z ? !mn3Var.deserialize() : !mn3Var.serialize()))) {
            return true;
        }
        if ((!this.c && i(field.getType())) || h(field.getType())) {
            return true;
        }
        if (z) {
            list = this.e;
        } else {
            list = this.f;
        }
        if (!list.isEmpty()) {
            fs3 fs3Var = new fs3(field);
            for (zl3 zl3Var : list) {
                if (zl3Var.b(fs3Var)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
