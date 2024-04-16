package defpackage;

import android.app.Person;
import android.graphics.drawable.Icon;
import androidx.annotation.NonNull;
import androidx.core.graphics.drawable.IconCompat;
/* compiled from: Person.java */
/* renamed from: xz7  reason: default package */
/* loaded from: classes.dex */
public class xz7 {
    CharSequence a;
    IconCompat b;
    String c;
    String d;
    boolean e;
    boolean f;

    /* compiled from: Person.java */
    /* renamed from: xz7$a */
    /* loaded from: classes.dex */
    static class a {
        static xz7 a(Person person) {
            IconCompat iconCompat;
            b f = new b().f(person.getName());
            if (person.getIcon() != null) {
                iconCompat = IconCompat.b(person.getIcon());
            } else {
                iconCompat = null;
            }
            return f.c(iconCompat).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        static Person b(xz7 xz7Var) {
            Icon icon;
            Person.Builder name = new Person.Builder().setName(xz7Var.c());
            if (xz7Var.a() != null) {
                icon = xz7Var.a().v();
            } else {
                icon = null;
            }
            return name.setIcon(icon).setUri(xz7Var.d()).setKey(xz7Var.b()).setBot(xz7Var.e()).setImportant(xz7Var.f()).build();
        }
    }

    /* compiled from: Person.java */
    /* renamed from: xz7$b */
    /* loaded from: classes.dex */
    public static class b {
        CharSequence a;
        IconCompat b;
        String c;
        String d;
        boolean e;
        boolean f;

        @NonNull
        public xz7 a() {
            return new xz7(this);
        }

        @NonNull
        public b b(boolean z) {
            this.e = z;
            return this;
        }

        @NonNull
        public b c(IconCompat iconCompat) {
            this.b = iconCompat;
            return this;
        }

        @NonNull
        public b d(boolean z) {
            this.f = z;
            return this;
        }

        @NonNull
        public b e(String str) {
            this.d = str;
            return this;
        }

        @NonNull
        public b f(CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        @NonNull
        public b g(String str) {
            this.c = str;
            return this;
        }
    }

    xz7(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
    }

    public IconCompat a() {
        return this.b;
    }

    public String b() {
        return this.d;
    }

    public CharSequence c() {
        return this.a;
    }

    public String d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    @NonNull
    public String g() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        if (this.a != null) {
            return "name:" + ((Object) this.a);
        }
        return "";
    }

    @NonNull
    public Person h() {
        return a.b(this);
    }
}
