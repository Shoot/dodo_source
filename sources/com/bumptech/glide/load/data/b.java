package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: DataRewinderRegistry.java */
/* loaded from: classes.dex */
public class b {
    private static final a.InterfaceC0099a<?> b = new a();
    private final Map<Class<?>, a.InterfaceC0099a<?>> a = new HashMap();

    /* compiled from: DataRewinderRegistry.java */
    /* loaded from: classes.dex */
    class a implements a.InterfaceC0099a<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0099a
        @NonNull
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0099a
        @NonNull
        public com.bumptech.glide.load.data.a<Object> b(@NonNull Object obj) {
            return new C0100b(obj);
        }
    }

    @NonNull
    public synchronized <T> com.bumptech.glide.load.data.a<T> a(@NonNull T t) {
        a.InterfaceC0099a<?> interfaceC0099a;
        try {
            eh8.d(t);
            interfaceC0099a = this.a.get(t.getClass());
            if (interfaceC0099a == null) {
                Iterator<a.InterfaceC0099a<?>> it = this.a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a.InterfaceC0099a<?> next = it.next();
                    if (next.a().isAssignableFrom(t.getClass())) {
                        interfaceC0099a = next;
                        break;
                    }
                }
            }
            if (interfaceC0099a == null) {
                interfaceC0099a = b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (com.bumptech.glide.load.data.a<T>) interfaceC0099a.b(t);
    }

    public synchronized void b(@NonNull a.InterfaceC0099a<?> interfaceC0099a) {
        this.a.put(interfaceC0099a.a(), interfaceC0099a);
    }

    /* compiled from: DataRewinderRegistry.java */
    /* renamed from: com.bumptech.glide.load.data.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0100b implements com.bumptech.glide.load.data.a<Object> {
        private final Object a;

        C0100b(@NonNull Object obj) {
            this.a = obj;
        }

        @Override // com.bumptech.glide.load.data.a
        @NonNull
        public Object a() {
            return this.a;
        }

        @Override // com.bumptech.glide.load.data.a
        public void b() {
        }
    }
}
